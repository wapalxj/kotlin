package gson.gson2.bean;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import gson.gson2.typeadapter.BookTypeAdapter;

import java.util.Arrays;

//@JsonAdapter(BookSerialiser.class)//替代注册registerTypeAdapter
//@JsonAdapter(BookTypeAdapter.class)//替代注册registerTypeAdapter
public class Book {
    private String[] authors;
    //    @SerializedName("isbn-10")//对序列化和反序列化都有效
    private String isbn10;
    //    @SerializedName(value = "isbn-13", alternate = {"isbn13", "isbn.13"})//alternate只有反序列化才有效果
    private String isbn13;
    private String title;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + Arrays.toString(authors) +
                ", isbn10='" + isbn10 + '\'' +
                ", isbn13='" + isbn13 + '\'' +
                ", title='" + title + '\'' +
                ", age=" + age +
                '}';
    }
}