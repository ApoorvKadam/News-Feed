package net.frju.flym;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lnet/frju/flym/App;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private static net.frju.flym.data.AppDatabase db;
    public static final net.frju.flym.App.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.content.Context getContext() {
        return null;
    }
    
    private static final void setContext(android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final net.frju.flym.data.AppDatabase getDb() {
        return null;
    }
    
    private static final void setDb(net.frju.flym.data.AppDatabase p0) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R,\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0006@BX\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR,\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b8\u0006@BX\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lnet/frju/flym/App$Companion;", "", "()V", "<set-?>", "Landroid/content/Context;", "context", "context$annotations", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lnet/frju/flym/data/AppDatabase;", "db", "db$annotations", "getDb", "()Lnet/frju/flym/data/AppDatabase;", "setDb", "(Lnet/frju/flym/data/AppDatabase;)V", "app_debug"})
    public static final class Companion {
        
        public static void context$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getContext() {
            return null;
        }
        
        private final void setContext(android.content.Context p0) {
        }
        
        public static void db$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.frju.flym.data.AppDatabase getDb() {
            return null;
        }
        
        private final void setDb(net.frju.flym.data.AppDatabase p0) {
        }
        
        private Companion() {
            super();
        }
    }
}