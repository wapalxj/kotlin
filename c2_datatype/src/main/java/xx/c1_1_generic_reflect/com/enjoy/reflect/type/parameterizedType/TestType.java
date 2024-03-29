package xx.c1_1_generic_reflect.com.enjoy.reflect.type.parameterizedType;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * ParameterizedType
 * 具体的泛型类型, 如Map<String, String>
 * 有如下方法:
 * <p>
 * Type getRawType(): 返回承载该泛型信息的对象, 如上面那个Map<String, String>承载范型信息的对象是Map
 * Type[] getActualTypeArguments(): 返回实际泛型类型列表, 如上面那个Map<String, String>实际范型列表中有两个元素, 都是String
 */
public class TestType {
    Map<String, String> map;

    public static void main(String[] args) throws Exception {
//        Field f = TestType.class.getDeclaredField("map");
//        System.out.println("f.getGenericType()=="+f.getGenericType());                               // java.util.Map<java.lang.String, java.lang.String>
//        ParameterizedType pType = (ParameterizedType) f.getGenericType();
//        System.out.println("pType.getRawType()=="+pType.getRawType());                               // interface java.util.Map
//        for (Type type : pType.getActualTypeArguments()) {
//            System.out.println(type);                                         // 打印两遍: class java.lang.String
//        }



        new TypeToken<Map<String,Integer>>(){};
    }
}
