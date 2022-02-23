package net.frju.flym.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lnet/frju/flym/ui/main/FeedSearchDialog;", "Lir/mirrajabi/searchdialog/SimpleSearchDialogCompat;", "Lnet/frju/flym/data/entities/SearchFeedResult;", "Lorg/jetbrains/anko/AnkoLogger;", "context", "Landroid/content/Context;", "defaultFeeds", "", "(Landroid/content/Context;Ljava/util/List;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class FeedSearchDialog extends ir.mirrajabi.searchdialog.SimpleSearchDialogCompat<net.frju.flym.data.entities.SearchFeedResult> implements org.jetbrains.anko.AnkoLogger {
    private final java.util.List<net.frju.flym.data.entities.SearchFeedResult> defaultFeeds = null;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public FeedSearchDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<net.frju.flym.data.entities.SearchFeedResult> defaultFeeds) {
        super(null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}