package com.tscloud.address.server.mapper;

import com.tscloud.address.domain.entity.LevelEntity;
import com.tscloud.common.framework.mapper.BaseInterfaceMapper;


import java.util.List;
import java.util.Map;

public interface LevelMapper extends BaseInterfaceMapper<LevelEntity> {
    List<LevelEntity> getLevelByID(Map<String,Object> params);
}
