package com.datatype.C7_coroutine.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/datatype/C7_coroutine/common/Service;", "", "getLogo", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "fileUrl", "", "c2_datatype"})
public abstract interface Service {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET()
    public abstract retrofit2.Call<okhttp3.ResponseBody> getLogo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String fileUrl);
}