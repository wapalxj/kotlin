package xx.c1_5_thread.intterupt;

import java.util.concurrent.TimeUnit;

/**
 * 验证：synchronized上等待的线程不触发中断
 *
 * 获取到锁后再触发(sleep()/wait()/join())可以响应中断
 */
public class SynchronizedBlocked implements Runnable {

    public synchronized void f() {
        System.out.println("Trying to call f()===="+Thread.currentThread().getName());

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("call f() end========="+Thread.currentThread().getName());
    }

    /**
     * 在构造器中创建新线程并启动获取对象锁
     */
    public SynchronizedBlocked() {
        // 该线程已持有当前实例锁
        new Thread() {
            public void run() {
                System.out.println("Thread run()");
                f(); // 先让第一个线程拿到锁,下面run()则进入等待，此时不响应中断
                     // 10秒后这里执行完成，释放锁，下面的run()进入，sleep触发中断
            }
        }.start();
    }

    public void run() {
        // 中断判断
        System.out.println("SynchronizedBlocked run()");
//        while (true) {
            if (Thread.interrupted()) {
                System.out.println("中断线程!!");
//                break;
            } else {
                f();
            }
//        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlocked sync = new SynchronizedBlocked();
        Thread t = new Thread(sync);
        TimeUnit.SECONDS.sleep(1);
        // 启动后调用f()方法,无法获取当前实例锁处于等待状态
        t.start();
        TimeUnit.SECONDS.sleep(1);
        //中断线程,等待锁时无法生效，获取到锁后再sleep可以生效
        System.out.println("interrupt()");
        t.interrupt();
    }
}
