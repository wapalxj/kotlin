package disklru.utils;


import disklru.lru.DiskLruCache;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/**
 * 网络文件缓存
 */
public class DiskLrucacheUtils {

    /**
     * 获取图片（缓存中有则获取缓存图片，无则从网络上下载）
     */
//    public static <T> void downloadUrlBitMap(final Context context, final String url, final List<T> content,final int index,
//                                  final DiskLruCache mDiskLruCache) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    // 将数据写入缓存
//                    // 1.获取将要缓存的图片对应的唯一url
//                    LogUtils.e(context, "downloadUrlBitMap", "downloadUrlBitMap");
//                    String key = DiskLrucacheUtils.getCacheKey(url);
//                    if (!DiskLrucacheUtils.bmpIsExist(mDiskLruCache, key)) { //若缓存中不存在则需要从网络下载
//                        // 2.获取DiskLruCache的Editor
//                        DiskLruCache.Editor editor = mDiskLruCache.edit(key);
//                        if (editor != null) {
//                            // 3.从Editor中获取OutputStream
//                            OutputStream outputStream = editor.newOutputStream(index);
//                            // 4:下载网络图片且保存至DiskLruCache图片缓存
////                            boolean isSuccess = downloadBitmap(url, outputStream);
//                            boolean isSuccess = saveList(url,content, outputStream);
//                            if (isSuccess) {
//                                editor.commit();
//                            } else {
//                                editor.abort();
//                            }
//                            mDiskLruCache.flush();
//                        }
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }


    /**
     * 获得缓存目录，当sdcard存在的时候使用，sdcard缓存，如果sdcard不存在使用data/data下的缓存
     */
    public static File getDiskCacheDir(String dir) {
        String cachePath = "D:\\note\\mygithub\\work\\kotlin\\c2_datatype\\android\\lru_dir";
//        String cachePath = "G:\\GIT\\Java\\Java\\javaworkplace\\android\\lru_dir";
        File file = new File(cachePath + File.separator + dir);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /**
     * 将图片url进行md5加密生成字符串，因为有的url地址里面存在特殊字符(作为图片的缓存名称)
     */
    private static String getCacheKey(String urlStr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("md5");
        messageDigest.update(urlStr.getBytes());
        return byteToHexString(messageDigest.digest());
    }

    /**
     * 将指定byte数组转换成16进制字符串
     */
    public static String byteToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String hex = Integer.toHexString(0xFF & bytes[i]);
            if (hex.length() == 1) {
                sb.append('0');
            }
            sb.append(hex);
        }
        return sb.toString();
    }


    public static <T> T readDataCache(DiskLruCache mDiskLruCache, String url) {
        String key = null;
        T data = null;
        DiskLruCache.Snapshot snapShot = null;
        try {
            key = getCacheKey(url);
            snapShot = mDiskLruCache.get(key);
            if (snapShot != null) {
                InputStream is = snapShot.getInputStream(0);
                ObjectInputStream ois = new ObjectInputStream(is);
                data = (T) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (snapShot != null) {
                snapShot.close();
            }
        }
        return data;
    }

    /**
     * 存对象
     *
     * @param url
     * @param content
     * @param index
     * @param mDiskLruCache
     */
    public static void saveObject(final String url, final Object content, final int index,
                                  final DiskLruCache mDiskLruCache) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String key = null;
                try {
                    key = getCacheKey(url);
                    // 2.获取DiskLruCache的Editor
                    DiskLruCache.Editor editor = mDiskLruCache.edit(key);
                    if (editor != null) {
                        // 3.从Editor中获取OutputStream
                        OutputStream outputStream = editor.newOutputStream(index);
                        // 4:保存至DiskLruCache缓存
                        boolean isSuccess = saveObj(content, outputStream);
                        if (isSuccess) {
                            editor.commit();
                        } else {
                            editor.abort();
                        }
                        mDiskLruCache.flush();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

    //    public static <T> void saveCacheList(final Context context, final String url, final List<T> content, final int index,
//                                             final DiskLruCache mDiskLruCache) {
//        NetworkOperator.runOnThread(new Runnable() {
//            @Override
//            public void run() {
//                String key = null;
//                try {
//                    key = DiskLrucacheUtils.getCacheKey(url);
//                    // 2.获取DiskLruCache的Editor
//                    DiskLruCache.Editor editor = mDiskLruCache.edit(key);
//                    if (editor != null) {
//                        // 3.从Editor中获取OutputStream
//                        OutputStream outputStream = editor.newOutputStream(index);
//                        // 4:保存至DiskLruCache缓存
//                        boolean isSuccess = saveList(url, content, outputStream);
//                        if (isSuccess) {
//                            editor.commit();
//                        } else {
//                            editor.abort();
//                        }
//                        mDiskLruCache.flush();
//                    }
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//    }
//


    //    private static <T> boolean saveList(String url, List<T> content, OutputStream outputStream) {
//        ObjectOutputStream oos = null;
//        try {
//            oos = new ObjectOutputStream(outputStream);
//            oos.writeObject(content);//写入
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return true;
//    }
    private static boolean saveObj(Object content, OutputStream outputStream) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(outputStream);
            oos.writeObject(content);//写入
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
