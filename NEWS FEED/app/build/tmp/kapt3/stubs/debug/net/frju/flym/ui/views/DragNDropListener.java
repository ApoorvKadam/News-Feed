package net.frju.flym.ui.views;

import java.lang.System;

/**
 * * Implement to handle an item being dragged.
 * *
 * * @author Eric Harlow
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&\u00a8\u0006\u000f"}, d2 = {"Lnet/frju/flym/ui/views/DragNDropListener;", "", "onDrag", "", "x", "", "y", "onDrop", "posFrom", "", "posTo", "onStartDrag", "itemView", "Landroid/view/View;", "onStopDrag", "app_debug"})
public abstract interface DragNDropListener {
    
    /**
     * * Called when a drag starts.
     *     *
     *     * @param itemView the view of the item to be dragged i.e. the drag view
     */
    public abstract void onStartDrag(@org.jetbrains.annotations.NotNull()
    android.view.View itemView);
    
    /**
     * * Called when a drag is to be performed.
     *     *
     *     * @param x        horizontal coordinate of MotionEvent.
     *     * @param y        vertical coordinate of MotionEvent.
     */
    public abstract void onDrag(float x, float y);
    
    /**
     * * Called when a drag stops. Any changes in onStartDrag need to be undone here so that the view can be used in the list again.
     *     *
     *     * @param itemView the view of the item to be dragged i.e. the drag view
     */
    public abstract void onStopDrag(@org.jetbrains.annotations.NotNull()
    android.view.View itemView);
    
    /**
     * * Called when an item is to be dropped.
     *     *
     *     * @param posFrom index item started at.
     *     * @param posTo   index to place item at.
     */
    public abstract void onDrop(int posFrom, int posTo);
}