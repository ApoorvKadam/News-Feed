package net.frju.flym.data.dao;

import android.arch.lifecycle.ComputableLiveData;
import android.arch.lifecycle.LiveData;
import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.InvalidationTracker.Observer;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import android.support.annotation.NonNull;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.frju.flym.data.entities.Task;

@SuppressWarnings("unchecked")
public class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTask;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `tasks`(`entryId`,`imageLinkToDl`,`numberAttempt`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getEntryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEntryId());
        }
        if (value.getImageLinkToDl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageLinkToDl());
        }
        stmt.bindLong(3, value.getNumberAttempt());
      }
    };
    this.__deletionAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `tasks` WHERE `entryId` = ? AND `imageLinkToDl` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getEntryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEntryId());
        }
        if (value.getImageLinkToDl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageLinkToDl());
        }
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `tasks` SET `entryId` = ?,`imageLinkToDl` = ?,`numberAttempt` = ? WHERE `entryId` = ? AND `imageLinkToDl` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getEntryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEntryId());
        }
        if (value.getImageLinkToDl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getImageLinkToDl());
        }
        stmt.bindLong(3, value.getNumberAttempt());
        if (value.getEntryId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEntryId());
        }
        if (value.getImageLinkToDl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getImageLinkToDl());
        }
      }
    };
  }

  @Override
  public void insert(Task... tasks) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfTask.insert(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Task... tasks) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Task... tasks) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTask.handleMultiple(tasks);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Task> getAll() {
    final String _sql = "SELECT * FROM tasks";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfEntryId = _cursor.getColumnIndexOrThrow("entryId");
      final int _cursorIndexOfImageLinkToDl = _cursor.getColumnIndexOrThrow("imageLinkToDl");
      final int _cursorIndexOfNumberAttempt = _cursor.getColumnIndexOrThrow("numberAttempt");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final String _tmpEntryId;
        _tmpEntryId = _cursor.getString(_cursorIndexOfEntryId);
        _item.setEntryId(_tmpEntryId);
        final String _tmpImageLinkToDl;
        _tmpImageLinkToDl = _cursor.getString(_cursorIndexOfImageLinkToDl);
        _item.setImageLinkToDl(_tmpImageLinkToDl);
        final int _tmpNumberAttempt;
        _tmpNumberAttempt = _cursor.getInt(_cursorIndexOfNumberAttempt);
        _item.setNumberAttempt(_tmpNumberAttempt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<Task>> getObserveAll() {
    final String _sql = "SELECT * FROM tasks";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new ComputableLiveData<List<Task>>() {
      private Observer _observer;

      @Override
      protected List<Task> compute() {
        if (_observer == null) {
          _observer = new Observer("tasks") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final int _cursorIndexOfEntryId = _cursor.getColumnIndexOrThrow("entryId");
          final int _cursorIndexOfImageLinkToDl = _cursor.getColumnIndexOrThrow("imageLinkToDl");
          final int _cursorIndexOfNumberAttempt = _cursor.getColumnIndexOrThrow("numberAttempt");
          final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Task _item;
            _item = new Task();
            final String _tmpEntryId;
            _tmpEntryId = _cursor.getString(_cursorIndexOfEntryId);
            _item.setEntryId(_tmpEntryId);
            final String _tmpImageLinkToDl;
            _tmpImageLinkToDl = _cursor.getString(_cursorIndexOfImageLinkToDl);
            _item.setImageLinkToDl(_tmpImageLinkToDl);
            final int _tmpNumberAttempt;
            _tmpNumberAttempt = _cursor.getInt(_cursorIndexOfNumberAttempt);
            _item.setNumberAttempt(_tmpNumberAttempt);
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
  public List<Task> getMobilizeTasks() {
    final String _sql = "SELECT * FROM tasks WHERE imageLinkToDl = ''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfEntryId = _cursor.getColumnIndexOrThrow("entryId");
      final int _cursorIndexOfImageLinkToDl = _cursor.getColumnIndexOrThrow("imageLinkToDl");
      final int _cursorIndexOfNumberAttempt = _cursor.getColumnIndexOrThrow("numberAttempt");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final String _tmpEntryId;
        _tmpEntryId = _cursor.getString(_cursorIndexOfEntryId);
        _item.setEntryId(_tmpEntryId);
        final String _tmpImageLinkToDl;
        _tmpImageLinkToDl = _cursor.getString(_cursorIndexOfImageLinkToDl);
        _item.setImageLinkToDl(_tmpImageLinkToDl);
        final int _tmpNumberAttempt;
        _tmpNumberAttempt = _cursor.getInt(_cursorIndexOfNumberAttempt);
        _item.setNumberAttempt(_tmpNumberAttempt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Integer> observeItemMobilizationTasksCount(String itemId) {
    final String _sql = "SELECT COUNT(*) FROM tasks WHERE imageLinkToDl = '' AND entryId = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (itemId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, itemId);
    }
    return new ComputableLiveData<Integer>() {
      private Observer _observer;

      @Override
      protected Integer compute() {
        if (_observer == null) {
          _observer = new Observer("tasks") {
            @Override
            public void onInvalidated(@NonNull Set<String> tables) {
              invalidate();
            }
          };
          __db.getInvalidationTracker().addWeakObserver(_observer);
        }
        final Cursor _cursor = __db.query(_statement);
        try {
          final Integer _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
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
  public List<Task> getDownloadTasks() {
    final String _sql = "SELECT * FROM tasks WHERE imageLinkToDl != ''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfEntryId = _cursor.getColumnIndexOrThrow("entryId");
      final int _cursorIndexOfImageLinkToDl = _cursor.getColumnIndexOrThrow("imageLinkToDl");
      final int _cursorIndexOfNumberAttempt = _cursor.getColumnIndexOrThrow("numberAttempt");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final String _tmpEntryId;
        _tmpEntryId = _cursor.getString(_cursorIndexOfEntryId);
        _item.setEntryId(_tmpEntryId);
        final String _tmpImageLinkToDl;
        _tmpImageLinkToDl = _cursor.getString(_cursorIndexOfImageLinkToDl);
        _item.setImageLinkToDl(_tmpImageLinkToDl);
        final int _tmpNumberAttempt;
        _tmpNumberAttempt = _cursor.getInt(_cursorIndexOfNumberAttempt);
        _item.setNumberAttempt(_tmpNumberAttempt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
