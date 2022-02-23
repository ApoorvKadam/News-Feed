package net.frju.flym.data.entities;

import java.lang.System;

@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0019H\u00c6\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u00c6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lnet/frju/flym/data/entities/EntryWithFeed;", "Landroid/os/Parcelable;", "entry", "Lnet/frju/flym/data/entities/Entry;", "feedTitle", "", "feedLink", "feedImageLink", "groupId", "(Lnet/frju/flym/data/entities/Entry;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEntry", "()Lnet/frju/flym/data/entities/Entry;", "setEntry", "(Lnet/frju/flym/data/entities/Entry;)V", "getFeedImageLink", "()Ljava/lang/String;", "setFeedImageLink", "(Ljava/lang/String;)V", "getFeedLink", "setFeedLink", "getFeedTitle", "setFeedTitle", "getGroupId", "setGroupId", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class EntryWithFeed implements android.os.Parcelable {
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Embedded()
    private net.frju.flym.data.entities.Entry entry;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String feedTitle;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String feedLink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String feedImageLink;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String groupId;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @org.jetbrains.annotations.NotNull()
    public final net.frju.flym.data.entities.Entry getEntry() {
        return null;
    }
    
    public final void setEntry(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Entry p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFeedTitle() {
        return null;
    }
    
    public final void setFeedTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFeedLink() {
        return null;
    }
    
    public final void setFeedLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFeedImageLink() {
        return null;
    }
    
    public final void setFeedImageLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGroupId() {
        return null;
    }
    
    public final void setGroupId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public EntryWithFeed(@org.jetbrains.annotations.NotNull()
    net.frju.flym.data.entities.Entry entry, @org.jetbrains.annotations.Nullable()
    java.lang.String feedTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String feedLink, @org.jetbrains.annotations.Nullable()
    java.lang.String feedImageLink, @org.jetbrains.annotations.Nullable()
    java.lang.String groupId) {
        super();
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