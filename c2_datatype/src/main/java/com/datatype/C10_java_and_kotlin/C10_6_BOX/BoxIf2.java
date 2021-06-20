package com.datatype.C10_java_and_kotlin.C10_6_BOX;

import java.util.Map;

public interface BoxIf2 extends Map<Integer,String> {
    String get(int key);

    String get(Integer key);
}
