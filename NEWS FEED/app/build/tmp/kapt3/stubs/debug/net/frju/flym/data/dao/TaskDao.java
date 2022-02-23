package net.frju.flym.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\f2\u0006\u0010\u0017\u001a\u00020\u0018H\'J!\u0010\u0019\u001a\u00020\u00102\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0012\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0013R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\f8\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lnet/frju/flym/data/dao/TaskDao;", "", "all", "", "Lnet/frju/flym/data/entities/Task;", "getAll", "()Ljava/util/List;", "downloadTasks", "getDownloadTasks", "mobilizeTasks", "getMobilizeTasks", "observeAll", "Landroid/arch/lifecycle/LiveData;", "getObserveAll", "()Landroid/arch/lifecycle/LiveData;", "delete", "", "tasks", "", "([Lnet/frju/flym/data/entities/Task;)V", "insert", "observeItemMobilizationTasksCount", "", "itemId", "", "update", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM tasks")
    public abstract java.util.List<net.frju.flym.data.entities.Task> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM tasks")
    public abstract android.arch.lifecycle.LiveData<java.util.List<net.frju.flym.data.entities.Task>> getObserveAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM tasks WHERE imageLinkToDl = \'\'")
    public abstract java.util.List<net.frju.flym.data.entities.Task> getMobilizeTasks();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM tasks WHERE imageLinkToDl = \'\' AND entryId = :itemId")
    public abstract android.arch.lifecycle.LiveData<java.lang.Integer> observeItemMobilizationTasksCount(@org.jetbrains.annotations.NotNull()
    java.lang.String itemId);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM tasks WHERE imageLinkToDl != \'\'")
    public abstract java.util.List<net.frju.flym.data.entities.Task> getDownloadTasks();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Task... tasks);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Task... tasks);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Task... tasks);
}