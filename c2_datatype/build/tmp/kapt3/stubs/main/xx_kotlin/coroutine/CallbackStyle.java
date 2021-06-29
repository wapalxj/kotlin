package xx_kotlin.coroutine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ$\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0004J\u0011\u0010\u000f\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u000f\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lxx_kotlin/coroutine/CallbackStyle;", "", "()V", "createPost", "", "token", "item", "Lxx_kotlin/coroutine/Item;", "(Ljava/lang/String;Lxx_kotlin/coroutine/Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Lxx_kotlin/coroutine/CallbackStyle$Callback;", "postItem", "processPost", "post", "requestToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Callback", "c2_datatype"})
public final class CallbackStyle {
    
    public final void postItem(@org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.Item item) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createPost(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.Item item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    public final void requestToken(@org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle.Callback<java.lang.String> callback) {
    }
    
    public final void createPost(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.Item item, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle.Callback<java.lang.String> callback) {
    }
    
    public final void processPost(@org.jetbrains.annotations.NotNull()
    java.lang.String post) {
    }
    
    public CallbackStyle() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lxx_kotlin/coroutine/CallbackStyle$Callback;", "T", "", "onError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResult", "value", "(Ljava/lang/Object;)V", "c2_datatype"})
    public static abstract interface Callback<T extends java.lang.Object> {
        
        public abstract void onResult(T value);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static <T extends java.lang.Object>void onError(xx_kotlin.coroutine.CallbackStyle.Callback<T> $this, @org.jetbrains.annotations.NotNull()
            java.lang.Exception e) {
            }
        }
    }
}