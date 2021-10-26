package xx_kotlin.coroutine;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ$\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\u000e\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u000e\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lxx_kotlin/coroutine/CallbackStyle2;", "", "()V", "login", "", "token", "item", "Lxx_kotlin/coroutine/CallbackStyle2$Item;", "(Ljava/lang/String;Lxx_kotlin/coroutine/CallbackStyle2$Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "callback", "Lxx_kotlin/coroutine/CallbackStyle2$Callback;", "main", "postItem", "requestToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUi", "post", "Callback", "Item", "c2_datatype"})
public final class CallbackStyle2 {
    
    public final void main() {
    }
    
    public final void postItem(@org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle2.Item item) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object requestToken(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle2.Item item, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> p2) {
        return null;
    }
    
    public final void requestToken(@org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle2.Callback<java.lang.String> callback) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle2.Item item, @org.jetbrains.annotations.NotNull()
    xx_kotlin.coroutine.CallbackStyle2.Callback<java.lang.String> callback) {
    }
    
    public final void updateUi(@org.jetbrains.annotations.NotNull()
    java.lang.String post) {
    }
    
    public CallbackStyle2() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lxx_kotlin/coroutine/CallbackStyle2$Item;", "", "i", "", "(Ljava/lang/String;)V", "getI", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "c2_datatype"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String i = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getI() {
            return null;
        }
        
        public Item(@org.jetbrains.annotations.NotNull()
        java.lang.String i) {
            super();
        }
        
        public Item() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final xx_kotlin.coroutine.CallbackStyle2.Item copy(@org.jetbrains.annotations.NotNull()
        java.lang.String i) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u00060\u0006j\u0002`\u0007H\u0016J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lxx_kotlin/coroutine/CallbackStyle2$Callback;", "T", "", "onError", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onResult", "value", "(Ljava/lang/Object;)V", "c2_datatype"})
    public static abstract interface Callback<T extends java.lang.Object> {
        
        public abstract void onResult(T value);
        
        public abstract void onError(@org.jetbrains.annotations.NotNull()
        java.lang.Exception e);
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
        public static final class DefaultImpls {
            
            public static <T extends java.lang.Object>void onError(xx_kotlin.coroutine.CallbackStyle2.Callback<T> $this, @org.jetbrains.annotations.NotNull()
            java.lang.Exception e) {
            }
        }
    }
}