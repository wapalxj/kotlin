package com.datatype.C4_oop.C4_5_object;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/datatype/C4_oop/C4_5_object/MusicPlayer;", "Lcom/datatype/C4_oop/C4_5_object/Player;", "Lcom/datatype/C4_oop/C4_5_object/OnExternalDriverMountListener;", "()V", "state", "", "getState", "()I", "onMount", "", "driver", "Lcom/datatype/C4_oop/C4_5_object/Driver;", "onUnMount", "play", "url", "", "c2_datatype"})
public final class MusicPlayer extends com.datatype.C4_oop.C4_5_object.Player implements com.datatype.C4_oop.C4_5_object.OnExternalDriverMountListener {
    private static final int state = 0;
    public static final com.datatype.C4_oop.C4_5_object.MusicPlayer INSTANCE = null;
    
    @java.lang.Override()
    public void onUnMount(@org.jetbrains.annotations.NotNull()
    com.datatype.C4_oop.C4_5_object.Driver driver) {
    }
    
    @java.lang.Override()
    public void onMount(@org.jetbrains.annotations.NotNull()
    com.datatype.C4_oop.C4_5_object.Driver driver) {
    }
    
    public final int getState() {
        return 0;
    }
    
    public final void play(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private MusicPlayer() {
        super();
    }
}