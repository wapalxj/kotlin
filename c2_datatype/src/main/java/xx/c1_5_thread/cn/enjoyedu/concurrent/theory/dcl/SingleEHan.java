package xx.c1_5_thread.cn.enjoyedu.concurrent.theory.dcl;

/**
 * 饿汉式
 * 枚举
 */
public class SingleEHan {
    private SingleEHan(){}
    private static SingleEHan singleDcl = new SingleEHan();

}
