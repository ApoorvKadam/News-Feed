package net.frju.flym.data.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\n \u0018*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004J@\u0010\u0019\u001a&\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u0004 \u0018*\u0012\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u001b0\u001a2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0010J\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0014J\u0016\u0010 \u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0016J\u0016\u0010!\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001c\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aJ\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\'\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020%R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lnet/frju/flym/data/utils/PrefUtils;", "", "()V", "DISPLAY_IMAGES", "", "FIRST_OPEN", "FONT_SIZE", "IS_REFRESHING", "KEEP_TIME", "PRELOAD_IMAGE_MODE", "PRELOAD_IMAGE_MODE__ALWAYS", "PRELOAD_IMAGE_MODE__WIFI_ONLY", "REFRESH_ENABLED", "REFRESH_INTERVAL", "REFRESH_WIFI_ONLY", "getBoolean", "", "key", "defValue", "getInt", "", "getLong", "", "getString", "kotlin.jvm.PlatformType", "getStringSet", "", "", "putBoolean", "", "value", "putInt", "putLong", "putString", "putStringSet", "registerOnPrefChangeListener", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "remove", "unregisterOnPrefChangeListener", "app_debug"})
public final class PrefUtils {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FIRST_OPEN = "first_open";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IS_REFRESHING = "is_refreshing";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESH_ENABLED = "refresh_enabled";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESH_INTERVAL = "refresh_interval";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REFRESH_WIFI_ONLY = "refresh_wifi_only";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DISPLAY_IMAGES = "display_images";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRELOAD_IMAGE_MODE = "preload_image_mode";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRELOAD_IMAGE_MODE__WIFI_ONLY = "WIFI_ONLY_PRELOAD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PRELOAD_IMAGE_MODE__ALWAYS = "ALWAYS_PRELOAD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEEP_TIME = "keep_time";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FONT_SIZE = "font_size";
    public static final net.frju.flym.data.utils.PrefUtils INSTANCE = null;
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defValue) {
        return false;
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defValue) {
        return 0;
    }
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final long getLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defValue) {
        return 0L;
    }
    
    public final void putLong(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defValue) {
        return null;
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final java.util.Set<java.lang.String> getStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> defValue) {
        return null;
    }
    
    public final void putStringSet(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> value) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void registerOnPrefChangeListener(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    public final void unregisterOnPrefChangeListener(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.OnSharedPreferenceChangeListener listener) {
    }
    
    private PrefUtils() {
        super();
    }
}