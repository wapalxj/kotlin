package gson.gson.type;

import com.google.gson.internal.$Gson$Types;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * https://www.jianshu.com/p/116c8878fd8d
 *
 * @param <T1>
 * @param <T2>
 */
public class TypeClazz<T1, T2 extends Number> {
    public int member0;
    public T2 member;                                   //TypeVariableImpl
    public T1 member2;                                  //TypeVariableImpl
    public Collection<? extends Number> collection;     //ParameterizedTypeImpl<WildcardTypeImpl>
    public Collection<T2> collection2;                  //ParameterizedTypeImpl<TypeVariableImpl>
    public Collection<String> collection3;
    public ArrayList<String> list;                      //ParameterizedTypeImpl<Class>
    public T2[] array;                                  //GenericArrayTypeImpl

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        try {
            Method m = list.getClass().getDeclaredMethod("add", new Class[]{Object.class});
            m.invoke(list, 1);
            m.invoke(list, 2);
        } catch (Exception e) {
            System.out.println("error");
        }
//        System.out.println(list.get(0));//error here


//       printTypeMember();
        new TypeClazz<String, Integer>() {
        }.print();
    }

    public static void printTypeMember() {
        for (int i = 0; i < TypeClazz.class.getFields().length; i++) {
            Field field = TypeClazz.class.getFields()[i];
            Type type = field.getGenericType();
            if (type instanceof Class) {
                //1.Class类文件
                System.out.println("非泛型:" + type.getTypeName());
            } else {
                //2.泛型类型
                System.out.println("接口是否是泛型类：" + (type instanceof ParameterizedType));
                System.out.println("泛型类的名称：" + type.getTypeName());
                System.out.println("泛型类的实现：" + type.getClass().getSimpleName());

                if (type instanceof ParameterizedType) {
                    Type parameterizedType = ((ParameterizedType) type).getActualTypeArguments()[0];
                    System.out.println("类型参数名称:" + ((ParameterizedType) type).getRawType());
                    System.out.println("泛型参数名称:" + parameterizedType.getTypeName());
                    System.out.println("泛型参数的实现：" + parameterizedType.getClass().getSimpleName());
                }

            }
            System.out.println("==========================================");
        }


//        Type type = ArrayList.class.getGenericInterfaces()[0];
//        System.out.println("接口是否是泛型类：" + (type instanceof ParameterizedType));
//        System.out.println("泛型类的名称：" + type.getTypeName());
//        System.out.println("泛型类的实现：" + type.getClass());
//        System.out.println("是否是泛型参数:"+(((ParameterizedType)ArrayList.class.getGenericInterfaces()[0]).getActualTypeArguments()[0] instanceof TypeVariable));
//        System.out.println("泛型参数名称:" + ((ParameterizedType) type).getActualTypeArguments()[0].getTypeName());
//        System.out.println("泛型参数的实现：" + ((ParameterizedType) type).getActualTypeArguments()[0].getClass());


    }

    public void print() {
        Type superclass = getClass().getGenericSuperclass();
        ParameterizedType parameterized = (ParameterizedType) superclass;
        for (int i = 0; i < parameterized.getActualTypeArguments().length; i++) {
            //获取泛型
            Type type = $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[i]);
            System.out.println(type);
        }
    }


}