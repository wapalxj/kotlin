package xx.rw;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u0017"}, d2 = {"Lxx/rw/UseRwLock;", "Lxx/rw/GoodsService;", "goodsInfo", "Lxx/rw/GoodsInfo;", "(Lxx/rw/GoodsInfo;)V", "getGoodsInfo", "()Lxx/rw/GoodsInfo;", "lock", "Ljava/util/concurrent/locks/ReadWriteLock;", "getLock", "()Ljava/util/concurrent/locks/ReadWriteLock;", "readLock", "Ljava/util/concurrent/locks/Lock;", "kotlin.jvm.PlatformType", "getReadLock", "()Ljava/util/concurrent/locks/Lock;", "writeLock", "getWriteLock", "getNum", "setNum", "", "number", "", "c2_datatype"})
public final class UseRwLock implements xx.rw.GoodsService {
    @org.jetbrains.annotations.NotNull()
    private final java.util.concurrent.locks.ReadWriteLock lock = null;
    private final java.util.concurrent.locks.Lock readLock = null;
    private final java.util.concurrent.locks.Lock writeLock = null;
    @org.jetbrains.annotations.NotNull()
    private final xx.rw.GoodsInfo goodsInfo = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.locks.ReadWriteLock getLock() {
        return null;
    }
    
    public final java.util.concurrent.locks.Lock getReadLock() {
        return null;
    }
    
    public final java.util.concurrent.locks.Lock getWriteLock() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public xx.rw.GoodsInfo getNum() {
        return null;
    }
    
    @java.lang.Override()
    public void setNum(int number) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final xx.rw.GoodsInfo getGoodsInfo() {
        return null;
    }
    
    public UseRwLock(@org.jetbrains.annotations.NotNull()
    xx.rw.GoodsInfo goodsInfo) {
        super();
    }
}