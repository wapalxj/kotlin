package xx.c1_5_thread.intterupt;

import java.util.concurrent.TimeUnit;


/**
 * wait可响应中断
 * wait状态下执行interrupt()
 *  1.如果能拿到锁，则立即响应中断
 *  2.锁被别的线程拿了，则等待被唤醒后立即响应中断
 */
public class SynchronizedBlocked_wait implements Runnable {

    public synchronized void f() {
        System.out.println("Trying to call f()====" + Thread.currentThread().getName());

        try {
            System.out.println("Trying to call f()====wait()===" + Thread.currentThread().getName());
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("call f() end=========" + Thread.currentThread().getName());
    }

    public synchronized void f0() {
        System.out.println("Trying to call f0()");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("call f0() end=========");
        notifyAll();
    }

    public void sleep() {
        new Thread() {
            public void run() {
                System.out.println("Thread  run()");
                f0();
            }
        }.start();
    }

    public void run() {
        // 中断判断
        System.out.println("SynchronizedBlocked_wait run()");
        f();
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedBlocked_wait sync = new SynchronizedBlocked_wait();
        Thread t = new Thread(sync);
        t.start();
        TimeUnit.SECONDS.sleep(5);
        sync.sleep();//让第二个线程拿到锁
        TimeUnit.SECONDS.sleep(2);
        //中断第一个线程,wait没有拿到锁,不会立即响应，等到拿到锁时立即响应
        System.out.println("interrupt()");
        t.interrupt();
    }
}
