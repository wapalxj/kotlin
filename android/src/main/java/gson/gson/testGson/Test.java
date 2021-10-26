package gson.gson.testGson;

import com.google.gson.Gson;
import gson.gson.bean.ClassRoom;
import gson.gson.bean.ClassRoom.*;

public class Test {


    public static void main(String[] args) {
        String strJson = "{" +
                "name:'david'," +
                "age:19," +
                "room:{roomName:'small',number:1}" +
                "}";
        System.out.println(deSerialization(strJson, User.class));


        ClassRoom classRoom = new ClassRoom();
        classRoom.number = 100;
        classRoom.roomName = "room";
        User user = new User();
        user.age = 10;
        user.name = "vwero";
        user.room = classRoom;

        System.out.println(serialization(user));
    }

    public static Object deSerialization(String json, Class z) {
        Gson gson = new Gson();
        return gson.fromJson(json, z);
    }

    public static String serialization(Object o) {
        Gson gson = new Gson();
        return gson.toJson(o);
    }
}