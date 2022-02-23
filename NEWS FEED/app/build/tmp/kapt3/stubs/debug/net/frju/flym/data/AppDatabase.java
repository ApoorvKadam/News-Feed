package net.frju.flym.data;

import java.lang.System;

@android.arch.persistence.room.TypeConverters(value = {net.frju.flym.data.converters.Converters.class})
@android.arch.persistence.room.Database(entities = {net.frju.flym.data.entities.Feed.class, net.frju.flym.data.entities.Entry.class, net.frju.flym.data.entities.Task.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lnet/frju/flym/data/AppDatabase;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "entryDao", "Lnet/frju/flym/data/dao/EntryDao;", "feedDao", "Lnet/frju/flym/data/dao/FeedDao;", "taskDao", "Lnet/frju/flym/data/dao/TaskDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends android.arch.persistence.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "db";
    public static final net.frju.flym.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract net.frju.flym.data.dao.FeedDao feedDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract net.frju.flym.data.dao.EntryDao entryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract net.frju.flym.data.dao.TaskDao taskDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lnet/frju/flym/data/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "createDatabase", "Lnet/frju/flym/data/AppDatabase;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final net.frju.flym.data.AppDatabase createDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}