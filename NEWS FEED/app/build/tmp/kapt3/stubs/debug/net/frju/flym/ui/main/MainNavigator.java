package net.frju.flym.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u000fJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u001e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&\u00a8\u0006\u0010"}, d2 = {"Lnet/frju/flym/ui/main/MainNavigator;", "", "goToAboutMe", "", "goToEntriesList", "feed", "Lnet/frju/flym/data/entities/Feed;", "goToEntryDetails", "entryId", "", "allEntryIds", "", "goToSettings", "setSelectedEntryId", "selectedEntryId", "State", "app_debug"})
public abstract interface MainNavigator {
    
    public abstract void goToEntriesList(@org.jetbrains.annotations.Nullable()
    net.frju.flym.data.entities.Feed feed);
    
    public abstract void goToEntryDetails(@org.jetbrains.annotations.NotNull()
    java.lang.String entryId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allEntryIds);
    
    public abstract void goToAboutMe();
    
    public abstract void goToSettings();
    
    public abstract void setSelectedEntryId(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedEntryId);
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lnet/frju/flym/ui/main/MainNavigator$State;", "", "(Ljava/lang/String;I)V", "SINGLE_COLUMN_MASTER", "SINGLE_COLUMN_DETAILS", "TWO_COLUMNS_EMPTY", "TWO_COLUMNS_WITH_DETAILS", "app_debug"})
    public static enum State {
        /*public static final*/ SINGLE_COLUMN_MASTER /* = new SINGLE_COLUMN_MASTER() */,
        /*public static final*/ SINGLE_COLUMN_DETAILS /* = new SINGLE_COLUMN_DETAILS() */,
        /*public static final*/ TWO_COLUMNS_EMPTY /* = new TWO_COLUMNS_EMPTY() */,
        /*public static final*/ TWO_COLUMNS_WITH_DETAILS /* = new TWO_COLUMNS_WITH_DETAILS() */;
        
        State() {
        }
    }
}