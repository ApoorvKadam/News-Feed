package net.frju.flym.data.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"FEED_ID", "", "JOIN", "LIGHT_SELECT", "LIKE_SEARCH", "OLDER", "ORDER_BY", "app_debug"})
public final class EntryDaoKt {
    private static final java.lang.String LIGHT_SELECT = "id, entries.feedId, feedLink, feedTitle, fetchDate, publicationDate, title, description, imageLink, read, favorite";
    private static final java.lang.String ORDER_BY = "ORDER BY publicationDate DESC, id";
    private static final java.lang.String JOIN = "entries INNER JOIN feeds ON entries.feedId = feeds.feedId";
    private static final java.lang.String OLDER = "fetchDate <= :maxDate";
    private static final java.lang.String FEED_ID = "entries.feedId IS :feedId";
    private static final java.lang.String LIKE_SEARCH = "LIKE \'%\' || :searchText || \'%\'";
}