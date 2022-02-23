package net.frju.flym.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J!\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\'J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\'J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0017H\'J!\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0014J!\u0010\u001c\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0013\"\u00020\u0004H\'\u00a2\u0006\u0002\u0010\u0014R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\n8\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\n8\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\f\u00a8\u0006\u001d"}, d2 = {"Lnet/frju/flym/data/dao/FeedDao;", "", "all", "", "Lnet/frju/flym/data/entities/Feed;", "getAll", "()Ljava/util/List;", "allNonGroupFeeds", "getAllNonGroupFeeds", "observeAll", "Landroid/arch/lifecycle/LiveData;", "getObserveAll", "()Landroid/arch/lifecycle/LiveData;", "observeAllWithCount", "Lnet/frju/flym/data/entities/FeedWithCount;", "getObserveAllWithCount", "delete", "", "feeds", "", "([Lnet/frju/flym/data/entities/Feed;)V", "disableFullTextRetrieval", "feedId", "", "enableFullTextRetrieval", "findById", "id", "insert", "update", "app_debug"})
public abstract interface FeedDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM feeds WHERE isGroup = 0")
    public abstract java.util.List<net.frju.flym.data.entities.Feed> getAllNonGroupFeeds();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM feeds ORDER BY groupId DESC, displayPriority ASC, feedId ASC")
    public abstract java.util.List<net.frju.flym.data.entities.Feed> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM feeds ORDER BY groupId DESC, displayPriority ASC, feedId ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<net.frju.flym.data.entities.Feed>> getObserveAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT *, (SELECT COUNT(*) FROM entries WHERE feedId IS f.feedId AND read = 0) AS entryCount FROM feeds AS f ORDER BY groupId DESC, displayPriority ASC, feedId ASC")
    public abstract android.arch.lifecycle.LiveData<java.util.List<net.frju.flym.data.entities.FeedWithCount>> getObserveAllWithCount();
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM feeds WHERE feedId IS :id LIMIT 1")
    public abstract net.frju.flym.data.entities.Feed findById(long id);
    
    @android.arch.persistence.room.Query(value = "UPDATE feeds SET retrieveFullText = 1 WHERE feedId = :feedId")
    public abstract void enableFullTextRetrieval(long feedId);
    
    @android.arch.persistence.room.Query(value = "UPDATE feeds SET retrieveFullText = 0 WHERE feedId = :feedId")
    public abstract void disableFullTextRetrieval(long feedId);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed... feeds);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed... feeds);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed... feeds);
}