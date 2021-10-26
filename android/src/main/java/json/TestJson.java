package json;


import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;

/**
 * Created by wapal on 2017/8/10.
 */
public class TestJson {
    public static void main(String[] args) {
//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("a","");
//        Integer a= (Integer) jsonObject.get("a");
//        System.out.println(a);

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "null");
        hashMap.put("age", "asdasd");
        JSONObject object = JSONObject.fromObject(hashMap);
        System.out.println(object);

//        JSONObject jsonObject=new JSONObject();
//        jsonObject.put("name","vero");
//        jsonObject.put("age",null);

        String jsons = "{\"name\":\"null\",\"age\":\"" + "ssss" + "\"}";
//        System.out.println(jsons);

        //注册自定义String的适配器
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(String.class, STRING);
        gsonBuilder.registerTypeAdapter(Integer.class, INTEGER);
//        gsonBuilder.registerTypeAdapter(Integer.class, new JsonDeserializer<Integer>() {
//            @Override
//            public Integer deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
//                try {
//                    return jsonElement.getAsInt();
//                }catch (Exception e){
//                    return -100;
//                }
//            }
//
//        });
        Gson gson = gsonBuilder.create();
        Student s = gson.fromJson(jsons, Student.class);
        System.out.println(s);
    }

    //自定义Strig适配器
    private static final TypeAdapter<String> STRING = new TypeAdapter<String>() {
        public String read(JsonReader reader) throws IOException {
            try {
                if (reader.peek() == JsonToken.NULL) {
                    System.out.println(11111111);
                    reader.nextNull();
                    return "";
                }
                System.out.println(222222222);
            } catch (Exception e) {
                e.printStackTrace();
                return "-1";
            }

            return reader.nextString();
        }

        public void write(JsonWriter writer, String value) throws IOException {
            if (value == null) {
                System.out.println(3333);
                // 在这里处理null改为空字符串
                writer.value("");
                return;
            }
            System.out.println(4444);
            writer.value(value);
        }
    };

    private static final TypeAdapter INTEGER = new TypeAdapter<Integer>() {
        public Integer read(JsonReader in) throws IOException {
            System.out.println(99999999);
            try {
                if (in.peek() == JsonToken.NULL) {
                    System.out.println(11111111);
                    in.nextNull();
                    return -1;
                }
                return in.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println(44444444);
                in.nextString();
                return -1;
            }


        }

        public void write(JsonWriter out, Integer value) throws IOException {
            if (value == null) {
                System.out.println(3333333);
                // 在这里处理null改为空字符串
                out.value(-1);
                return;
            }
            System.out.println(44444444);
            out.value(value);
        }
    };
}
