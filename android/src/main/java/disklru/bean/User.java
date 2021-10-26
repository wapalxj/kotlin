package disklru.bean;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 365866332949339145L;
    public String name;
    public int age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
