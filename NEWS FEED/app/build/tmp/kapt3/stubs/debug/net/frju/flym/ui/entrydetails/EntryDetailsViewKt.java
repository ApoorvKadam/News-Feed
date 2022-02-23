package net.frju.flym.ui.entrydetails;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"BACKGROUND_COLOR", "", "BODY_END", "BODY_START", "CSS", "HTML_IMG_REGEX", "QUOTE_BACKGROUND_COLOR", "QUOTE_LEFT_COLOR", "SUBTITLE_BORDER_COLOR", "SUBTITLE_COLOR", "SUBTITLE_END", "SUBTITLE_START", "TEXT_COLOR", "TEXT_HTML", "TITLE_END", "TITLE_MIDDLE", "TITLE_START", "app_debug"})
public final class EntryDetailsViewKt {
    private static final java.lang.String TEXT_HTML = "text/html";
    private static final java.lang.String HTML_IMG_REGEX = "(?i)<[/]?[ ]?img(.|\n)*?>";
    private static final java.lang.String BACKGROUND_COLOR = "#202020";
    private static final java.lang.String QUOTE_BACKGROUND_COLOR = "#383b3f";
    private static final java.lang.String QUOTE_LEFT_COLOR = "#686b6f";
    private static final java.lang.String TEXT_COLOR = "#C0C0C0";
    private static final java.lang.String SUBTITLE_COLOR = "#8c8c8c";
    private static final java.lang.String SUBTITLE_BORDER_COLOR = "solid #303030";
    private static final java.lang.String CSS = "<head><style type=\'text/css\'> body {max-width: 100%; margin: 0.3cm; font-family: sans-serif-light; color: #C0C0C0; background-color:#202020; line-height: 150%} * {max-width: 100%; word-break: break-word}h1, h2 {font-weight: normal; line-height: 130%} h1 {font-size: 170%; margin-bottom: 0.1em} h2 {font-size: 140%} a {color: #0099CC}h1 a {color: inherit; text-decoration: none}img {height: auto} pre {white-space: pre-wrap;} blockquote {border-left: thick solid #686b6f; background-color:#383b3f; margin: 0.5em 0 0.5em 0em; padding: 0.5em} p {margin: 0.8em 0 0.8em 0} p.subtitle {color: #8c8c8c; border-top:1px solid #303030; border-bottom:1px solid #303030; padding-top:2px; padding-bottom:2px; font-weight:800 } ul, ol {margin: 0 0 0.8em 0.6em; padding: 0 0 0 1em} ul li, ol li {margin: 0 0 0.8em 0; padding: 0} </style><meta name=\'viewport\' content=\'width=device-width\'/></head>";
    private static final java.lang.String BODY_START = "<body dir=\"auto\">";
    private static final java.lang.String BODY_END = "</body>";
    private static final java.lang.String TITLE_START = "<h1><a href=\'";
    private static final java.lang.String TITLE_MIDDLE = "\'>";
    private static final java.lang.String TITLE_END = "</a></h1>";
    private static final java.lang.String SUBTITLE_START = "<p class=\'subtitle\'>";
    private static final java.lang.String SUBTITLE_END = "</p>";
}