package com.datatype.C7_coroutine.async;

import java.lang.System;

/**
 * * UI\u7ebf\u7a0b\u5207\u6362\u5de5\u5177\u7c7b\uff0cUIContinuation\u5305\u88c5\u7c7b
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/datatype/C7_coroutine/async/UIContinuationWrapper;", "T", "Lkotlin/coroutines/experimental/Continuation;", "continuation", "(Lkotlin/coroutines/experimental/Continuation;)V", "context", "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "getContinuation", "()Lkotlin/coroutines/experimental/Continuation;", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "c2_datatype"})
public final class UIContinuationWrapper<T extends java.lang.Object> implements kotlin.coroutines.experimental.Continuation<T> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.experimental.CoroutineContext context = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.experimental.Continuation<T> continuation = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.experimental.CoroutineContext getContext() {
        return null;
    }
    
    @java.lang.Override()
    public void resume(T value) {
    }
    
    @java.lang.Override()
    public void resumeWithException(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.experimental.Continuation<T> getContinuation() {
        return null;
    }
    
    public UIContinuationWrapper(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super T> continuation) {
        super();
    }
}