package com.datatype.C10_java_and_kotlin.C10_3_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String source="vero ,vnix,010-12345678";
        String pattern=".*(\\d{3}-\\d{8}).*";
        Matcher matcher=Pattern.compile(pattern).matcher(source);
        while (matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
    }
}
