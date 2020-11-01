package com.datatype.C10_java_and_kotlin.C10_2_SAM;

import java.util.AbstractList;
import java.util.ArrayList;

public class SAMInJava {
    private ArrayList<Runnable> runnables=new ArrayList<>();

    protected void addTask(Runnable runnable){
        runnables.add(runnable);
        System.out.println("After add :"+runnable+",we hava "+runnables.size()+"in all.");
    }

    protected void removeTask(Runnable runnable){
        runnables.remove(runnable);
        System.out.println("After remove :"+runnable+",only "+runnables.size()+"in left.");
    }
}
