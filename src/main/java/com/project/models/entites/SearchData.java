package com.project.models.entites;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@SuppressWarnings("serial")

public class SearchData {

    private String searchKey;

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }
    
}
