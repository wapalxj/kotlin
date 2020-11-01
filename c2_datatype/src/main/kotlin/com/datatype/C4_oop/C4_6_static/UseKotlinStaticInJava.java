package com.datatype.C4_oop.C4_6_static;

public class UseKotlinStaticInJava {
    public static void main(String[] args) {
        //引用 kotlin的static方法
        Latitude lat1=Latitude.Companion.ofDouble(22.2356);

        //引用 kotlin的static方法
        //带@JvmStatic
        Latitude lat2=Latitude.ofLatitude(lat1);

        //静态变量
        String tag=Latitude.TAG;
    }
}
