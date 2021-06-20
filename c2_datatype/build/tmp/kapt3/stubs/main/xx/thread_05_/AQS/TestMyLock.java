package xx.thread_05_.AQS;

import java.lang.System;

/**
 * @author Mark老师   享学课堂 https://enjoy.ke.qq.com
 *
 * 类说明：
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0002\t\nB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lxx/thread_05_/AQS/TestMyLock;", "", "()V", "lock", "Ljava/util/concurrent/locks/Lock;", "getLock", "()Ljava/util/concurrent/locks/Lock;", "test", "", "Companion", "Worker", "c2_datatype"})
public final class TestMyLock {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.locks.Lock lock = null;
    public static final xx.thread_05_.AQS.TestMyLock.Companion Companion = null;
    
    public final void test() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.locks.Lock getLock() {
        return null;
    }
    
    public TestMyLock() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lxx/thread_05_/AQS/TestMyLock$Worker;", "Ljava/lang/Thread;", "(Lxx/thread_05_/AQS/TestMyLock;)V", "run", "", "c2_datatype"})
    public final class Worker extends java.lang.Thread {
        
        @java.lang.Override()
        public void run() {
        }
        
        public Worker() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lxx/thread_05_/AQS/TestMyLock$Companion;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "c2_datatype"})
    public static final class Companion {
        
        public final void main(@org.jetbrains.annotations.NotNull()
        java.lang.String[] args) {
        }
        
        private Companion() {
            super();
        }
    }
}