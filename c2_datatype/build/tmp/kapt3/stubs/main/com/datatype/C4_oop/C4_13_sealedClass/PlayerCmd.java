package com.datatype.C4_oop.C4_13_sealedClass;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "", "()V", "Pause", "Play", "Resume", "Seek", "Stop", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Play;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Seek;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Pause;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Resume;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Stop;", "c2_datatype"})
public abstract class PlayerCmd {
    
    private PlayerCmd() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Play;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "url", "", "position", "", "(Ljava/lang/String;J)V", "getPosition", "()J", "getUrl", "()Ljava/lang/String;", "c2_datatype"})
    public static final class Play extends com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        private final long position = 0L;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final long getPosition() {
            return 0L;
        }
        
        public Play(@org.jetbrains.annotations.NotNull()
        java.lang.String url, long position) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Seek;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "position", "", "(J)V", "getPosition", "()J", "c2_datatype"})
    public static final class Seek extends com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd {
        private final long position = 0L;
        
        public final long getPosition() {
            return 0L;
        }
        
        public Seek(long position) {
            super();
        }
        
        public Seek() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Pause;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "()V", "c2_datatype"})
    public static final class Pause extends com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd {
        public static final com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd.Pause INSTANCE = null;
        
        private Pause() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Resume;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "()V", "c2_datatype"})
    public static final class Resume extends com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd {
        public static final com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd.Resume INSTANCE = null;
        
        private Resume() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd$Stop;", "Lcom/datatype/C4_oop/C4_13_sealedClass/PlayerCmd;", "()V", "c2_datatype"})
    public static final class Stop extends com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd {
        public static final com.datatype.C4_oop.C4_13_sealedClass.PlayerCmd.Stop INSTANCE = null;
        
        private Stop() {
            super();
        }
    }
}