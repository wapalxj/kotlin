package xx_kotlin.coroutine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lxx_kotlin/coroutine/GlobalHandler;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "()V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "c2_datatype"})
public final class GlobalHandler implements kotlinx.coroutines.CoroutineExceptionHandler {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return null;
    }
    
    @java.lang.Override()
    public void handleException(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception) {
    }
    
    public GlobalHandler() {
        super();
    }
    
    @java.lang.Override()
    public <R extends java.lang.Object>R fold(R initial, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public <E extends kotlin.coroutines.CoroutineContext.Element>E get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext.Key<E> key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext.Key<?> key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context) {
        return null;
    }
}