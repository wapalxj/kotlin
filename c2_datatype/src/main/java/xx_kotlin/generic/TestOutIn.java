package xx_kotlin.generic;

import java.util.ArrayList;
import java.util.List;

public class TestOutIn {

    ParentClass parentClass=new ParentClass();
    ChildClass mChildClass=new ChildClass();

    void test01(){
        //error
//        List<ParentClass> pClasses=new ArrayList<ChildClass>();
        List<? extends ParentClass> pClasses=new ArrayList<ChildClass>();

        //? extends ParentClass> 只能获取
        // 不能修改(null除外)
//        pClasses.add(parentClass);
//        pClasses.add(mChildClass);
        pClasses.add(null);

        //只能获取
        ParentClass parentClass=pClasses.get(0);


        //? super ChildClass 能修改
        //不能获取
        List<? super ChildClass> cClasses=new ArrayList<ParentClass>();
//        cClasses.add(parentClass);
        cClasses.add(mChildClass);

//        ChildClass childClass= cClasses.get(0);
    }
}




