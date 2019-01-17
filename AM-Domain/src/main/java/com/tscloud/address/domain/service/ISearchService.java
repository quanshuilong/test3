package com.tscloud.address.domain.service;

import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DistrictEntity;
import com.tscloud.address.domain.entity.SearchByIDParams;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.SearchParams;
import com.tscloud.common.framework.Exception.ServiceException;
import com.tscloud.common.framework.service.IBaseInterfaceService;

public interface ISearchService extends IBaseInterfaceService<SearchEntity> {
    PageInfo<SearchEntity> findAllByPage(SearchByIDParams params) throws ServiceException;
   PageInfo<SearchEntity> SearchByID(SearchByIDParams params)throws ServiceException;
}
