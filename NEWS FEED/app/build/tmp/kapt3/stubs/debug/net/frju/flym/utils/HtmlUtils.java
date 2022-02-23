package net.frju.flym.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\u0006\u0010\u0017\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0005*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lnet/frju/flym/utils/HtmlUtils;", "", "()V", "ADS_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "BAD_IMAGE_PATTERN", "EMPTY_IMAGE_PATTERN", "EMPTY_LINK_PATTERN", "END_BR_PATTERN", "IMG_PATTERN", "JSOUP_WHITELIST", "Lorg/jsoup/safety/Whitelist;", "LAZY_LOADING_PATTERN", "MULTIPLE_BR_PATTERN", "NON_HTTP_IMAGE_PATTERN", "PIXEL_IMAGE_PATTERN", "SRCSET_PATTERN", "START_BR_PATTERN", "URL_SPACE", "", "getImageURLs", "Ljava/util/ArrayList;", "content", "getMainImageURL", "imgUrls", "improveHtmlContent", "baseUri", "isCorrectImage", "", "imgUrl", "replaceImageURLs", "itemId", "app_debug"})
public final class HtmlUtils {
    private static final org.jsoup.safety.Whitelist JSOUP_WHITELIST = null;
    private static final java.lang.String URL_SPACE = "%20";
    private static final java.util.regex.Pattern IMG_PATTERN = null;
    private static final java.util.regex.Pattern ADS_PATTERN = null;
    private static final java.util.regex.Pattern SRCSET_PATTERN = null;
    private static final java.util.regex.Pattern LAZY_LOADING_PATTERN = null;
    private static final java.util.regex.Pattern PIXEL_IMAGE_PATTERN = null;
    private static final java.util.regex.Pattern NON_HTTP_IMAGE_PATTERN = null;
    private static final java.util.regex.Pattern BAD_IMAGE_PATTERN = null;
    private static final java.util.regex.Pattern EMPTY_IMAGE_PATTERN = null;
    private static final java.util.regex.Pattern START_BR_PATTERN = null;
    private static final java.util.regex.Pattern END_BR_PATTERN = null;
    private static final java.util.regex.Pattern MULTIPLE_BR_PATTERN = null;
    private static final java.util.regex.Pattern EMPTY_LINK_PATTERN = null;
    public static final net.frju.flym.utils.HtmlUtils INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String improveHtmlContent(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImageURLs(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String replaceImageURLs(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.lang.String itemId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMainImageURL(@org.jetbrains.annotations.NotNull()
    java.lang.String content) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMainImageURL(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> imgUrls) {
        return null;
    }
    
    private final boolean isCorrectImage(java.lang.String imgUrl) {
        return false;
    }
    
    private HtmlUtils() {
        super();
    }
}