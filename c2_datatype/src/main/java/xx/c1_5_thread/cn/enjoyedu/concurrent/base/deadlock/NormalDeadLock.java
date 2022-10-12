package xx.c1_5_thread.cn.enjoyedu.concurrent.base.deadlock;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *@author Mark老师   享学课堂 https://enjoy.ke.qq.com 
 *
 *类说明：演示死锁的产生
 */
public class NormalDeadLock {

    private static Object No13 = new Object();//第一个锁
    private static Object No14 = new Object();//第二个锁

    //第一个拿锁的方法
    private static void jamesDo() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        synchronized (No13){
            System.out.println(threadName+" get nO13");
            Thread.sleep(100);
            synchronized (No14){
                System.out.println(threadName+" get nO14");
            }
        }
    }

    //第二个拿锁的方法
    private static void lisonDo() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        synchronized (No14){
            System.out.println(threadName+" get nO13");
            Thread.sleep(100);
            synchronized (No13){
                System.out.println(threadName+" get nO14");
            }
        }
    }

    //子线程，
    private static class Lance extends Thread{

        private String name;

        public Lance(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            Thread.currentThread().setName(name);
            try {
                jamesDo();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        //主线程
//        Thread.currentThread().setName("AV");
//        Lance lance = new Lance("Lance");
//        lance.start();
//        lisonDo();

        PriorityBlockingQueue<MyC> queue=new PriorityBlockingQueue<MyC>(100,new Comparator<MyC>(){

            @Override
            public int compare(MyC o1, MyC o2) {
                return 0;
            }
        });
        queue.put(new MyC());

        System.out.println(" get nO14");
    }

    static class MyC{

    }

}
