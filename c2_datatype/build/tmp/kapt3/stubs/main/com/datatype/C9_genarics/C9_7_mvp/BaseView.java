package com.datatype.C9_genarics.C9_7_mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\bR\u0016\u0010\u0005\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/datatype/C9_genarics/C9_7_mvp/BaseView;", "P", "Lcom/datatype/C9_genarics/C9_7_mvp/BasePresenter;", "Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "()V", "presenter", "getPresenter", "()Lcom/datatype/C9_genarics/C9_7_mvp/BasePresenter;", "Lcom/datatype/C9_genarics/C9_7_mvp/BasePresenter;", "findPresenterClass", "Ljava/lang/Class;", "c2_datatype"})
public abstract class BaseView<P extends com.datatype.C9_genarics.C9_7_mvp.BasePresenter<? extends com.datatype.C9_genarics.C9_7_mvp.BaseView<? extends P>>> implements com.datatype.C9_genarics.C9_7_mvp.IView<P> {
    @org.jetbrains.annotations.NotNull()
    private final P presenter = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public P getPresenter() {
        return null;
    }
    
    private final java.lang.Class<P> findPresenterClass() {
        return null;
    }
    
    public BaseView() {
        super();
    }
}