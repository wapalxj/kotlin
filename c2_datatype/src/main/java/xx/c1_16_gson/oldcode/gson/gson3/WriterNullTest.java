package xx.c1_16_gson.oldcode.gson.gson3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import xx.c1_16_gson.oldcode.gson.gson2.typeadapter.StringAdapter;
import xx.c1_16_gson.oldcode.gson.gson3.bean.User;

import java.io.IOException;

public class WriterNullTest {
    public static void main(String[] args) throws IOException {

        String user = null;
        String srting = new Gson().toJson(user, User.class);
        System.out.println(srting);//null
        String userJ = null;
        user = new Gson().fromJson(userJ, String.class);
        System.out.println(user);//null


        GsonBuilder gsonBuilder=new GsonBuilder()
                .registerTypeAdapter(String.class,new StringAdapter());
                //处理String为空，则返回null
//                .registerTypeAdapter(String.class, new StringAdapter().nullSafe());

        Gson gson=gsonBuilder.create();
        srting=gson.toJson(user, String.class);
        System.out.println(srting);//"vvvvvvvvvvvvv"

        user = gson.fromJson(userJ, String.class);//userJ为null,直接返回null,不再走adapter
        System.out.println(user);//null,
    }
}
