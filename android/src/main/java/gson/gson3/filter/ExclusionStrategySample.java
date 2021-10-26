package gson.gson3.filter;

import com.google.gson.*;
import com.google.gson.annotations.Expose;
import gson.gson3.bean.Result;

import java.lang.reflect.Type;

public class ExclusionStrategySample {

    public static void main(String[] args) {
//        testExclusionStrategy();

        //long的序列化策略
//        testLongSerializationPolicy();

        //实例创建
        testInstanceCreator();
    }
    //排除字段
    public static void testExclusionStrategy() {
        Gson gson = new GsonBuilder()
                .addSerializationExclusionStrategy(new ExclusionStrategy() {
                    @Override
                    public boolean shouldSkipField(FieldAttributes f) {
                        // 这里作判断，决定要不要排除该字段,return true为排除
                        if ("finalField".equals(f.getName())) {
                            //按字段名排除
                            return true;
                        }
                        Expose expose = f.getAnnotation(Expose.class);
                        if (expose != null && expose.deserialize() == false) {
                            return true; //按注解排除
                        }
                        return false;
                    }

                    @Override
                    public boolean shouldSkipClass(Class<?> clazz) {
                        // 直接排除某个类 ，return true为排除
                        return (clazz == int.class || clazz == Integer.class);
                    }
                })
                .create();

        System.out.println(gson.toJson(new ModifierSample()));
    }


    public static void testLongSerializationPolicy() {
        Gson gson = new GsonBuilder()
                .setLongSerializationPolicy(LongSerializationPolicy.STRING)
                .create();

        long l=123456;
        String jsonL=gson.toJson(l);
        System.out.println(jsonL);
    }

    //实例创建
    public static void testInstanceCreator() {
        String json = "{\"msg\":\"failed\",\"code\":\"20\"}";
        Gson gson = new GsonBuilder()
                //自定义创建实例
                .registerTypeAdapter(Result.class, new InstanceCreator<Result>() {
                    @Override
                    public Result createInstance(Type type) {
                        return new Result(null,-1);
                    }
                })
                .create();
        Result result=gson.fromJson(json,Result.class);
        System.out.println(result.msg);
        System.out.println(result.code);
    }
}
