package net.frju.flym.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0003J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u000bH\u0016J$\u0010\u001d\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\u0002J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\rH\u0002J\b\u0010$\u001a\u00020\u000bH\u0016J\u0012\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0012\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u000bH\u0014J+\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u0019002\u0006\u00101\u001a\u000202H\u0016\u00a2\u0006\u0002\u00103J\u0012\u00104\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u00105\u001a\u00020\u000bH\u0014J\u0010\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\'H\u0014J\b\u00108\u001a\u00020\u000bH\u0002J\u0010\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020\u000bH\u0003J\u0010\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u0019H\u0016J\b\u0010?\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lnet/frju/flym/ui/main/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lnet/frju/flym/ui/main/MainNavigator;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "feedAdapter", "Lnet/frju/flym/ui/feeds/FeedAdapter;", "feedGroups", "", "Lnet/frju/flym/ui/feeds/FeedGroup;", "autoImportOpml", "", "clearDetails", "", "closeDrawer", "exportOpml", "opmlWriter", "Ljava/io/Writer;", "goBack", "goToAboutMe", "goToEntriesList", "feed", "Lnet/frju/flym/data/entities/Feed;", "goToEntryDetails", "entryId", "", "allEntryIds", "", "goToSettings", "hasFeedGroupsChanged", "newFeedGroups", "hasFetchingError", "importOpml", "file", "Ljava/io/File;", "isOldFlymAppInstalled", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onPause", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onRestoreInstanceState", "onResume", "onSaveInstanceState", "outState", "openDrawer", "parseOpml", "opmlReader", "Ljava/io/Reader;", "pickOpml", "setSelectedEntryId", "selectedEntryId", "toggleDrawer", "Companion", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements net.frju.flym.ui.main.MainNavigator, org.jetbrains.anko.AnkoLogger {
    private final java.util.List<net.frju.flym.ui.feeds.FeedGroup> feedGroups = null;
    private final net.frju.flym.ui.feeds.FeedAdapter feedAdapter = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FROM_NOTIF = "EXTRA_FROM_NOTIF";
    private static boolean isInForeground;
    private static final java.lang.String TAG_DETAILS = "TAG_DETAILS";
    private static final java.lang.String TAG_MASTER = "TAG_MASTER";
    private static final java.lang.String OLD_GNEWS_TO_IGNORE = "http://news.google.com/news?";
    private static final int AUTO_IMPORT_OPML_REQUEST_CODE = 1;
    private static final int CHOOSE_OPML_REQUEST_CODE = 2;
    private static final int EXPORT_OPML_REQUEST_CODE = 3;
    private static final java.lang.String[] NEEDED_PERMS = null;
    private static final java.io.File BACKUP_OPML = null;
    private static final java.lang.String RETRIEVE_FULLTEXT_OPML_ATTR = "retrieveFullText";
    public static final net.frju.flym.ui.main.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void goToEntriesList(@org.jetbrains.annotations.Nullable()
    net.frju.flym.data.entities.Feed feed) {
    }
    
    @java.lang.Override()
    public void goToEntryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String entryId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allEntryIds) {
    }
    
    @java.lang.Override()
    public void setSelectedEntryId(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedEntryId) {
    }
    
    @java.lang.Override()
    public void goToAboutMe() {
    }
    
    @java.lang.Override()
    public void goToSettings() {
    }
    
    private final boolean isOldFlymAppInstalled() {
        return false;
    }
    
    private final boolean hasFeedGroupsChanged(java.util.List<net.frju.flym.ui.feeds.FeedGroup> feedGroups, java.util.List<net.frju.flym.ui.feeds.FeedGroup> newFeedGroups) {
        return false;
    }
    
    private final boolean hasFetchingError() {
        return false;
    }
    
    @pub.devrel.easypermissions.AfterPermissionGranted(value = 2)
    private final void pickOpml() {
    }
    
    @pub.devrel.easypermissions.AfterPermissionGranted(value = 3)
    private final void exportOpml() {
    }
    
    @pub.devrel.easypermissions.AfterPermissionGranted(value = 1)
    private final void autoImportOpml() {
    }
    
    private final void importOpml(java.io.File file) {
    }
    
    private final void parseOpml(java.io.Reader opmlReader) {
    }
    
    private final void exportOpml(java.io.Writer opmlWriter) {
    }
    
    private final void closeDrawer() {
    }
    
    private final void openDrawer() {
    }
    
    private final void toggleDrawer() {
    }
    
    private final boolean goBack() {
        return false;
    }
    
    private final boolean clearDetails() {
        return false;
    }
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lnet/frju/flym/ui/main/MainActivity$Companion;", "", "()V", "AUTO_IMPORT_OPML_REQUEST_CODE", "", "BACKUP_OPML", "Ljava/io/File;", "CHOOSE_OPML_REQUEST_CODE", "EXPORT_OPML_REQUEST_CODE", "EXTRA_FROM_NOTIF", "", "NEEDED_PERMS", "", "[Ljava/lang/String;", "OLD_GNEWS_TO_IGNORE", "RETRIEVE_FULLTEXT_OPML_ATTR", "TAG_DETAILS", "TAG_MASTER", "isInForeground", "", "()Z", "setInForeground", "(Z)V", "app_debug"})
    public static final class Companion {
        
        public final boolean isInForeground() {
            return false;
        }
        
        public final void setInForeground(boolean p0) {
        }
        
        private Companion() {
            super();
        }
    }
}