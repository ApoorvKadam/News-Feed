package net.frju.flym.data.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.paging.DataSource;
import android.arch.paging.DataSource.Factory;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.arch.persistence.room.paging.LimitOffsetDataSource;
import android.arch.persistence.room.util.StringUtil;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import net.frju.flym.data.converters.Converters;
import net.frju.flym.data.entities.Entry;
import net.frju.flym.data.entities.EntryWithFeed;

@SuppressWarnings("unchecked")
public class EntryDao_Impl implements EntryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfEntry;

  private final Converters __converters = new Converters();

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfEntry;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfEntry;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsRead;

  private final SharedSQLiteStatement __preparedStmtOfMarkGroupAsRead;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllAsRead;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsFavorite;

  private final SharedSQLiteStatement __preparedStmtOfMarkAsNotFavorite;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOlderThan;

  public EntryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEntry = new EntityInsertionAdapter<Entry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `entries`(`id`,`feedId`,`link`,`fetchDate`,`publicationDate`,`title`,`description`,`mobilizedContent`,`imageLink`,`author`,`read`,`favorite`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entry value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getFeedId());
        if (value.getLink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLink());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getFetchDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getPublicationDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        if (value.getMobilizedContent() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMobilizedContent());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageLink());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAuthor());
        }
        final int _tmp_2;
        _tmp_2 = value.getRead() ? 1 : 0;
        stmt.bindLong(11, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getFavorite() ? 1 : 0;
        stmt.bindLong(12, _tmp_3);
      }
    };
    this.__deletionAdapterOfEntry = new EntityDeletionOrUpdateAdapter<Entry>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `entries` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entry value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfEntry = new EntityDeletionOrUpdateAdapter<Entry>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `entries` SET `id` = ?,`feedId` = ?,`link` = ?,`fetchDate` = ?,`publicationDate` = ?,`title` = ?,`description` = ?,`mobilizedContent` = ?,`imageLink` = ?,`author` = ?,`read` = ?,`favorite` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Entry value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        stmt.bindLong(2, value.getFeedId());
        if (value.getLink() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLink());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getFetchDate());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getPublicationDate());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_1);
        }
        if (value.getTitle() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDescription());
        }
        if (value.getMobilizedContent() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getMobilizedContent());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getImageLink());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getAuthor());
        }
        final int _tmp_2;
        _tmp_2 = value.getRead() ? 1 : 0;
        stmt.bindLong(11, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getFavorite() ? 1 : 0;
        stmt.bindLong(12, _tmp_3);
        if (value.getId() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getId());
        }
      }
    };
    this.__preparedStmtOfMarkAsRead = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE entries SET read = 1 WHERE feedId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkGroupAsRead = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE entries SET read = 1 WHERE feedId IN (SELECT feedId FROM feeds WHERE groupId = ?)";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAllAsRead = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE entries SET read = 1";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE entries SET favorite = 1 WHERE id IS ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAsNotFavorite = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE entries SET favorite = 0 WHERE id IS ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOlderThan = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM entries WHERE fetchDate < ? AND favorite = 0 AND read = 1";
        return _query;
      }
    };
  }

  @Override
  public void insert(Entry... entries) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfEntry.insert(entries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Entry... entries) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfEntry.handleMultiple(entries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Entry... entries) {
    __db.beginTransaction();
    try {
      __updateAdapterOfEntry.handleMultiple(entries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void markAsRead(long feedId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsRead.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, feedId);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAsRead.release(_stmt);
    }
  }

  @Override
  public void markGroupAsRead(long groupId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkGroupAsRead.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, groupId);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkGroupAsRead.release(_stmt);
    }
  }

  @Override
  public void markAllAsRead() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllAsRead.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAllAsRead.release(_stmt);
    }
  }

  @Override
  public void markAsFavorite(String id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsFavorite.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, id);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAsFavorite.release(_stmt);
    }
  }

  @Override
  public void markAsNotFavorite(String id) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAsNotFavorite.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      if (id == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, id);
      }
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAsNotFavorite.release(_stmt);
    }
  }

  @Override
  public void deleteOlderThan(long keepDateBorderTime) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOlderThan.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, keepDateBorderTime);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteOlderThan.release(_stmt);
    }
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeSearch(String searchText) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE title LIKE '%' || ? || '%' OR description LIKE '%' || ? || '%' OR mobilizedContent LIKE '%' || ? || '%' ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    _argIndex = 2;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    _argIndex = 3;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeAll(long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeAllUnreads(long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeAllFavorites(long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<List<String>> observeAllIds(long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeAllUnreadIds(long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeAllFavoriteIds(long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeByFeed(long feedId, long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS ? AND fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeUnreadsByFeed(long feedId,
      long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS ? AND fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeFavoritesByFeed(long feedId,
      long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE entries.feedId IS ? AND fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<List<String>> observeIdsBySearch(String searchText) {
    final String _sql = "SELECT id FROM entries WHERE title LIKE '%' || ? || '%' OR description LIKE '%' || ? || '%' OR mobilizedContent LIKE '%' || ? || '%' ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    _argIndex = 2;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    _argIndex = 3;
    if (searchText == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchText);
    }
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeIdsByFeed(long feedId, long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE feedId IS ? AND fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeUnreadIdsByFeed(long feedId, long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE feedId IS ? AND fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeFavoriteIdsByFeed(long feedId, long maxDate) {
    final String _sql = "SELECT id FROM entries WHERE feedId IS ? AND fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeByGroup(long groupId, long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeUnreadsByGroup(long groupId,
      long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public DataSource.Factory<Integer, EntryWithFeed> observeFavoritesByGroup(long groupId,
      long maxDate) {
    final String _sql = "SELECT id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new DataSource.Factory<Integer, EntryWithFeed>() {
      @Override
      public LimitOffsetDataSource<EntryWithFeed> create() {
        return new LimitOffsetDataSource<EntryWithFeed>(__db, _statement, false , "entries", "feeds") {
          @Override
          protected List<EntryWithFeed> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = cursor.getColumnIndexOrThrow("id");
            final int _cursorIndexOfFeedId = cursor.getColumnIndexOrThrow("feedId");
            final int _cursorIndexOfFeedLink = cursor.getColumnIndexOrThrow("feedLink");
            final int _cursorIndexOfFeedTitle = cursor.getColumnIndexOrThrow("feedTitle");
            final int _cursorIndexOfFetchDate = cursor.getColumnIndexOrThrow("fetchDate");
            final int _cursorIndexOfPublicationDate = cursor.getColumnIndexOrThrow("publicationDate");
            final int _cursorIndexOfTitle = cursor.getColumnIndexOrThrow("title");
            final int _cursorIndexOfDescription = cursor.getColumnIndexOrThrow("description");
            final int _cursorIndexOfImageLink = cursor.getColumnIndexOrThrow("imageLink");
            final int _cursorIndexOfRead = cursor.getColumnIndexOrThrow("read");
            final int _cursorIndexOfFavorite = cursor.getColumnIndexOrThrow("favorite");
            final List<EntryWithFeed> _res = new ArrayList<EntryWithFeed>(cursor.getCount());
            while(cursor.moveToNext()) {
              final EntryWithFeed _item;
              final String _tmpFeedLink;
              _tmpFeedLink = cursor.getString(_cursorIndexOfFeedLink);
              final String _tmpFeedTitle;
              _tmpFeedTitle = cursor.getString(_cursorIndexOfFeedTitle);
              final Entry _tmpEntry;
              if (! (cursor.isNull(_cursorIndexOfId) && cursor.isNull(_cursorIndexOfFeedId) && cursor.isNull(_cursorIndexOfFetchDate) && cursor.isNull(_cursorIndexOfPublicationDate) && cursor.isNull(_cursorIndexOfTitle) && cursor.isNull(_cursorIndexOfDescription) && cursor.isNull(_cursorIndexOfImageLink) && cursor.isNull(_cursorIndexOfRead) && cursor.isNull(_cursorIndexOfFavorite))) {
                _tmpEntry = new Entry();
                final String _tmpId;
                _tmpId = cursor.getString(_cursorIndexOfId);
                _tmpEntry.setId(_tmpId);
                final long _tmpFeedId;
                _tmpFeedId = cursor.getLong(_cursorIndexOfFeedId);
                _tmpEntry.setFeedId(_tmpFeedId);
                final Date _tmpFetchDate;
                final Long _tmp;
                if (cursor.isNull(_cursorIndexOfFetchDate)) {
                  _tmp = null;
                } else {
                  _tmp = cursor.getLong(_cursorIndexOfFetchDate);
                }
                _tmpFetchDate = __converters.fromTimestamp(_tmp);
                _tmpEntry.setFetchDate(_tmpFetchDate);
                final Date _tmpPublicationDate;
                final Long _tmp_1;
                if (cursor.isNull(_cursorIndexOfPublicationDate)) {
                  _tmp_1 = null;
                } else {
                  _tmp_1 = cursor.getLong(_cursorIndexOfPublicationDate);
                }
                _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
                _tmpEntry.setPublicationDate(_tmpPublicationDate);
                final String _tmpTitle;
                _tmpTitle = cursor.getString(_cursorIndexOfTitle);
                _tmpEntry.setTitle(_tmpTitle);
                final String _tmpDescription;
                _tmpDescription = cursor.getString(_cursorIndexOfDescription);
                _tmpEntry.setDescription(_tmpDescription);
                final String _tmpImageLink;
                _tmpImageLink = cursor.getString(_cursorIndexOfImageLink);
                _tmpEntry.setImageLink(_tmpImageLink);
                final boolean _tmpRead;
                final int _tmp_2;
                _tmp_2 = cursor.getInt(_cursorIndexOfRead);
                _tmpRead = _tmp_2 != 0;
                _tmpEntry.setRead(_tmpRead);
                final boolean _tmpFavorite;
                final int _tmp_3;
                _tmp_3 = cursor.getInt(_cursorIndexOfFavorite);
                _tmpFavorite = _tmp_3 != 0;
                _tmpEntry.setFavorite(_tmpFavorite);
              }  else  {
                _tmpEntry = null;
              }
              _item = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,null,null);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }

  @Override
  public LiveData<List<String>> observeIdsByGroup(long groupId, long maxDate) {
    final String _sql = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries","feeds") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeUnreadIdsByGroup(long groupId, long maxDate) {
    final String _sql = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? AND read = 0 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries","feeds") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<List<String>> observeFavoriteIdsByGroup(long groupId, long maxDate) {
    final String _sql = "SELECT id FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND fetchDate <= ? AND favorite = 1 ORDER BY publicationDate DESC, id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, maxDate);
    return new ComputableLiveData<List<String>>() {
      private Observer _observer;

      @Override
      protected List<String> compute() {
        if (_observer == null) {
          _observer = new Observer("entries","feeds") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Long> observeNewEntriesCount(long minDate) {
    final String _sql = "SELECT COUNT(*) FROM entries WHERE read = 0 AND fetchDate > ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, minDate);
    return new ComputableLiveData<Long>() {
      private Observer _observer;

      @Override
      protected Long compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Long> observeNewEntriesCountByFeed(long feedId, long minDate) {
    final String _sql = "SELECT COUNT(*) FROM entries WHERE entries.feedId IS ? AND read = 0 AND fetchDate > ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, minDate);
    return new ComputableLiveData<Long>() {
      private Observer _observer;

      @Override
      protected Long compute() {
        if (_observer == null) {
          _observer = new Observer("entries") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public LiveData<Long> observeNewEntriesCountByGroup(long groupId, long minDate) {
    final String _sql = "SELECT COUNT(*) FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE groupId IS ? AND read = 0 AND fetchDate > ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, groupId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, minDate);
    return new ComputableLiveData<Long>() {
      private Observer _observer;

      @Override
      protected Long compute() {
        if (_observer == null) {
          _observer = new Observer("entries","feeds") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final Long _result;
          if(_cursor.moveToFirst()) {
            final Long _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    }.getLiveData();
  }

  @Override
  public List<String> getFavoriteIds() {
    final String _sql = "SELECT id FROM entries WHERE favorite = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public long getCountUnread() {
    final String _sql = "SELECT COUNT(*) FROM entries WHERE read = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final long _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getLong(0);
      } else {
        _result = 0;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Entry findById(String id) {
    final String _sql = "SELECT * FROM entries WHERE id IS ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfFeedId = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("link");
      final int _cursorIndexOfFetchDate = _cursor.getColumnIndexOrThrow("fetchDate");
      final int _cursorIndexOfPublicationDate = _cursor.getColumnIndexOrThrow("publicationDate");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfMobilizedContent = _cursor.getColumnIndexOrThrow("mobilizedContent");
      final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("imageLink");
      final int _cursorIndexOfAuthor = _cursor.getColumnIndexOrThrow("author");
      final int _cursorIndexOfRead = _cursor.getColumnIndexOrThrow("read");
      final int _cursorIndexOfFavorite = _cursor.getColumnIndexOrThrow("favorite");
      final Entry _result;
      if(_cursor.moveToFirst()) {
        _result = new Entry();
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        _result.setId(_tmpId);
        final long _tmpFeedId;
        _tmpFeedId = _cursor.getLong(_cursorIndexOfFeedId);
        _result.setFeedId(_tmpFeedId);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _result.setLink(_tmpLink);
        final Date _tmpFetchDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfFetchDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfFetchDate);
        }
        _tmpFetchDate = __converters.fromTimestamp(_tmp);
        _result.setFetchDate(_tmpFetchDate);
        final Date _tmpPublicationDate;
        final Long _tmp_1;
        if (_cursor.isNull(_cursorIndexOfPublicationDate)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getLong(_cursorIndexOfPublicationDate);
        }
        _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
        _result.setPublicationDate(_tmpPublicationDate);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _result.setTitle(_tmpTitle);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final String _tmpMobilizedContent;
        _tmpMobilizedContent = _cursor.getString(_cursorIndexOfMobilizedContent);
        _result.setMobilizedContent(_tmpMobilizedContent);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _result.setImageLink(_tmpImageLink);
        final String _tmpAuthor;
        _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
        _result.setAuthor(_tmpAuthor);
        final boolean _tmpRead;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfRead);
        _tmpRead = _tmp_2 != 0;
        _result.setRead(_tmpRead);
        final boolean _tmpFavorite;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfFavorite);
        _tmpFavorite = _tmp_3 != 0;
        _result.setFavorite(_tmpFavorite);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public EntryWithFeed findByIdWithFeed(String id) {
    final String _sql = "SELECT * FROM entries INNER JOIN feeds ON entries.feedId = feeds.feedId WHERE id IS ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfFeedId = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("link");
      final int _cursorIndexOfFetchDate = _cursor.getColumnIndexOrThrow("fetchDate");
      final int _cursorIndexOfPublicationDate = _cursor.getColumnIndexOrThrow("publicationDate");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("title");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfMobilizedContent = _cursor.getColumnIndexOrThrow("mobilizedContent");
      final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("imageLink");
      final int _cursorIndexOfAuthor = _cursor.getColumnIndexOrThrow("author");
      final int _cursorIndexOfRead = _cursor.getColumnIndexOrThrow("read");
      final int _cursorIndexOfFavorite = _cursor.getColumnIndexOrThrow("favorite");
      final int _cursorIndexOfFeedId_1 = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfFeedLink = _cursor.getColumnIndexOrThrow("feedLink");
      final int _cursorIndexOfFeedTitle = _cursor.getColumnIndexOrThrow("feedTitle");
      final int _cursorIndexOfFeedImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
      final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
      final EntryWithFeed _result;
      if(_cursor.moveToFirst()) {
        final String _tmpFeedLink;
        _tmpFeedLink = _cursor.getString(_cursorIndexOfFeedLink);
        final String _tmpFeedTitle;
        _tmpFeedTitle = _cursor.getString(_cursorIndexOfFeedTitle);
        final String _tmpFeedImageLink;
        _tmpFeedImageLink = _cursor.getString(_cursorIndexOfFeedImageLink);
        final String _tmpGroupId;
        _tmpGroupId = _cursor.getString(_cursorIndexOfGroupId);
        final Entry _tmpEntry;
        if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfFeedId) && _cursor.isNull(_cursorIndexOfLink) && _cursor.isNull(_cursorIndexOfFetchDate) && _cursor.isNull(_cursorIndexOfPublicationDate) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfMobilizedContent) && _cursor.isNull(_cursorIndexOfImageLink) && _cursor.isNull(_cursorIndexOfAuthor) && _cursor.isNull(_cursorIndexOfRead) && _cursor.isNull(_cursorIndexOfFavorite) && _cursor.isNull(_cursorIndexOfFeedId_1))) {
          _tmpEntry = new Entry();
          final String _tmpId;
          _tmpId = _cursor.getString(_cursorIndexOfId);
          _tmpEntry.setId(_tmpId);
          final long _tmpFeedId;
          _tmpFeedId = _cursor.getLong(_cursorIndexOfFeedId);
          _tmpEntry.setFeedId(_tmpFeedId);
          final String _tmpLink;
          _tmpLink = _cursor.getString(_cursorIndexOfLink);
          _tmpEntry.setLink(_tmpLink);
          final Date _tmpFetchDate;
          final Long _tmp;
          if (_cursor.isNull(_cursorIndexOfFetchDate)) {
            _tmp = null;
          } else {
            _tmp = _cursor.getLong(_cursorIndexOfFetchDate);
          }
          _tmpFetchDate = __converters.fromTimestamp(_tmp);
          _tmpEntry.setFetchDate(_tmpFetchDate);
          final Date _tmpPublicationDate;
          final Long _tmp_1;
          if (_cursor.isNull(_cursorIndexOfPublicationDate)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _cursor.getLong(_cursorIndexOfPublicationDate);
          }
          _tmpPublicationDate = __converters.fromTimestamp(_tmp_1);
          _tmpEntry.setPublicationDate(_tmpPublicationDate);
          final String _tmpTitle;
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          _tmpEntry.setTitle(_tmpTitle);
          final String _tmpDescription;
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          _tmpEntry.setDescription(_tmpDescription);
          final String _tmpMobilizedContent;
          _tmpMobilizedContent = _cursor.getString(_cursorIndexOfMobilizedContent);
          _tmpEntry.setMobilizedContent(_tmpMobilizedContent);
          final String _tmpImageLink;
          _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
          _tmpEntry.setImageLink(_tmpImageLink);
          final String _tmpAuthor;
          _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
          _tmpEntry.setAuthor(_tmpAuthor);
          final boolean _tmpRead;
          final int _tmp_2;
          _tmp_2 = _cursor.getInt(_cursorIndexOfRead);
          _tmpRead = _tmp_2 != 0;
          _tmpEntry.setRead(_tmpRead);
          final boolean _tmpFavorite;
          final int _tmp_3;
          _tmp_3 = _cursor.getInt(_cursorIndexOfFavorite);
          _tmpFavorite = _tmp_3 != 0;
          _tmpEntry.setFavorite(_tmpFavorite);
          final long _tmpFeedId_1;
          _tmpFeedId_1 = _cursor.getLong(_cursorIndexOfFeedId_1);
          _tmpEntry.setFeedId(_tmpFeedId_1);
        }  else  {
          _tmpEntry = null;
        }
        _result = new EntryWithFeed(_tmpEntry,_tmpFeedTitle,_tmpFeedLink,_tmpFeedImageLink,_tmpGroupId);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<String> idsForFeed(long feedId) {
    final String _sql = "SELECT id FROM entries WHERE feedId IS (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, feedId);
    final Cursor _cursor = __db.query(_statement);
    try {
      final List<String> _result = new ArrayList<String>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final String _item;
        _item = _cursor.getString(0);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void markAsRead(List<String> ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("UPDATE entries SET read = 1 WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : ids) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void markAsUnread(List<String> ids) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("UPDATE entries SET read = 0 WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (String _item : ids) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
