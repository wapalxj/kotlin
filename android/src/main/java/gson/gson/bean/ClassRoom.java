package gson.gson.bean;

public class ClassRoom {

    public  String roomName;
    public int number;

    public String toString() {
        return "[" + roomName + ":" + number + "]";
    }

    public static class User {
        public String name;
        public int age;
        public ClassRoom room;

        @Override
        public String toString() {
            return name + "->" + age + ":" + room;
        }
    }

}