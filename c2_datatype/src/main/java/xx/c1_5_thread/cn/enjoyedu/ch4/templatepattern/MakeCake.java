package xx.c1_5_thread.cn.enjoyedu.ch4.templatepattern;

/**
 * 类说明：生产蛋糕
 */
public class MakeCake {
    public static void main(String[] args) {
        AbstractCake cake = new CheeseCake();
        //AbstractCake cake = new CreamCake();
        //AbstractCake cake = new MouseCake();
        cake.run();

        AbstractCake smalCake = new SmallCake();
        smalCake.run();

    }
}
