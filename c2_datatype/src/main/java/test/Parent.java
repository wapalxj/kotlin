package test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

public class Parent {
    static List<String> strings=new ArrayList<>();
    public static void main(String[] args) throws MalformedURLException {
        String string ="xx.22";
//        System.out.println(string.split("\\.")[0]);
//        System.out.println(tableSizeFor(16));

        strings.add("sdsad111");
        strings.add("sdsad222");
        strings.add("sdsad333");
        strings.add("sdsad4444");

        List<String> strings2=strings;

        System.out.println(strings);



    }

    public static int tableSizeFor(int cap) {
        int n = cap - 1;//-1为了防止cap原本就是2的n次方，结果变大了，cap==16,不减1结果为32
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
    }
}
