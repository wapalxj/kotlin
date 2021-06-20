package xx.thread_05_;

import java.lang.System;

/**
 * 类说明：使用Lock的范例
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lxx/thread_05_/LockCase;", "", "()V", "age", "", "getAge", "()I", "setAge", "(I)V", "lock", "Ljava/util/concurrent/locks/Lock;", "getLock", "()Ljava/util/concurrent/locks/Lock;", "test", "", "test2", "TestThread", "c2_datatype"})
public final class LockCase {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.locks.Lock lock = null;
    private int age;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.locks.Lock getLock() {
        return null;
    }
    
    public final int getAge() {
        return 0;
    }
    
    public final void setAge(int p0) {
    }
    
    public final void test() {
    }
    
    public final void test2() {
    }
    
    public LockCase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lxx/thread_05_/LockCase$TestThread;", "Ljava/lang/Thread;", "lockCase", "Lxx/thread_05_/LockCase;", "name", "", "(Lxx/thread_05_/LockCase;Ljava/lang/String;)V", "run", "", "c2_datatype"})
    public static final class TestThread extends java.lang.Thread {
        private final xx.thread_05_.LockCase lockCase = null;
        
        @java.lang.Override()
        public void run() {
        }
        
        public TestThread(@org.jetbrains.annotations.NotNull()
        xx.thread_05_.LockCase lockCase, @org.jetbrains.annotations.Nullable()
        java.lang.String name) {
            super();
        }
    }
}