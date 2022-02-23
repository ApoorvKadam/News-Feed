package net.frju.flym.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\b\u0010\u001c\u001a\u00020\u0010H\u0002R(\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lnet/frju/flym/ui/main/ContainersLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "state", "Lnet/frju/flym/ui/main/MainNavigator$State;", "getState", "()Lnet/frju/flym/ui/main/MainNavigator$State;", "setState", "(Lnet/frju/flym/ui/main/MainNavigator$State;)V", "animateInFrameDetails", "", "animateOutFrameDetails", "hasTwoColumns", "", "onRestoreInstanceState", "parcelable", "Landroid/os/Parcelable;", "onSaveInstanceState", "setupSecondColumn", "singleColumnDetails", "singleColumnMaster", "twoColumnsEmpty", "twoColumnsWithDetails", "Companion", "app_debug"})
public final class ContainersLayout extends android.widget.FrameLayout {
    @org.jetbrains.annotations.Nullable()
    private net.frju.flym.ui.main.MainNavigator.State state;
    public static final int ANIM_DURATION = 250;
    private static final java.lang.String STATE_SUPER = "state_super";
    private static final java.lang.String STATE_CONTAINERS_STATE = "state_containers_state";
    public static final net.frju.flym.ui.main.ContainersLayout.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final net.frju.flym.ui.main.MainNavigator.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.Nullable()
    net.frju.flym.ui.main.MainNavigator.State state) {
    }
    
    public final boolean hasTwoColumns() {
        return false;
    }
    
    private final void singleColumnMaster() {
    }
    
    private final void singleColumnDetails() {
    }
    
    private final void twoColumnsEmpty() {
    }
    
    private final void twoColumnsWithDetails() {
    }
    
    private final void setupSecondColumn() {
    }
    
    private final void animateInFrameDetails() {
    }
    
    private final void animateOutFrameDetails() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.os.Parcelable onSaveInstanceState() {
        return null;
    }
    
    @java.lang.Override()
    public void onRestoreInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Parcelable parcelable) {
    }
    
    public ContainersLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public ContainersLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ContainersLayout(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lnet/frju/flym/ui/main/ContainersLayout$Companion;", "", "()V", "ANIM_DURATION", "", "STATE_CONTAINERS_STATE", "", "STATE_SUPER", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}