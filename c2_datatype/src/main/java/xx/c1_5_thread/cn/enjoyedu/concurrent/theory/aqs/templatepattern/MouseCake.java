package xx.c1_5_thread.cn.enjoyedu.concurrent.theory.aqs.templatepattern;

/**
 * 类说明：
 */
public class MouseCake extends AbstractCake {

    @Override
    protected void shape() {
        System.out.println("慕斯蛋糕造型");
    }

    @Override
    protected void apply() {
        System.out.println("慕斯蛋糕涂抹");
    }

    @Override
    protected void brake() {
        System.out.println("慕斯蛋糕烘焙");
    }
}
