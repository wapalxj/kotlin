package xx.c1_5_thread._12_pool;

import java.util.Comparator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 */
public class blockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        PriorityBlockingQueue<MyC> queue=new PriorityBlockingQueue<MyC>(100,new Comparator<MyC>(){

            @Override
            public int compare(MyC o1, MyC o2) {
                return 0;
            }
        });
        queue.put(new MyC());

        LinkedBlockingDeque<String> stringQueue=new LinkedBlockingDeque<>();
        stringQueue.put("vvvvv");
        stringQueue.take();
    }

    static class MyC{

    }

}
