package net.frju.flym.data;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import net.frju.flym.data.dao.EntryDao;
import net.frju.flym.data.dao.EntryDao_Impl;
import net.frju.flym.data.dao.FeedDao;
import net.frju.flym.data.dao.FeedDao_Impl;
import net.frju.flym.data.dao.TaskDao;
import net.frju.flym.data.dao.TaskDao_Impl;

@SuppressWarnings("unchecked")
public class AppDatabase_Impl extends AppDatabase {
  private volatile FeedDao _feedDao;

  private volatile EntryDao _entryDao;

  private volatile TaskDao _taskDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `feeds` (`feedId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `feedLink` TEXT NOT NULL, `feedTitle` TEXT, `feedImageLink` TEXT, `fetchError` INTEGER NOT NULL, `retrieveFullText` INTEGER NOT NULL, `isGroup` INTEGER NOT NULL, `groupId` INTEGER, `displayPriority` INTEGER NOT NULL, `lastManualActionUid` TEXT NOT NULL, FOREIGN KEY(`groupId`) REFERENCES `feeds`(`feedId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE  INDEX `index_feeds_groupId` ON `feeds` (`groupId`)");
        _db.execSQL("CREATE UNIQUE INDEX `index_feeds_feedId_feedLink` ON `feeds` (`feedId`, `feedLink`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `entries` (`id` TEXT NOT NULL, `feedId` INTEGER NOT NULL, `link` TEXT, `fetchDate` INTEGER NOT NULL, `publicationDate` INTEGER NOT NULL, `title` TEXT, `description` TEXT, `mobilizedContent` TEXT, `imageLink` TEXT, `author` TEXT, `read` INTEGER NOT NULL, `favorite` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`feedId`) REFERENCES `feeds`(`feedId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE  INDEX `index_entries_feedId` ON `entries` (`feedId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tasks` (`entryId` TEXT NOT NULL, `imageLinkToDl` TEXT NOT NULL, `numberAttempt` INTEGER NOT NULL, PRIMARY KEY(`entryId`, `imageLinkToDl`), FOREIGN KEY(`entryId`) REFERENCES `entries`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE  INDEX `index_tasks_entryId` ON `tasks` (`entryId`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"dd7e9e52effd15fd1349c5cb84e150cd\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `feeds`");
        _db.execSQL("DROP TABLE IF EXISTS `entries`");
        _db.execSQL("DROP TABLE IF EXISTS `tasks`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFeeds = new HashMap<String, TableInfo.Column>(10);
        _columnsFeeds.put("feedId", new TableInfo.Column("feedId", "INTEGER", true, 1));
        _columnsFeeds.put("feedLink", new TableInfo.Column("feedLink", "TEXT", true, 0));
        _columnsFeeds.put("feedTitle", new TableInfo.Column("feedTitle", "TEXT", false, 0));
        _columnsFeeds.put("feedImageLink", new TableInfo.Column("feedImageLink", "TEXT", false, 0));
        _columnsFeeds.put("fetchError", new TableInfo.Column("fetchError", "INTEGER", true, 0));
        _columnsFeeds.put("retrieveFullText", new TableInfo.Column("retrieveFullText", "INTEGER", true, 0));
        _columnsFeeds.put("isGroup", new TableInfo.Column("isGroup", "INTEGER", true, 0));
        _columnsFeeds.put("groupId", new TableInfo.Column("groupId", "INTEGER", false, 0));
        _columnsFeeds.put("displayPriority", new TableInfo.Column("displayPriority", "INTEGER", true, 0));
        _columnsFeeds.put("lastManualActionUid", new TableInfo.Column("lastManualActionUid", "TEXT", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFeeds = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysFeeds.add(new TableInfo.ForeignKey("feeds", "CASCADE", "NO ACTION",Arrays.asList("groupId"), Arrays.asList("feedId")));
        final HashSet<TableInfo.Index> _indicesFeeds = new HashSet<TableInfo.Index>(2);
        _indicesFeeds.add(new TableInfo.Index("index_feeds_groupId", false, Arrays.asList("groupId")));
        _indicesFeeds.add(new TableInfo.Index("index_feeds_feedId_feedLink", true, Arrays.asList("feedId","feedLink")));
        final TableInfo _infoFeeds = new TableInfo("feeds", _columnsFeeds, _foreignKeysFeeds, _indicesFeeds);
        final TableInfo _existingFeeds = TableInfo.read(_db, "feeds");
        if (! _infoFeeds.equals(_existingFeeds)) {
          throw new IllegalStateException("Migration didn't properly handle feeds(net.frju.flym.data.entities.Feed).\n"
                  + " Expected:\n" + _infoFeeds + "\n"
                  + " Found:\n" + _existingFeeds);
        }
        final HashMap<String, TableInfo.Column> _columnsEntries = new HashMap<String, TableInfo.Column>(12);
        _columnsEntries.put("id", new TableInfo.Column("id", "TEXT", true, 1));
        _columnsEntries.put("feedId", new TableInfo.Column("feedId", "INTEGER", true, 0));
        _columnsEntries.put("link", new TableInfo.Column("link", "TEXT", false, 0));
        _columnsEntries.put("fetchDate", new TableInfo.Column("fetchDate", "INTEGER", true, 0));
        _columnsEntries.put("publicationDate", new TableInfo.Column("publicationDate", "INTEGER", true, 0));
        _columnsEntries.put("title", new TableInfo.Column("title", "TEXT", false, 0));
        _columnsEntries.put("description", new TableInfo.Column("description", "TEXT", false, 0));
        _columnsEntries.put("mobilizedContent", new TableInfo.Column("mobilizedContent", "TEXT", false, 0));
        _columnsEntries.put("imageLink", new TableInfo.Column("imageLink", "TEXT", false, 0));
        _columnsEntries.put("author", new TableInfo.Column("author", "TEXT", false, 0));
        _columnsEntries.put("read", new TableInfo.Column("read", "INTEGER", true, 0));
        _columnsEntries.put("favorite", new TableInfo.Column("favorite", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEntries = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysEntries.add(new TableInfo.ForeignKey("feeds", "CASCADE", "NO ACTION",Arrays.asList("feedId"), Arrays.asList("feedId")));
        final HashSet<TableInfo.Index> _indicesEntries = new HashSet<TableInfo.Index>(1);
        _indicesEntries.add(new TableInfo.Index("index_entries_feedId", false, Arrays.asList("feedId")));
        final TableInfo _infoEntries = new TableInfo("entries", _columnsEntries, _foreignKeysEntries, _indicesEntries);
        final TableInfo _existingEntries = TableInfo.read(_db, "entries");
        if (! _infoEntries.equals(_existingEntries)) {
          throw new IllegalStateException("Migration didn't properly handle entries(net.frju.flym.data.entities.Entry).\n"
                  + " Expected:\n" + _infoEntries + "\n"
                  + " Found:\n" + _existingEntries);
        }
        final HashMap<String, TableInfo.Column> _columnsTasks = new HashMap<String, TableInfo.Column>(3);
        _columnsTasks.put("entryId", new TableInfo.Column("entryId", "TEXT", true, 1));
        _columnsTasks.put("imageLinkToDl", new TableInfo.Column("imageLinkToDl", "TEXT", true, 2));
        _columnsTasks.put("numberAttempt", new TableInfo.Column("numberAttempt", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTasks = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysTasks.add(new TableInfo.ForeignKey("entries", "CASCADE", "NO ACTION",Arrays.asList("entryId"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesTasks = new HashSet<TableInfo.Index>(1);
        _indicesTasks.add(new TableInfo.Index("index_tasks_entryId", false, Arrays.asList("entryId")));
        final TableInfo _infoTasks = new TableInfo("tasks", _columnsTasks, _foreignKeysTasks, _indicesTasks);
        final TableInfo _existingTasks = TableInfo.read(_db, "tasks");
        if (! _infoTasks.equals(_existingTasks)) {
          throw new IllegalStateException("Migration didn't properly handle tasks(net.frju.flym.data.entities.Task).\n"
                  + " Expected:\n" + _infoTasks + "\n"
                  + " Found:\n" + _existingTasks);
        }
      }
    }, "dd7e9e52effd15fd1349c5cb84e150cd", "bc64d14b30f55ca91b87fb83342fb565");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "feeds","entries","tasks");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `feeds`");
      _db.execSQL("DELETE FROM `entries`");
      _db.execSQL("DELETE FROM `tasks`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public FeedDao feedDao() {
    if (_feedDao != null) {
      return _feedDao;
    } else {
      synchronized(this) {
        if(_feedDao == null) {
          _feedDao = new FeedDao_Impl(this);
        }
        return _feedDao;
      }
    }
  }

  @Override
  public EntryDao entryDao() {
    if (_entryDao != null) {
      return _entryDao;
    } else {
      synchronized(this) {
        if(_entryDao == null) {
          _entryDao = new EntryDao_Impl(this);
        }
        return _entryDao;
      }
    }
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }
}
