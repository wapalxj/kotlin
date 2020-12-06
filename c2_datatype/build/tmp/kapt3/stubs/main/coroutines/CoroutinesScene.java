package coroutines;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000f\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcoroutines/CoroutinesScene;", "", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "request1", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request2", "res", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "request3", "startScene1", "c2_datatype"})
public final class CoroutinesScene {
    public static final coroutines.CoroutinesScene INSTANCE = null;
    
    public static final void main(@org.jetbrains.annotations.NotNull()
    java.lang.String[] args) {
    }
    
    /**
     * 依次启动3个子线程，并且同步的方式拿到返回值
     */
    public final void startScene1() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object request1(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object request2(@org.jetbrains.annotations.NotNull()
    java.lang.String res, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object request3(@org.jetbrains.annotations.NotNull()
    java.lang.String res, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p1) {
        return null;
    }
    
    private CoroutinesScene() {
        super();
    }
}