package gson.gson3.bean;

import com.google.gson.annotations.Expose;

import java.util.List;

public class User {
    @Expose(serialize = false, deserialize = false)//都不
    public String name;

    @Expose(serialize = true, deserialize = true)//都
    public int age;

    @Expose//都
    public String email;

    //都不
    public List<String> datas;


    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", datas=" + datas +
                '}';
    }
}