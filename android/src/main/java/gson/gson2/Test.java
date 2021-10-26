package gson.gson2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import gson.gson2.bean.BigBook;
import gson.gson2.bean.Book;
import gson.gson2.serialiser.BookDeserializer;
import gson.gson2.serialiser.BookSerialiser;
import gson.gson2.serialiser.IntegerJsonDeserializer;
import gson.gson2.typeadapter.BookTypeAdapter;
import gson.gson2.typeadapter.StringAdapter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://www.jianshu.com/p/fc5c9cdf3aab
 */
public class Test {
    public static void main(String[] args) {
//        deSerialization();
//        serialization();

//        readFromTxt();
        deSerializationWithTypeAdapter();
//        serializationWithTypeAdapter();

//        testPrimitive();
    }

    private static void testPrimitive() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Integer.class, new IntegerJsonDeserializer());
        gsonBuilder.registerTypeAdapter(int.class, new IntegerJsonDeserializer());

        int i = gsonBuilder.create().fromJson("100", int.class);
        System.out.println(i);

        //解析异常，则按Deserializer中返回
        i = gsonBuilder.create().fromJson("--ss", int.class);
        System.out.println(i);
    }

    private static void readFromTxt() {
        //从文件读取json
        GsonBuilder gsonBuilder = new GsonBuilder();
        //反序列化的key
        gsonBuilder.registerTypeAdapter(Book.class, new BookDeserializer());
        gsonBuilder.setPrettyPrinting();
        // The JSON data
        try (
                Reader reader = new InputStreamReader(Test.class.getResourceAsStream("/gson2/sample.json"), "UTF-8")) {

            // Parse JSON to Java
            Book book = gsonBuilder.create().fromJson(reader, Book.class);
            System.out.println(book);


        } catch (UnsupportedEncodingException e) {

        } catch (IOException e) {

        }


    }

    public static void deSerialization() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //反序列化的key
        gsonBuilder.registerTypeAdapter(Book.class, new BookDeserializer());
        gsonBuilder.registerTypeAdapter(Integer.class, new IntegerJsonDeserializer());
        gsonBuilder.registerTypeAdapter(int.class, new IntegerJsonDeserializer());
        gsonBuilder.setPrettyPrinting();
//        String json = "{" +
//                "\"title\": \"Java Puzzlers: Traps, Pitfalls, and Corner Cases\"," +
//                "  \"isbn-10\": \"032133678X\"," +
//                "  \"isbn-13\": \"978-0321336781\"," +
//                "  \"authors\": [" +
//                "    \"Joshua Bloch\"," +
//                "    \"Neal Gafter\"" +
//                "  ]" +
//                "}";

        String json = "{" +
                "\"title\": \"Java Puzzlers: Traps, Pitfalls, and Corner Cases\"," +
                "  \"isbn-10\": \"032133678X\"," +
                "  \"isbn-13\": \"978-0321336781\"," +
                "  \"age\": \"----\"," +
                "  \"authors\": [" +
                "    \"Joshua Bloch\"," +
                "    \"Neal Gafter\"" +
                "  ]" +
                "}";
        Book book = gsonBuilder.create().fromJson(json, Book.class);
        System.out.println(book);
    }

    public static void serialization() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //序列化的key
        gsonBuilder.registerTypeAdapter(Book.class, new BookSerialiser());
        gsonBuilder.setPrettyPrinting();
        BigBook bigBook = new BigBook();
        bigBook.setBigName("biggggggggg");

        final Book javaPuzzlers = new Book();
        javaPuzzlers.setTitle("Java Puzzlers: Traps, Pitfalls, and Corner Cases");
        javaPuzzlers.setIsbn10("032133678X");
        javaPuzzlers.setIsbn13("978-0321336781");
        javaPuzzlers.setAuthors(new String[]{"Joshua Bloch", "Neal Gafter"});

        bigBook.setBook(javaPuzzlers);
        final String json = gsonBuilder.create().toJson(bigBook);
        System.out.println(json);
    }

    public static void deSerializationWithTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //@JsonAdapters替代注册
        gsonBuilder.registerTypeAdapter(Book.class, new BookTypeAdapter());
        gsonBuilder.setPrettyPrinting();
        String json = "{" +
                "\"title\": \"Java Puzzlers: Traps, Pitfalls, and Corner Cases\"," +
                "  \"isbn-10\": \"032133678X\"," +
                "  \"authors\": [" +
                "    \"Joshua Bloch\"," +
                "    \"Neal Gafter\"" +
                "  ]," +
                "  \"isbn-13\": \"978-0321336781\"" +
                "}";
        Book book = gsonBuilder.create().fromJson(json, Book.class);
        System.out.println(book);
    }

    public static void serializationWithTypeAdapter() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //序列化的key
        gsonBuilder.registerTypeAdapter(Book.class, new BookTypeAdapter());
        gsonBuilder.setPrettyPrinting();

        final Book javaPuzzlers = new Book();
        javaPuzzlers.setTitle("Java Puzzlers: Traps, Pitfalls, and Corner Cases");
        javaPuzzlers.setIsbn10("032133678X");
        javaPuzzlers.setIsbn13("978-0321336781");
        javaPuzzlers.setAuthors(new String[]{"Joshua Bloch", "Neal Gafter"});
        final String json = gsonBuilder.create().toJson(javaPuzzlers);
        System.out.println(json);
    }


}