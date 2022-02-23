package net.frju.flym.ui.entries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001a\u001bB3\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0015H\u0016R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lnet/frju/flym/ui/entries/EntryAdapter;", "Landroid/arch/paging/PagedListAdapter;", "Lnet/frju/flym/data/entities/EntryWithFeed;", "Lnet/frju/flym/ui/entries/EntryAdapter$ViewHolder;", "globalClickListener", "Lkotlin/Function1;", "", "favoriteClickListener", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "newValue", "", "selectedEntryId", "getSelectedEntryId", "()Ljava/lang/String;", "setSelectedEntryId", "(Ljava/lang/String;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class EntryAdapter extends android.arch.paging.PagedListAdapter<net.frju.flym.data.entities.EntryWithFeed, net.frju.flym.ui.entries.EntryAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectedEntryId;
    private final kotlin.jvm.functions.Function1<net.frju.flym.data.entities.EntryWithFeed, kotlin.Unit> globalClickListener = null;
    private final kotlin.jvm.functions.Function2<net.frju.flym.data.entities.EntryWithFeed, android.widget.ImageView, kotlin.Unit> favoriteClickListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final android.support.v7.util.DiffUtil.ItemCallback<net.frju.flym.data.entities.EntryWithFeed> DIFF_CALLBACK = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.bumptech.glide.request.transition.DrawableCrossFadeFactory CROSS_FADE_FACTORY = null;
    public static final net.frju.flym.ui.entries.EntryAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public net.frju.flym.ui.entries.EntryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    net.frju.flym.ui.entries.EntryAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectedEntryId() {
        return null;
    }
    
    public final void setSelectedEntryId(@org.jetbrains.annotations.Nullable()
    java.lang.String newValue) {
    }
    
    public EntryAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super net.frju.flym.data.entities.EntryWithFeed, kotlin.Unit> globalClickListener, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super net.frju.flym.data.entities.EntryWithFeed, ? super android.widget.ImageView, kotlin.Unit> favoriteClickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J>\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\fH\u0007J\u000b\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lnet/frju/flym/ui/entries/EntryAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "entryWithFeed", "Lnet/frju/flym/data/entities/EntryWithFeed;", "globalClickListener", "Lkotlin/Function1;", "favoriteClickListener", "Lkotlin/Function2;", "Landroid/widget/ImageView;", "clear", "error/NonExistentClass", "()Lerror/NonExistentClass;", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        net.frju.flym.data.entities.EntryWithFeed entryWithFeed, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super net.frju.flym.data.entities.EntryWithFeed, kotlin.Unit> globalClickListener, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super net.frju.flym.data.entities.EntryWithFeed, ? super android.widget.ImageView, kotlin.Unit> favoriteClickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final error.NonExistentClass clear() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lnet/frju/flym/ui/entries/EntryAdapter$Companion;", "", "()V", "CROSS_FADE_FACTORY", "Lcom/bumptech/glide/request/transition/DrawableCrossFadeFactory;", "DIFF_CALLBACK", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lnet/frju/flym/data/entities/EntryWithFeed;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}