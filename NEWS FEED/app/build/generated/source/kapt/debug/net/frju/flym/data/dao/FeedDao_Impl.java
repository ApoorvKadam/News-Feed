package net.frju.flym.data.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.frju.flym.data.entities.Feed;
import net.frju.flym.data.entities.FeedWithCount;

@SuppressWarnings("unchecked")
public class FeedDao_Impl implements FeedDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfFeed;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfFeed;

  private final SharedSQLiteStatement __preparedStmtOfEnableFullTextRetrieval;

  private final SharedSQLiteStatement __preparedStmtOfDisableFullTextRetrieval;

  public FeedDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFeed = new EntityInsertionAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `feeds`(`feedId`,`feedLink`,`feedTitle`,`feedImageLink`,`fetchError`,`retrieveFullText`,`isGroup`,`groupId`,`displayPriority`,`lastManualActionUid`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
        if (value.getLink() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLink());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageLink());
        }
        final int _tmp;
        _tmp = value.getFetchError() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getRetrieveFullText() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isGroup() ? 1 : 0;
        stmt.bindLong(7, _tmp_2);
        if (value.getGroupId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getGroupId());
        }
        stmt.bindLong(9, value.getDisplayPriority());
        if (value.getLastManualActionUid() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLastManualActionUid());
        }
      }
    };
    this.__deletionAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `feeds` WHERE `feedId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfFeed = new EntityDeletionOrUpdateAdapter<Feed>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `feeds` SET `feedId` = ?,`feedLink` = ?,`feedTitle` = ?,`feedImageLink` = ?,`fetchError` = ?,`retrieveFullText` = ?,`isGroup` = ?,`groupId` = ?,`displayPriority` = ?,`lastManualActionUid` = ? WHERE `feedId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Feed value) {
        stmt.bindLong(1, value.getId());
        if (value.getLink() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLink());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        if (value.getImageLink() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageLink());
        }
        final int _tmp;
        _tmp = value.getFetchError() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getRetrieveFullText() ? 1 : 0;
        stmt.bindLong(6, _tmp_1);
        final int _tmp_2;
        _tmp_2 = value.isGroup() ? 1 : 0;
        stmt.bindLong(7, _tmp_2);
        if (value.getGroupId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getGroupId());
        }
        stmt.bindLong(9, value.getDisplayPriority());
        if (value.getLastManualActionUid() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getLastManualActionUid());
        }
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfEnableFullTextRetrieval = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE feeds SET retrieveFullText = 1 WHERE feedId = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDisableFullTextRetrieval = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE feeds SET retrieveFullText = 0 WHERE feedId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(Feed... feeds) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfFeed.insert(feeds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Feed... feeds) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfFeed.handleMultiple(feeds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Feed... feeds) {
    __db.beginTransaction();
    try {
      __updateAdapterOfFeed.handleMultiple(feeds);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void enableFullTextRetrieval(long feedId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfEnableFullTextRetrieval.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, feedId);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfEnableFullTextRetrieval.release(_stmt);
    }
  }

  @Override
  public void disableFullTextRetrieval(long feedId) {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDisableFullTextRetrieval.acquire();
    __db.beginTransaction();
    try {
      int _argIndex = 1;
      _stmt.bindLong(_argIndex, feedId);
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDisableFullTextRetrieval.release(_stmt);
    }
  }

  @Override
  public List<Feed> getAllNonGroupFeeds() {
    final String _sql = "SELECT * FROM feeds WHERE isGroup = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("feedLink");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("feedTitle");
      final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
      final int _cursorIndexOfFetchError = _cursor.getColumnIndexOrThrow("fetchError");
      final int _cursorIndexOfRetrieveFullText = _cursor.getColumnIndexOrThrow("retrieveFullText");
      final int _cursorIndexOfIsGroup = _cursor.getColumnIndexOrThrow("isGroup");
      final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
      final int _cursorIndexOfDisplayPriority = _cursor.getColumnIndexOrThrow("displayPriority");
      final int _cursorIndexOfLastManualActionUid = _cursor.getColumnIndexOrThrow("lastManualActionUid");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item;
        _item = new Feed();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _item.setLink(_tmpLink);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _item.setImageLink(_tmpImageLink);
        final boolean _tmpFetchError;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFetchError);
        _tmpFetchError = _tmp != 0;
        _item.setFetchError(_tmpFetchError);
        final boolean _tmpRetrieveFullText;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRetrieveFullText);
        _tmpRetrieveFullText = _tmp_1 != 0;
        _item.setRetrieveFullText(_tmpRetrieveFullText);
        final boolean _tmpIsGroup;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsGroup);
        _tmpIsGroup = _tmp_2 != 0;
        _item.setGroup(_tmpIsGroup);
        final Long _tmpGroupId;
        if (_cursor.isNull(_cursorIndexOfGroupId)) {
          _tmpGroupId = null;
        } else {
          _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
        }
        _item.setGroupId(_tmpGroupId);
        final int _tmpDisplayPriority;
        _tmpDisplayPriority = _cursor.getInt(_cursorIndexOfDisplayPriority);
        _item.setDisplayPriority(_tmpDisplayPriority);
        final String _tmpLastManualActionUid;
        _tmpLastManualActionUid = _cursor.getString(_cursorIndexOfLastManualActionUid);
        _item.setLastManualActionUid(_tmpLastManualActionUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<Feed> getAll() {
    final String _sql = "SELECT * FROM feeds ORDER BY groupId DESC, displayPriority ASC, feedId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("feedLink");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("feedTitle");
      final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
      final int _cursorIndexOfFetchError = _cursor.getColumnIndexOrThrow("fetchError");
      final int _cursorIndexOfRetrieveFullText = _cursor.getColumnIndexOrThrow("retrieveFullText");
      final int _cursorIndexOfIsGroup = _cursor.getColumnIndexOrThrow("isGroup");
      final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
      final int _cursorIndexOfDisplayPriority = _cursor.getColumnIndexOrThrow("displayPriority");
      final int _cursorIndexOfLastManualActionUid = _cursor.getColumnIndexOrThrow("lastManualActionUid");
      final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Feed _item;
        _item = new Feed();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _item.setLink(_tmpLink);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _item.setTitle(_tmpTitle);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _item.setImageLink(_tmpImageLink);
        final boolean _tmpFetchError;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFetchError);
        _tmpFetchError = _tmp != 0;
        _item.setFetchError(_tmpFetchError);
        final boolean _tmpRetrieveFullText;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRetrieveFullText);
        _tmpRetrieveFullText = _tmp_1 != 0;
        _item.setRetrieveFullText(_tmpRetrieveFullText);
        final boolean _tmpIsGroup;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsGroup);
        _tmpIsGroup = _tmp_2 != 0;
        _item.setGroup(_tmpIsGroup);
        final Long _tmpGroupId;
        if (_cursor.isNull(_cursorIndexOfGroupId)) {
          _tmpGroupId = null;
        } else {
          _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
        }
        _item.setGroupId(_tmpGroupId);
        final int _tmpDisplayPriority;
        _tmpDisplayPriority = _cursor.getInt(_cursorIndexOfDisplayPriority);
        _item.setDisplayPriority(_tmpDisplayPriority);
        final String _tmpLastManualActionUid;
        _tmpLastManualActionUid = _cursor.getString(_cursorIndexOfLastManualActionUid);
        _item.setLastManualActionUid(_tmpLastManualActionUid);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Feed>> getObserveAll() {
    final String _sql = "SELECT * FROM feeds ORDER BY groupId DESC, displayPriority ASC, feedId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Feed>>() {
      private Observer _observer;

      @Override
      protected List<Feed> compute() {
        if (_observer == null) {
          _observer = new Observer("feeds") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("feedId");
          final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("feedLink");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("feedTitle");
          final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
          final int _cursorIndexOfFetchError = _cursor.getColumnIndexOrThrow("fetchError");
          final int _cursorIndexOfRetrieveFullText = _cursor.getColumnIndexOrThrow("retrieveFullText");
          final int _cursorIndexOfIsGroup = _cursor.getColumnIndexOrThrow("isGroup");
          final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
          final int _cursorIndexOfDisplayPriority = _cursor.getColumnIndexOrThrow("displayPriority");
          final int _cursorIndexOfLastManualActionUid = _cursor.getColumnIndexOrThrow("lastManualActionUid");
          final List<Feed> _result = new ArrayList<Feed>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Feed _item;
            _item = new Feed();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpLink;
            _tmpLink = _cursor.getString(_cursorIndexOfLink);
            _item.setLink(_tmpLink);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            _item.setTitle(_tmpTitle);
            final String _tmpImageLink;
            _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
            _item.setImageLink(_tmpImageLink);
            final boolean _tmpFetchError;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfFetchError);
            _tmpFetchError = _tmp != 0;
            _item.setFetchError(_tmpFetchError);
            final boolean _tmpRetrieveFullText;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfRetrieveFullText);
            _tmpRetrieveFullText = _tmp_1 != 0;
            _item.setRetrieveFullText(_tmpRetrieveFullText);
            final boolean _tmpIsGroup;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsGroup);
            _tmpIsGroup = _tmp_2 != 0;
            _item.setGroup(_tmpIsGroup);
            final Long _tmpGroupId;
            if (_cursor.isNull(_cursorIndexOfGroupId)) {
              _tmpGroupId = null;
            } else {
              _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
            }
            _item.setGroupId(_tmpGroupId);
            final int _tmpDisplayPriority;
            _tmpDisplayPriority = _cursor.getInt(_cursorIndexOfDisplayPriority);
            _item.setDisplayPriority(_tmpDisplayPriority);
            final String _tmpLastManualActionUid;
            _tmpLastManualActionUid = _cursor.getString(_cursorIndexOfLastManualActionUid);
            _item.setLastManualActionUid(_tmpLastManualActionUid);
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
  public LiveData<List<FeedWithCount>> getObserveAllWithCount() {
    final String _sql = "SELECT *, (SELECT COUNT(*) FROM entries WHERE feedId IS f.feedId AND read = 0) AS entryCount FROM feeds AS f ORDER BY groupId DESC, displayPriority ASC, feedId ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<FeedWithCount>>() {
      private Observer _observer;

      @Override
      protected List<FeedWithCount> compute() {
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
          final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("feedId");
          final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("feedLink");
          final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("feedTitle");
          final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
          final int _cursorIndexOfFetchError = _cursor.getColumnIndexOrThrow("fetchError");
          final int _cursorIndexOfRetrieveFullText = _cursor.getColumnIndexOrThrow("retrieveFullText");
          final int _cursorIndexOfIsGroup = _cursor.getColumnIndexOrThrow("isGroup");
          final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
          final int _cursorIndexOfDisplayPriority = _cursor.getColumnIndexOrThrow("displayPriority");
          final int _cursorIndexOfLastManualActionUid = _cursor.getColumnIndexOrThrow("lastManualActionUid");
          final int _cursorIndexOfEntryCount = _cursor.getColumnIndexOrThrow("entryCount");
          final List<FeedWithCount> _result = new ArrayList<FeedWithCount>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FeedWithCount _item;
            final int _tmpEntryCount;
            _tmpEntryCount = _cursor.getInt(_cursorIndexOfEntryCount);
            final Feed _tmpFeed;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfLink) && _cursor.isNull(_cursorIndexOfTitle) && _cursor.isNull(_cursorIndexOfImageLink) && _cursor.isNull(_cursorIndexOfFetchError) && _cursor.isNull(_cursorIndexOfRetrieveFullText) && _cursor.isNull(_cursorIndexOfIsGroup) && _cursor.isNull(_cursorIndexOfGroupId) && _cursor.isNull(_cursorIndexOfDisplayPriority) && _cursor.isNull(_cursorIndexOfLastManualActionUid))) {
              _tmpFeed = new Feed();
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              _tmpFeed.setId(_tmpId);
              final String _tmpLink;
              _tmpLink = _cursor.getString(_cursorIndexOfLink);
              _tmpFeed.setLink(_tmpLink);
              final String _tmpTitle;
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
              _tmpFeed.setTitle(_tmpTitle);
              final String _tmpImageLink;
              _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
              _tmpFeed.setImageLink(_tmpImageLink);
              final boolean _tmpFetchError;
              final int _tmp;
              _tmp = _cursor.getInt(_cursorIndexOfFetchError);
              _tmpFetchError = _tmp != 0;
              _tmpFeed.setFetchError(_tmpFetchError);
              final boolean _tmpRetrieveFullText;
              final int _tmp_1;
              _tmp_1 = _cursor.getInt(_cursorIndexOfRetrieveFullText);
              _tmpRetrieveFullText = _tmp_1 != 0;
              _tmpFeed.setRetrieveFullText(_tmpRetrieveFullText);
              final boolean _tmpIsGroup;
              final int _tmp_2;
              _tmp_2 = _cursor.getInt(_cursorIndexOfIsGroup);
              _tmpIsGroup = _tmp_2 != 0;
              _tmpFeed.setGroup(_tmpIsGroup);
              final Long _tmpGroupId;
              if (_cursor.isNull(_cursorIndexOfGroupId)) {
                _tmpGroupId = null;
              } else {
                _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
              }
              _tmpFeed.setGroupId(_tmpGroupId);
              final int _tmpDisplayPriority;
              _tmpDisplayPriority = _cursor.getInt(_cursorIndexOfDisplayPriority);
              _tmpFeed.setDisplayPriority(_tmpDisplayPriority);
              final String _tmpLastManualActionUid;
              _tmpLastManualActionUid = _cursor.getString(_cursorIndexOfLastManualActionUid);
              _tmpFeed.setLastManualActionUid(_tmpLastManualActionUid);
            }  else  {
              _tmpFeed = null;
            }
            _item = new FeedWithCount(_tmpFeed,_tmpEntryCount);
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
  public Feed findById(long id) {
    final String _sql = "SELECT * FROM feeds WHERE feedId IS ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("feedId");
      final int _cursorIndexOfLink = _cursor.getColumnIndexOrThrow("feedLink");
      final int _cursorIndexOfTitle = _cursor.getColumnIndexOrThrow("feedTitle");
      final int _cursorIndexOfImageLink = _cursor.getColumnIndexOrThrow("feedImageLink");
      final int _cursorIndexOfFetchError = _cursor.getColumnIndexOrThrow("fetchError");
      final int _cursorIndexOfRetrieveFullText = _cursor.getColumnIndexOrThrow("retrieveFullText");
      final int _cursorIndexOfIsGroup = _cursor.getColumnIndexOrThrow("isGroup");
      final int _cursorIndexOfGroupId = _cursor.getColumnIndexOrThrow("groupId");
      final int _cursorIndexOfDisplayPriority = _cursor.getColumnIndexOrThrow("displayPriority");
      final int _cursorIndexOfLastManualActionUid = _cursor.getColumnIndexOrThrow("lastManualActionUid");
      final Feed _result;
      if(_cursor.moveToFirst()) {
        _result = new Feed();
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpLink;
        _tmpLink = _cursor.getString(_cursorIndexOfLink);
        _result.setLink(_tmpLink);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        _result.setTitle(_tmpTitle);
        final String _tmpImageLink;
        _tmpImageLink = _cursor.getString(_cursorIndexOfImageLink);
        _result.setImageLink(_tmpImageLink);
        final boolean _tmpFetchError;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfFetchError);
        _tmpFetchError = _tmp != 0;
        _result.setFetchError(_tmpFetchError);
        final boolean _tmpRetrieveFullText;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfRetrieveFullText);
        _tmpRetrieveFullText = _tmp_1 != 0;
        _result.setRetrieveFullText(_tmpRetrieveFullText);
        final boolean _tmpIsGroup;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfIsGroup);
        _tmpIsGroup = _tmp_2 != 0;
        _result.setGroup(_tmpIsGroup);
        final Long _tmpGroupId;
        if (_cursor.isNull(_cursorIndexOfGroupId)) {
          _tmpGroupId = null;
        } else {
          _tmpGroupId = _cursor.getLong(_cursorIndexOfGroupId);
        }
        _result.setGroupId(_tmpGroupId);
        final int _tmpDisplayPriority;
        _tmpDisplayPriority = _cursor.getInt(_cursorIndexOfDisplayPriority);
        _result.setDisplayPriority(_tmpDisplayPriority);
        final String _tmpLastManualActionUid;
        _tmpLastManualActionUid = _cursor.getString(_cursorIndexOfLastManualActionUid);
        _result.setLastManualActionUid(_tmpLastManualActionUid);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
