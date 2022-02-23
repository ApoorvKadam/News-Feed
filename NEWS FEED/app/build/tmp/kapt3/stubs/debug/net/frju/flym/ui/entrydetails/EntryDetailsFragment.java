package net.frju.flym.ui.entrydetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010%\u001a\u00020\u001bH\u0016J\u001c\u0010&\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\b\u0010\'\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u001bH\u0002R*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lnet/frju/flym/ui/entrydetails/EntryDetailsFragment;", "Landroid/support/v4/app/Fragment;", "()V", "value", "", "", "allEntryIds", "setAllEntryIds", "(Ljava/util/List;)V", "entryId", "entryWithFeed", "Lnet/frju/flym/data/entities/EntryWithFeed;", "isMobilizing", "", "isMobilizingLiveData", "Landroid/arch/lifecycle/LiveData;", "", "navigator", "Lnet/frju/flym/ui/main/MainNavigator;", "getNavigator", "()Lnet/frju/flym/ui/main/MainNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "nextId", "preferFullText", "previousId", "initDataObservers", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setEntry", "setupToolbar", "switchFullTextMode", "Companion", "app_debug"})
public final class EntryDetailsFragment extends android.support.v4.app.Fragment {
    private final kotlin.Lazy navigator$delegate = null;
    private java.lang.String entryId;
    private net.frju.flym.data.entities.EntryWithFeed entryWithFeed;
    private java.util.List<java.lang.String> allEntryIds;
    private java.lang.String previousId;
    private java.lang.String nextId;
    private android.arch.lifecycle.LiveData<java.lang.Integer> isMobilizingLiveData;
    private boolean isMobilizing;
    private boolean preferFullText;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ENTRY_ID = "ARG_ENTRY_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_ALL_ENTRIES_IDS = "ARG_ALL_ENTRIES_IDS";
    public static final net.frju.flym.ui.entrydetails.EntryDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final net.frju.flym.ui.main.MainNavigator getNavigator() {
        return null;
    }
    
    private final void setAllEntryIds(java.util.List<java.lang.String> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDataObservers() {
    }
    
    private final void setupToolbar() {
    }
    
    private final void switchFullTextMode() {
    }
    
    public final void setEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String entryId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allEntryIds) {
    }
    
    public EntryDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lnet/frju/flym/ui/entrydetails/EntryDetailsFragment$Companion;", "", "()V", "ARG_ALL_ENTRIES_IDS", "", "ARG_ENTRY_ID", "newInstance", "Lnet/frju/flym/ui/entrydetails/EntryDetailsFragment;", "entryId", "allEntryIds", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final net.frju.flym.ui.entrydetails.EntryDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String entryId, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> allEntryIds) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}