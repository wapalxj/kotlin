package xx.c1_16_gson.oldcode.xxgson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

public class TestGson {
    static class Bean {

        @SerializedName("iii")
        private int i;

        @Expose(deserialize = false)
        private String str;

        @Override
        public String toString() {
            return "Bean{" +
                    "i=" + i +
                    ", str='" + str + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
//        testBasic();
//        testExpose();
        testName();
    }

    public static void testExpose() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .setPrettyPrinting()
                .create();
        //bean
        Bean bean=new Bean();
        bean.i=18;
        bean.str="vero";
        String jStr=gson.toJson(bean);
        System.out.println("bean.toJson==" +jStr);

        Bean rBean=gson.fromJson(jStr,Bean.class);
        System.out.println("bean.fromJson==" +rBean);

    }

    public static void testName() {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        //bean
        Bean bean=new Bean();
        bean.i=18;
        bean.str="vero";
        String jStr=gson.toJson(bean);
        System.out.println("bean.toJson==" +jStr);

        Bean rBean=gson.fromJson(jStr,Bean.class);
        System.out.println("bean.fromJson==" +rBean);

    }

    public static void testBasic() {
        Gson gson = new Gson();
        System.out.println("1.toJson===" + gson.toJson(1));
        System.out.println("1.fromJson===" + gson.fromJson("1", int.class));

        System.out.println("vero.toJson==" + gson.toJson("vero"));

        int[] array = {1, 2, 3};
        System.out.println("{1,2,3}.toJson==" + gson.toJson(array));

        //bean
        Bean bean=new Bean();
        bean.i=18;
        bean.str="vero";
        String jStr=gson.toJson(bean);
        System.out.println("bean.toJson==" +jStr);

        Bean rBean=gson.fromJson(jStr,Bean.class);
        System.out.println("bean.fromJson==" +rBean);
    }

}
