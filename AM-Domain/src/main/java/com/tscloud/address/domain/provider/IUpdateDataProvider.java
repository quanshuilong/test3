package com.tscloud.address.domain.provider;

import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DataUpdateEntity;
import com.tscloud.address.domain.entity.UpdateParams;
import com.tscloud.common.framework.Exception.DubboProviderException;

public interface IUpdateDataProvider {
    PageInfo<DataUpdateEntity>AddData(UpdateParams params)throws DubboProviderException;

}
