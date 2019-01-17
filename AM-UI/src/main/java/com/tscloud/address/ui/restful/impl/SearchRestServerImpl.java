package com.tscloud.address.ui.restful.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DistrictEntity;
import com.tscloud.address.domain.entity.SearchByIDParams;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.SearchParams;
import com.tscloud.address.domain.provider.ISearchProvider;
import com.tscloud.address.domain.utils.ConstantUtils;
import com.tscloud.address.ui.restful.IDistrictRestServer;
import com.tscloud.address.ui.restful.ISearchRestServer;
import com.tscloud.common.framework.Exception.DubboProviderException;
import com.tscloud.common.framework.dubbo.DubboBaseInterface;
import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImpl;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Path;

@Controller
@Path(ConstantUtils.REST_PATH_PREFIX+"SearchById")
public class SearchRestServerImpl extends BaseRestServerInterfaceImpl<SearchEntity>implements ISearchRestServer {

    @Reference
    private ISearchProvider SearchProvider;

    @Override
    public DubboBaseInterface<SearchEntity>getDubboBaseInterface(){
        return this.SearchProvider;
    }
    @Override
    public String SearchById(Integer SearchId) {
        try {
            SearchByIDParams params=new SearchByIDParams(SearchId);
            PageInfo<SearchEntity>page=this.SearchProvider.SearchByID(params);
            jsonView.successPack(page);
        } catch (DubboProviderException e) {
            jsonView.failPack("获取数据失败");
            this.log.error("DistrictRestServerImpl getVillage error",e);
            e.printStackTrace();
        }
        return this.dataFormat();
    }
}
