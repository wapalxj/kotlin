package test_hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * Created by Administrator on 2016/12/1.
 * MD5加密
 */
public class Test_hex {
    public static void main(String[] args) {


        String str="123456";
        System.out.println(str+"的16进制："+Integer.toHexString(Integer.valueOf(str)));
        System.out.println("未加密字节："+Arrays.toString(str.getBytes()));
        System.out.println("==============================");
        //进行2次MD5加密
        MD5Utils.md5(MD5Utils.md5(str));

    }
}
class MD5Utils {
    public static String md5(String str){
        StringBuilder mess=new StringBuilder();
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");

            System.out.println("加密字节："+Arrays.toString(md.digest(str.getBytes())));
            byte[] bytes=str.getBytes();
            byte[] digest=md.digest(bytes);

            for (byte b:digest) {
                System.out.print("加密后的字节："+b+",   ");
                //把每个字节信息转换成16进制数
                int d= b & 0xff;//只取低8位
                String hexString=Integer.toHexString(Integer.valueOf(d));
                if (hexString.length()==1){
                    hexString="0"+hexString;
                }
                mess.append(hexString);//每个字节对应的2位16进制数拼接
                System.out.println("取低八位后的"+d+"的16进制："+hexString);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println("最终加密结果:"+mess.toString());
        return mess.toString();
    }
}