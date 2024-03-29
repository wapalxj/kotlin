package xx.c1_1_generic_reflect.com.enjoy.reflect.type.gson.a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class TypeRefrence<T> {
    Type type;
    T t;

    protected TypeRefrence() {
        //获得泛型类型
        Type genericSuperclass = getClass().getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //因为类泛型可以定义多个  A<T,E..> 所以是个数组
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        type = actualTypeArguments[0];

    }

    public Type getType() {

        return type;
    }
}
