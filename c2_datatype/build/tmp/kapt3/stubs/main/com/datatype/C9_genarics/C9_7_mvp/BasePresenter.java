package com.datatype.C9_genarics.C9_7_mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u00028\u0000X\u0096.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000b"}, d2 = {"Lcom/datatype/C9_genarics/C9_7_mvp/BasePresenter;", "V", "Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "Lcom/datatype/C9_genarics/C9_7_mvp/IPresenter;", "()V", "view", "getView", "()Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "setView", "(Lcom/datatype/C9_genarics/C9_7_mvp/IView;)V", "Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "c2_datatype"})
public abstract class BasePresenter<V extends com.datatype.C9_genarics.C9_7_mvp.IView<? extends com.datatype.C9_genarics.C9_7_mvp.BasePresenter<? extends V>>> implements com.datatype.C9_genarics.C9_7_mvp.IPresenter<V> {
    @org.jetbrains.annotations.NotNull()
    public V view;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public V getView() {
        return null;
    }
    
    public void setView(@org.jetbrains.annotations.NotNull()
    V p0) {
    }
    
    public BasePresenter() {
        super();
    }
}