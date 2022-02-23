package net.frju.flym.data.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bg\u0018\u00002\u00020\u0001J!\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\'\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\'J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\bH\'J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0014\u001a\u00020\bH\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0018\u001a\u00020\u0003H\'J!\u0010\u0019\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\'\u00a2\u0006\u0002\u0010\u0010J\b\u0010\u001a\u001a\u00020\fH\'J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\'J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\'J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0003H\'J\u0016\u0010\u001d\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0016\u0010\u001f\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\'J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u0003H\'J\u001c\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010,\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J\u001c\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u00105\u001a\u00020\bH\'J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\'2\u0006\u00107\u001a\u00020\u0003H\'J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0003H\'J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030\'2\u0006\u0010!\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0003H\'J\u001c\u0010:\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u00105\u001a\u00020\bH\'J$\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\'2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010=\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J$\u0010>\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00160#2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\'J!\u0010?\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000e\"\u00020\u000fH\'\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u00038\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006@"}, d2 = {"Lnet/frju/flym/data/dao/EntryDao;", "", "countUnread", "", "getCountUnread", "()J", "favoriteIds", "", "", "getFavoriteIds", "()Ljava/util/List;", "delete", "", "entries", "", "Lnet/frju/flym/data/entities/Entry;", "([Lnet/frju/flym/data/entities/Entry;)V", "deleteOlderThan", "keepDateBorderTime", "findById", "id", "findByIdWithFeed", "Lnet/frju/flym/data/entities/EntryWithFeed;", "idsForFeed", "feedId", "insert", "markAllAsRead", "markAsFavorite", "markAsNotFavorite", "markAsRead", "ids", "markAsUnread", "markGroupAsRead", "groupId", "observeAll", "Landroid/arch/paging/DataSource$Factory;", "", "maxDate", "observeAllFavoriteIds", "Landroid/arch/lifecycle/LiveData;", "observeAllFavorites", "observeAllIds", "observeAllUnreadIds", "observeAllUnreads", "observeByFeed", "observeByGroup", "observeFavoriteIdsByFeed", "observeFavoriteIdsByGroup", "observeFavoritesByFeed", "observeFavoritesByGroup", "observeIdsByFeed", "observeIdsByGroup", "observeIdsBySearch", "searchText", "observeNewEntriesCount", "minDate", "observeNewEntriesCountByFeed", "observeNewEntriesCountByGroup", "observeSearch", "observeUnreadIdsByFeed", "observeUnreadIdsByGroup", "observeUnreadsByFeed", "observeUnreadsByGroup", "update", "app_debug"})
public abstract interface EntryDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE title LIKE \'%\' || :searchText || \'%\' OR description LIKE \'%\' || :searchText || \'%\' OR mobilizedContent LIKE \'%\' || :searchText || \'%\' ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeAll(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeAllUnreads(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeAllFavorites(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeAllIds(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeAllUnreadIds(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeAllFavoriteIds(long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS :feedId AND fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS :feedId AND fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeUnreadsByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS :feedId AND fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeFavoritesByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE title LIKE \'%\' || :searchText || \'%\' OR description LIKE \'%\' || :searchText || \'%\' OR mobilizedContent LIKE \'%\' || :searchText || \'%\' ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeIdsBySearch(@org.jetbrains.annotations.NotNull()
    java.lang.String searchText);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE feedId IS :feedId AND fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeIdsByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE feedId IS :feedId AND fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeUnreadIdsByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE feedId IS :feedId AND fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeFavoriteIdsByFeed(long feedId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeUnreadsByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, net.frju.flym.data.entities.EntryWithFeed> observeFavoritesByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeIdsByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate AND read = 0 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeUnreadIdsByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND fetchDate <= :maxDate AND favorite = 1 ORDER BY publicationDate DESC, id")
    public abstract android.arch.lifecycle.LiveData<java.util.List<java.lang.String>> observeFavoriteIdsByGroup(long groupId, long maxDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM entries WHERE read = 0 AND fetchDate > :minDate")
    public abstract android.arch.lifecycle.LiveData<java.lang.Long> observeNewEntriesCount(long minDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM entries WHERE entries.feedId IS :feedId AND read = 0 AND fetchDate > :minDate")
    public abstract android.arch.lifecycle.LiveData<java.lang.Long> observeNewEntriesCountByFeed(long feedId, long minDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS :groupId AND read = 0 AND fetchDate > :minDate")
    public abstract android.arch.lifecycle.LiveData<java.lang.Long> observeNewEntriesCountByGroup(long groupId, long minDate);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE favorite = 1")
    public abstract java.util.List<java.lang.String> getFavoriteIds();
    
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM entries WHERE read = 0")
    public abstract long getCountUnread();
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM entries WHERE id IS :id LIMIT 1")
    public abstract net.frju.flym.data.entities.Entry findById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.Query(value = "SELECT * FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE id IS :id LIMIT 1")
    public abstract net.frju.flym.data.entities.EntryWithFeed findByIdWithFeed(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT id FROM entries WHERE feedId IS (:feedId)")
    public abstract java.util.List<java.lang.String> idsForFeed(long feedId);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET read = 1 WHERE id IN (:ids)")
    public abstract void markAsRead(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ids);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET read = 0 WHERE id IN (:ids)")
    public abstract void markAsUnread(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ids);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET read = 1 WHERE feedId = :feedId")
    public abstract void markAsRead(long feedId);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET read = 1 WHERE feedId IN (SELECT feedId FROM feeds WHERE groupId = :groupId)")
    public abstract void markGroupAsRead(long groupId);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET read = 1")
    public abstract void markAllAsRead();
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET favorite = 1 WHERE id IS :id")
    public abstract void markAsFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @android.arch.persistence.room.Query(value = "UPDATE entries SET favorite = 0 WHERE id IS :id")
    public abstract void markAsNotFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM entries WHERE fetchDate < :keepDateBorderTime AND favorite = 0 AND read = 1")
    public abstract void deleteOlderThan(long keepDateBorderTime);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Entry... entries);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Entry... entries);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Entry... entries);
}