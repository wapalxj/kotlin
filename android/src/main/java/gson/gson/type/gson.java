package gson.gson.type;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Types;
import com.google.gson.reflect.TypeToken;
import gson.gson.bean.Result;

import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;


/**
 * TypeToken 进行封装
 */
public class gson {
    public static void main(String[] args) {
        // data 为 array 的情况
        String json1 = " {\"code\":\"0\",\"message\":\"success\",\"data\":\"veroooooo\"}";
        String json2 = " {\"code\":\"0\",\"message\":\"success\",\"data\":[\"vero\",\"vvvvv\",\"vnix\"]}";

//        Result<String> stringResult = fromJsonObject(new StringReader(json1), String.class);
//        Result<List<String>> listResult = fromJsonArray(new StringReader(json2), String.class);
//        System.out.println(stringResult);
//        System.out.println(listResult);


        System.out.println(fromJson(new StringReader(json1), new TypeWrapper<Result<String>>(){}));
        System.out.println(fromJson(new StringReader(json2), new TypeWrapper<Result<List<String>>>(){}));

//        Result<String> stringResult=fromJson(json1);
//        System.out.println(stringResult);



    }

    private static <T> Result<T> fromJsonObject(Reader reader, Class<T> clazz) {
        Type type = new ParameterizedTypeImpl(Result.class, new Class[]{clazz});
        return new Gson().fromJson(reader, type);
    }

    private static <T> Result<List<T>> fromJsonArray(Reader reader, Class<T> clazz) {
        // 生成List<T> 中的 List<T>
        Type listType = new ParameterizedTypeImpl(List.class, new Class[]{clazz});
        // 根据List<T>生成完整的Result<List<T>>
        Type type = new ParameterizedTypeImpl(Result.class, new Type[]{listType});
        return new Gson().fromJson(reader, type);
    }

    private static <T> T fromJson(Reader reader, TypeWrapper<T> wrapper) {
        return new Gson().fromJson(reader, wrapper.mType);
    }


    private abstract static class TypeWrapper<T> {
        Type mType;

        public TypeWrapper() {
            mType = getSuperclassTypeParameter(getClass());
        }

        static Type getSuperclassTypeParameter(Class<?> subclass) {
            Type superclass = subclass.getGenericSuperclass();
            System.out.println("superclass" + superclass.getClass().getSimpleName());
            if (superclass instanceof Class) {
                throw new RuntimeException("Missing type parameter.");
            }
            ParameterizedType parameterized = (ParameterizedType) superclass;
            return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
        }
    }

}