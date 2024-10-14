package com.osmeldevs.base.name.domain.contract;

import lombok.Data;

import java.util.List;

@Data
public class SearchResult<T> {

    private final List<T> results;
    private final long size;
    private final int currentPage;
    private final int totalPages;

}
