package net.frju.flym.data.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0018H\u00d6\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005H\u00c6\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lnet/frju/flym/data/entities/FeedWithCount;", "Landroid/os/Parcelable;", "feed", "Lnet/frju/flym/data/entities/Feed;", "entryCount", "", "(Lnet/frju/flym/data/entities/Feed;I)V", "getEntryCount", "()I", "setEntryCount", "(I)V", "getFeed", "()Lnet/frju/flym/data/entities/Feed;", "setFeed", "(Lnet/frju/flym/data/entities/Feed;)V", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "getEntryCountString", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class FeedWithCount implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Embedded()
    private net.frju.flym.data.entities.Feed feed;
    private int entryCount;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEntryCountString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.frju.flym.data.entities.Feed getFeed() {
        return null;
    }
    
    public final void setFeed(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed p0) {
    }
    
    public final int getEntryCount() {
        return 0;
    }
    
    public final void setEntryCount(int p0) {
    }
    
    public FeedWithCount(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed feed, int entryCount) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.frju.flym.data.entities.Feed component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.frju.flym.data.entities.FeedWithCount copy(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Feed feed, int entryCount) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public final int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public final void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}