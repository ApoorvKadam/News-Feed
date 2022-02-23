package net.frju.flym.data.entities;

import java.lang.System;

@android.arch.persistence.room.Entity(tableName = "feeds", indices = {@android.arch.persistence.room.Index(value = {"groupId"}), @android.arch.persistence.room.Index(unique = true, value = {"feedId", "feedLink"})}, foreignKeys = {@android.arch.persistence.room.ForeignKey(entity = net.frju.flym.data.entities.Feed.class, childColumns = {"groupId"}, onDelete = 5, parentColumns = {"feedId"})})
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001LBo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0010J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\t\u00108\u001a\u00020\u000eH\u00c6\u0003Jx\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\t\u0010;\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010<\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010>H\u00d6\u0003J\u0010\u0010?\u001a\u00020@2\b\b\u0002\u0010A\u001a\u00020\tJ\t\u0010B\u001a\u00020\u000eH\u00d6\u0001J\t\u0010C\u001a\u00020\u0005H\u00d6\u0001J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJ\u0019\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u000eH\u00c6\u0001R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0016\"\u0004\b&\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010#\"\u0004\b(\u0010%R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010#\"\u0004\b.\u0010%\u00a8\u0006M"}, d2 = {"Lnet/frju/flym/data/entities/Feed;", "Landroid/os/Parcelable;", "id", "", "link", "", "title", "imageLink", "fetchError", "", "retrieveFullText", "isGroup", "groupId", "displayPriority", "", "lastManualActionUid", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Long;ILjava/lang/String;)V", "getDisplayPriority", "()I", "setDisplayPriority", "(I)V", "getFetchError", "()Z", "setFetchError", "(Z)V", "getGroupId", "()Ljava/lang/Long;", "setGroupId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "()J", "setId", "(J)V", "getImageLink", "()Ljava/lang/String;", "setImageLink", "(Ljava/lang/String;)V", "setGroup", "getLastManualActionUid", "setLastManualActionUid", "getLink", "setLink", "getRetrieveFullText", "setRetrieveFullText", "getTitle", "setTitle", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/Long;ILjava/lang/String;)Lnet/frju/flym/data/entities/Feed;", "describeContents", "equals", "other", "", "getLetterDrawable", "Lcom/amulyakhare/textdrawable/TextDrawable;", "rounded", "hashCode", "toString", "update", "", "feed", "Lcom/rometools/rome/feed/synd/SyndFeed;", "writeToParcel", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
public final class Feed implements android.os.Parcelable {
    @android.arch.persistence.room.ColumnInfo(name = "feedId")
    @android.arch.persistence.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.ColumnInfo(name = "feedLink")
    private java.lang.String link;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "feedTitle")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @android.arch.persistence.room.ColumnInfo(name = "feedImageLink")
    private java.lang.String imageLink;
    private boolean fetchError;
    private boolean retrieveFullText;
    private boolean isGroup;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Long groupId;
    private int displayPriority;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastManualActionUid;
    public static final long ALL_ENTRIES_ID = -1L;
    public static final net.frju.flym.data.entities.Feed.Companion Companion = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final void update(@org.jetbrains.annotations.NotNull()
    com.rometools.rome.feed.synd.SyndFeed feed) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.amulyakhare.textdrawable.TextDrawable getLetterDrawable(boolean rounded) {
        return null;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLink() {
        return null;
    }
    
    public final void setLink(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageLink() {
        return null;
    }
    
    public final void setImageLink(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getFetchError() {
        return false;
    }
    
    public final void setFetchError(boolean p0) {
    }
    
    public final boolean getRetrieveFullText() {
        return false;
    }
    
    public final void setRetrieveFullText(boolean p0) {
    }
    
    public final boolean isGroup() {
        return false;
    }
    
    public final void setGroup(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getGroupId() {
        return null;
    }
    
    public final void setGroupId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    public final int getDisplayPriority() {
        return 0;
    }
    
    public final void setDisplayPriority(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastManualActionUid() {
        return null;
    }
    
    public final void setLastManualActionUid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public Feed(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String imageLink, boolean fetchError, boolean retrieveFullText, boolean isGroup, @org.jetbrains.annotations.Nullable()
    java.lang.Long groupId, int displayPriority, @org.jetbrains.annotations.NotNull()
    java.lang.String lastManualActionUid) {
        super();
    }
    
    public Feed() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.frju.flym.data.entities.Feed copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String link, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String imageLink, boolean fetchError, boolean retrieveFullText, boolean isGroup, @org.jetbrains.annotations.Nullable()
    java.lang.Long groupId, int displayPriority, @org.jetbrains.annotations.NotNull()
    java.lang.String lastManualActionUid) {
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
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lnet/frju/flym/data/entities/Feed$Companion;", "", "()V", "ALL_ENTRIES_ID", "", "getLetterDrawable", "Lcom/amulyakhare/textdrawable/TextDrawable;", "feedId", "feedTitle", "", "rounded", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.amulyakhare.textdrawable.TextDrawable getLetterDrawable(long feedId, @org.jetbrains.annotations.Nullable()
        java.lang.String feedTitle, boolean rounded) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}