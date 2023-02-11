package test.followme;

import io.reactivex.rxjava3.annotations.NonNull;

import java.math.BigDecimal;

import static test.followme.DoubleUtil.formatDecimal;

public class Testnull {
    public static void main(String[] args) {
        String str=null;
        boolean isString=null instanceof String;
        System.out.println(isString);
        System.out.println("=================================");
    }
}
