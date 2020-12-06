package com.datatype.C9_genarics.C9_7_mvp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000*\u0016\b\u0000\u0010\u0001 \u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00000\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/datatype/C9_genarics/C9_7_mvp/IPresenter;", "V", "Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "", "view", "getView", "()Lcom/datatype/C9_genarics/C9_7_mvp/IView;", "c2_datatype"})
public abstract interface IPresenter<V extends com.datatype.C9_genarics.C9_7_mvp.IView<? extends com.datatype.C9_genarics.C9_7_mvp.IPresenter<? extends V>>> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getView();
}