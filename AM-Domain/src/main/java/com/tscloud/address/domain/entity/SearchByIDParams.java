package com.tscloud.address.domain.entity;

import java.io.Serializable;

public class SearchByIDParams implements Serializable {
    private  Integer searchId;
    private Integer pageSize;
    private Integer pageNum;
    public SearchByIDParams(Integer searchId){
        this.searchId=searchId;
    }

    public Integer getSearchId() {
        return searchId;
    }

    public void setSearchId(Integer searchId) {
        this.searchId = searchId;
    }
}
