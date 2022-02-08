package xx.c1_5_thread.cn.enjoyedu.concurrent.theory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com
 * <p>
 * 类说明：简单的程序会有线程安全问题吗？
 */
public class SimplOper {

    private volatile long count = 0;//计数器



    //count进行累加
//    public void incCount() {
//        synchronized (this){
//            count = count + 1;//count++;
//            throw new RuntimeException("rrrrrrrr");
//        }
//    }


//    public synchronized void incCount() {
//        count = count + 1;//count++;
//    }


    //count进行累加
    public void incCount() {
        synchronized (this){
            count = count + 1;//count++;
        }
    }


    //进行累加的线程
    private static class Count extends Thread {

        private SimplOper simplOper;

        public Count(SimplOper simplOper) {
            this.simplOper = simplOper;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                //加10000
                try {
                    simplOper.incCount();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("eeeeeeeeeeeeeeee");//=20000？

                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimplOper simplOper = new SimplOper();
        //启动两个线程
        Count count1 = new Count(simplOper);
        Count count2 = new Count(simplOper);
        count1.start();
        count2.start();
        Thread.sleep(50);

        System.out.println(simplOper.count);//=20000？
    }

}
