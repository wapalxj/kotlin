package xx.c1_5_thread.forkjoin.sum;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\r\u0010\u000e\u001a\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lxx/c1_5_thread/forkjoin/sum/SumTask;", "Ljava/util/concurrent/RecursiveTask;", "", "src", "", "fromIndex", "", "toIndex", "([III)V", "getFromIndex", "()I", "getSrc", "()[I", "getToIndex", "compute", "()Ljava/lang/Long;", "Companion", "c2_datatype"})
public final class SumTask extends java.util.concurrent.RecursiveTask<java.lang.Long> {
    @org.jetbrains.annotations.NotNull()
    private final int[] src = null;
    private final int fromIndex = 0;
    private final int toIndex = 0;
    public static final int THRESHOLD = 400;
    public static final xx.c1_5_thread.forkjoin.sum.SumTask.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.Long compute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final int[] getSrc() {
        return null;
    }
    
    public final int getFromIndex() {
        return 0;
    }
    
    public final int getToIndex() {
        return 0;
    }
    
    public SumTask(@org.jetbrains.annotations.NotNull()
    int[] src, int fromIndex, int toIndex) {
        super();
    }
    
    public SumTask() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lxx/c1_5_thread/forkjoin/sum/SumTask$Companion;", "", "()V", "THRESHOLD", "", "c2_datatype"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}