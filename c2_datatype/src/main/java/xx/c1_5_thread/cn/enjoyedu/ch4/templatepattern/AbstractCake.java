package xx.c1_5_thread.cn.enjoyedu.ch4.templatepattern;

/**
 * 类说明：抽象蛋糕模型
 */
public abstract class AbstractCake {
    protected abstract void shape();
    protected abstract void apply();
    protected abstract void brake();

    /*模板方法*/
    public final void run(){
        this.shape();
        this.apply();
        this.brake();
    }

    /*模板方法*/
    //TODO

    protected boolean shouldApply(){
        return true;
    }
}
