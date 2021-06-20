package com.datatype.C4_oop.C4_8_extend;

public class useExtendsInJava {

    public static void main(String[] args) {
        //调用扩展方法
        System.out.println(ExtendsKt.times("abc", 10));

        //调用扩展属性
        ExtendsKt.getA("vero");
    }
}
