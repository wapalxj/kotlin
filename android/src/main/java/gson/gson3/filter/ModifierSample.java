package gson.gson3.filter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

//基于访问修饰符过滤字段序列化
public class ModifierSample {
    final String finalField = "final";
    static String staticField = "static";
    public String publicField = "public";
    protected String protectedField = "protected";
    String defaultField = "default";
    private String privateField = "private";

    public static void main(String[] args) {
        ModifierSample modifierSample = new ModifierSample();
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(
                        Modifier.FINAL,
                        Modifier.STATIC,
                        Modifier.PRIVATE)
                .create();
        System.out.println(gson.toJson(modifierSample));
        // 结果：{"publicField":"public","protectedField":"protected","defaultField":"default"}

    }
}
