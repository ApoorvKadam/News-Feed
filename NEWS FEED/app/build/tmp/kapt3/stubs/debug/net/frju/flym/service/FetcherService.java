package net.frju.flym.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lnet/frju/flym/service/FetcherService;", "Landroid/app/IntentService;", "()V", "handler", "Landroid/os/Handler;", "onHandleIntent", "", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class FetcherService extends android.app.IntentService {
    private final android.os.Handler handler = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_FEED_ID = "EXTRA_FEED_ID";
    private static final java.net.CookieManager COOKIE_MANAGER = null;
    private static final okhttp3.OkHttpClient HTTP_CLIENT = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_AUTO_REFRESH = "FROM_AUTO_REFRESH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_REFRESH_FEEDS = "net.frju.flym.REFRESH";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_MOBILIZE_FEEDS = "net.frju.flym.MOBILIZE_FEEDS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_DOWNLOAD_IMAGES = "net.frju.flym.DOWNLOAD_IMAGES";
    private static final int THREAD_NUMBER = 3;
    private static final int MAX_TASK_ATTEMPT = 3;
    private static final java.io.File IMAGE_FOLDER_FILE = null;
    private static final java.lang.String IMAGE_FOLDER = null;
    private static final java.lang.String TEMP_PREFIX = "TEMP__";
    private static final java.lang.String ID_SEPARATOR = "__";
    public static final net.frju.flym.service.FetcherService.Companion Companion = null;
    
    @java.lang.Override()
    public void onHandleIntent(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    public FetcherService() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018J \u0010\u0019\u001a\u00020\u00162\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0004J\u0010\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002J(\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\b\b\u0002\u0010-\u001a\u00020!J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0004H\u0002J\u0016\u00100\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004J\u0016\u00101\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004J\u0018\u00102\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0004H\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\u0018\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u0002062\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00107\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002J\u0006\u00108\u001a\u00020+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lnet/frju/flym/service/FetcherService$Companion;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "ACTION_DOWNLOAD_IMAGES", "", "ACTION_MOBILIZE_FEEDS", "ACTION_REFRESH_FEEDS", "COOKIE_MANAGER", "Ljava/net/CookieManager;", "EXTRA_FEED_ID", "FROM_AUTO_REFRESH", "HTTP_CLIENT", "Lokhttp3/OkHttpClient;", "ID_SEPARATOR", "IMAGE_FOLDER", "IMAGE_FOLDER_FILE", "Ljava/io/File;", "MAX_TASK_ATTEMPT", "", "TEMP_PREFIX", "THREAD_NUMBER", "addEntriesToMobilize", "", "entryIds", "", "addImagesToDownload", "imgUrlsToDownload", "", "createCall", "Lokhttp3/Call;", "url", "deleteEntriesImagesCache", "keepDateBorderTime", "", "deleteOldEntries", "downloadAllImages", "downloadImage", "entryId", "imgUrl", "fetch", "context", "Landroid/content/Context;", "isFromAutoRefresh", "", "action", "feedId", "getBaseUrl", "link", "getDownloadedImagePath", "getDownloadedOrDistantImageUrl", "getTempDownloadedImagePath", "mobilizeAllEntries", "refreshFeed", "feed", "Lnet/frju/flym/data/entities/Feed;", "refreshFeeds", "shouldDownloadPictures", "app_debug"})
    public static final class Companion implements org.jetbrains.anko.AnkoLogger {
        
        @org.jetbrains.annotations.NotNull()
        public final okhttp3.Call createCall(@org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            return null;
        }
        
        public final void fetch(@org.jetbrains.annotations.NotNull()
        android.content.Context context, boolean isFromAutoRefresh, @org.jetbrains.annotations.NotNull()
        java.lang.String action, long feedId) {
        }
        
        public final boolean shouldDownloadPictures() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDownloadedImagePath(@org.jetbrains.annotations.NotNull()
        java.lang.String entryId, @org.jetbrains.annotations.NotNull()
        java.lang.String imgUrl) {
            return null;
        }
        
        private final java.lang.String getTempDownloadedImagePath(java.lang.String entryId, java.lang.String imgUrl) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDownloadedOrDistantImageUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String entryId, @org.jetbrains.annotations.NotNull()
        java.lang.String imgUrl) {
            return null;
        }
        
        public final void addImagesToDownload(@org.jetbrains.annotations.NotNull()
        java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> imgUrlsToDownload) {
        }
        
        public final void addEntriesToMobilize(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> entryIds) {
        }
        
        private final void mobilizeAllEntries() {
        }
        
        private final void downloadAllImages() {
        }
        
        private final int refreshFeeds(long keepDateBorderTime) {
            return 0;
        }
        
        private final int refreshFeed(net.frju.flym.data.entities.Feed feed, long keepDateBorderTime) {
            return 0;
        }
        
        private final void deleteOldEntries(long keepDateBorderTime) {
        }
        
        private final void downloadImage(java.lang.String entryId, java.lang.String imgUrl) throws java.io.IOException {
        }
        
        private final void deleteEntriesImagesCache(long keepDateBorderTime) {
        }
        
        private final java.lang.String getBaseUrl(java.lang.String link) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public java.lang.String getLoggerTag() {
            return null;
        }
    }
}