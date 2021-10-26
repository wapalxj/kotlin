package gson.gson3;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import gson.gson2.serialiser.IntegerJsonDeserializer;
import gson.gson3.bean.User;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        test();
//        testPrimitive();

        //流式反序列化
//        testStreamDeSerialization();

        //流式序列化
        testStreamSerialization();

        //导出null值
//        testSerializeNulls();

//        testOther();

        //测试@Expose
//        testExposeSerialization();
//
        //POJO与JSON的字段映射规则
//        testNamingStrategy();

//        testTypeAdapter();

    }

    private static void test() {
        Gson gson = new Gson();
        int i = gson.fromJson("100", int.class);              //100
        double d = gson.fromJson("\"99.99\"", double.class);  //99.99
        boolean b = gson.fromJson("true", boolean.class);     // true
        String str = gson.fromJson("String", String.class);   // String

        System.out.println(i);
        System.out.println(d);
        System.out.println(b);
        System.out.println(str);

        System.out.println(gson.toJson(1));

        System.out.println(gson.toJson("vero"));

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


    /**
     * Gson.fromJson(Reader,Class);
     * Gson.fromJson(String,Class);
     * Gson.fromJson(Reader,Type);
     * Gson.fromJson(String,Type);
     * -------最终都是使用JsonReader来反序列化
     *
     * @throws IOException
     */
    //流式反序列化
    private static void testStreamDeSerialization() throws IOException {
        String json = "{\"name\":\"vvero\",\"age\":\"20\"}";
        User user = new User();
        JsonReader reader = new JsonReader(new StringReader(json));
        reader.beginObject(); // throws IOException
        while (reader.hasNext()) {
            String s = reader.nextName();
            switch (s) {
                case "name":
                    user.name = reader.nextString();
                    break;
                case "age":
                    user.age = reader.nextInt(); //自动转换
                    break;
                case "email":
                    user.email = reader.nextString();
                    break;
            }
        }
        reader.endObject(); // throws IOException
        System.out.println(user.name);  // 怪盗kidou
        System.out.println(user.age);   // 24
        System.out.println(user.email); // ikidou@example.com
    }

    /**
     * Gson.toJson()
     *
     * @throws IOException
     */
    //流式序列化
    private static void testStreamSerialization() throws IOException {
        //写到控制台
//        JsonWriter writer = new JsonWriter(new OutputStreamWriter(System.out));
//        writer.beginObject() // throws IOException
//                .name("name").value("vvvvero")
//                .name("age").value(24)
//                .name("email").nullValue() //演示null
//                .endObject(); // throws IOException
//        writer.flush(); // throws IOException
//        //{"name":"vvvvero","age":24,"email":null}


        //写到StringWriter
        StringWriter stringWriter = new StringWriter();
        JsonWriter writer = new JsonWriter(stringWriter);
        writer.beginObject() // throws IOException
                .name("name").value("vvvvero")
                .name("age").value(124)
                .name("email").nullValue() //演示null
                .endObject(); // throws IOException
        writer.flush(); // throws IOException

        System.out.println(stringWriter.toString());
    }


    //导出null值
    private static void testSerializeNulls() {
        Gson gson = new Gson();
        User user = new User("vero", 24);
        System.out.println(gson.toJson(user)); //{"name":"vero","age":24}

        gson = new GsonBuilder()
                .serializeNulls()//导出null值
                .create();
        System.out.println(gson.toJson(user)); //{"name":"vero","age":24,"email":null
    }

    //导出null值
    private static void testOther() {
        Gson gson = new GsonBuilder()
                //序列化null
                .serializeNulls()
                // 设置日期时间格式，另有2个重载方法
                // 在序列化和反序化时均生效
                .setDateFormat("yyyy-MM-dd HH:mm:ss")//"2018-11-27 15:06:34"
                // 禁此序列化内部类
                .disableInnerClassSerialization()
                //生成不可执行的Json（多了 )]}' 这4个字符）
//                .generateNonExecutableJson()
                //禁止转义html标签
                .disableHtmlEscaping()
                //格式化输出
                .setPrettyPrinting()
                .create();

        //序列化时间
        String str = gson.toJson(new Date());   // String
        System.out.println(str);

        //反序列化时间
        Date date = gson.fromJson(str, Date.class);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }


    //测试@Expose
    private static void testExposeSerialization() throws IOException {
        final GsonBuilder builder = new GsonBuilder();
        //@Expose设置生效
        builder.excludeFieldsWithoutExposeAnnotation();
        final Gson gson = builder.create();
        User user = new User();
        user.name = "cccc";
        user.age = 10;
        user.email = "xxxxxx";
        System.out.println(gson.toJson(user, User.class));
    }

    // POJO与JSON的字段映射规则
    private static void testNamingStrategy() throws IOException {
        final GsonBuilder builder = new GsonBuilder();

        //UPPER_CAMEL_CASE,大写CAMEL类型
        builder.setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE);
        final Gson gson = builder.create();
        User user = new User();
        user.name = "cccc";
        user.age = 10;
        user.email = "xxxxxx";

        String json = gson.toJson(user, User.class);
        System.out.println(json);

    }

    // TypeAdapter实例
    // 成功data是一个List,不成功的时候是String类型
    private static void testTypeAdapter() throws IOException {
        Gson gson = new GsonBuilder().registerTypeHierarchyAdapter(List.class, new JsonDeserializer<List<?>>() {
            @Override
            public List<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                if (json.isJsonArray()) {
                    //这里要自己负责解析了
                    Gson newGson = new Gson();
                    return newGson.fromJson(json, typeOfT);
                } else {
                    //和接口类型不符，返回空List
                    return Collections.EMPTY_LIST;
                }
            }
        }).create();

        String json1 = "{\"name\":\"cccc\",\"age\":10,\"email\":\"xxxxxx\",\"datas\":[\"vero\",\"vvvvv\",\"vnix\"]}";
        String json2 = "{\"name\":\"cccc\",\"age\":10,\"email\":\"xxxxxx\",\"datas\":\"nodata\"}";
        System.out.println(gson.fromJson(json1, User.class));
        System.out.println(gson.fromJson(json2, User.class));

    }


}