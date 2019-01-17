package com.tscloud.address.domain.entity;

import com.tscloud.common.framework.domain.TrackableEntity;

public class LevelEntity extends TrackableEntity {
    private  Integer Level;

    public Integer getLevel(){
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }
}
