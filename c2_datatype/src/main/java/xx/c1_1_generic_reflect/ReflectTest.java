package xx.c1_1_generic_reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ReflectTest {
    Map<String,Integer> map;
    Response<Long> res;

    public static void main(String[] args) throws NoSuchFieldException {
        Response res1= new Response<String>();
        Response res2= new Response<String>(){};

        Type type1= res1.getClass().getGenericSuperclass();
        ParameterizedType type2= (ParameterizedType) res2.getClass().getGenericSuperclass();

        Method method=null;
        System.out.println("======Response=======");
        System.out.println(type1);//Object
        System.out.println(type2.getActualTypeArguments()[0]);//String


        System.out.println("======Map=======");
        Map<String,Integer> map=new HashMap<String,Integer>();
        Map<String,Integer> map2=new HashMap<String,Integer>(){};
        System.out.println(map.getClass().getGenericSuperclass());//AbstractMap<K, V>
        System.out.println(map2.getClass().getGenericSuperclass());//ashMap<String,Integer>


        System.out.println("======Field=======");
        Field resField = ReflectTest.class.getDeclaredField("res");
        System.out.println(resField.getGenericType()); //ReflectTest$Response<java.lang.Long>
        Type typeRes=((ParameterizedType)resField.getGenericType()).getActualTypeArguments()[0];
        System.out.println(typeRes); //Long

        Field mapField = ReflectTest.class.getDeclaredField("map");
        System.out.println(mapField.getGenericType()); // java.util.Map<String,Integer>
        ParameterizedType pType = (ParameterizedType) mapField.getGenericType();
        System.out.println(pType.getRawType()); // interface java.util.Map
        for (Type type : pType.getActualTypeArguments()) {
            System.out.println(type);
        }

    }

    static class Response<T>{
        T data;
    }
}


