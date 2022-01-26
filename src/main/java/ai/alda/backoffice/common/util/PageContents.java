package ai.alda.backoffice.common.util;

import lombok.Getter;

import java.util.List;

@Getter
public class PageContents<T> {
    private int offset;// current page
    private int limit; // unit per page
    private int total; // total size
    private List<T> contents;
}