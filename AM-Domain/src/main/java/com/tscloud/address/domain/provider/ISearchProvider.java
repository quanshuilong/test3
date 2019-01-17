package com.tscloud.address.domain.provider;

import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DistrictEntity;
import com.tscloud.address.domain.entity.SearchByIDParams;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.SearchParams;
import com.tscloud.common.framework.Exception.DubboProviderException;
import com.tscloud.common.framework.dubbo.DubboBaseInterface;

public interface ISearchProvider extends DubboBaseInterface<SearchEntity> {

    PageInfo<SearchEntity> findAllByPage(SearchByIDParams params) throws DubboProviderException;
   PageInfo<SearchEntity> SearchByID(SearchByIDParams params)throws DubboProviderException;
}
