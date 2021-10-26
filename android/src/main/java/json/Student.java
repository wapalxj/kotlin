package json;

/**
 * Created by wapal on 2017/8/10.
 */
public class Student {
    String name;
    Integer age;
    Integer day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Student(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[name="+name+",age="+age;

    }
}
