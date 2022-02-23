package net.frju.flym.ui.feeds;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lnet/frju/flym/ui/feeds/FeedAdapter;", "Lnet/frju/flym/ui/feeds/BaseFeedAdapter;", "groups", "", "Lnet/frju/flym/ui/feeds/FeedGroup;", "(Ljava/util/List;)V", "newValue", "", "selectedItemId", "getSelectedItemId", "()J", "setSelectedItemId", "(J)V", "bindItem", "", "itemView", "Landroid/view/View;", "feedWithCount", "Lnet/frju/flym/data/entities/FeedWithCount;", "group", "onRestoreInstanceState", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "app_debug"})
public class FeedAdapter extends net.frju.flym.ui.feeds.BaseFeedAdapter {
    private long selectedItemId;
    
    public final long getSelectedItemId() {
        return 0L;
    }
    
    public final void setSelectedItemId(long newValue) {
    }
    
    @java.lang.Override()
    public void bindItem(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.FeedWithCount feedWithCount) {
    }
    
    @java.lang.Override()
    public void bindItem(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    net.frju.flym.ui.feeds.FeedGroup group) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public FeedAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<net.frju.flym.ui.feeds.FeedGroup> groups) {
        super(null);
    }
}