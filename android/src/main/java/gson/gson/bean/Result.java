package gson.gson.bean;

public class Result<T> {
    int code;
    String message;
    T data;


    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}