package xx.thread_04_CAS;

import java.lang.System;

/**
 * 类说明：演示带版本戳的原子操作类
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007\u00a2\u0006\u0002\u0010\u000fR(\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lxx/thread_04_CAS/UseAtomicStampedReference;", "", "()V", "asr", "Ljava/util/concurrent/atomic/AtomicStampedReference;", "", "kotlin.jvm.PlatformType", "getAsr", "()Ljava/util/concurrent/atomic/AtomicStampedReference;", "setAsr", "(Ljava/util/concurrent/atomic/AtomicStampedReference;)V", "main", "", "args", "", "([Ljava/lang/String;)V", "c2_datatype"})
public final class UseAtomicStampedReference {
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.atomic.AtomicStampedReference<java.lang.String> asr;
    public static final xx.thread_04_CAS.UseAtomicStampedReference INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicStampedReference<java.lang.String> getAsr() {
        return null;
    }
    
    public final void setAsr(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.atomic.AtomicStampedReference<java.lang.String> p0) {
    }
    
    public static final void main(@org.jetbrains.annotations.NotNull()
    java.lang.String[] args) throws java.lang.InterruptedException {
    }
    
    private UseAtomicStampedReference() {
        super();
    }
}