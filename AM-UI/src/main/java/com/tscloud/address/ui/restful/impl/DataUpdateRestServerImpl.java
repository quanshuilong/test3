package com.tscloud.address.ui.restful.impl;

import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DataUpdateEntity;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.UpdateParams;
import com.tscloud.address.domain.provider.IUpdateDataProvider;
import com.tscloud.address.domain.utils.ConstantUtils;
import com.tscloud.address.ui.restful.IDataUpdateRestServer;
import com.tscloud.common.framework.Exception.DubboProviderException;
import com.tscloud.common.framework.dubbo.DubboBaseInterface;
import com.tscloud.common.framework.rest.impl.BaseRestServerInterfaceImpl;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Controller
@Path(ConstantUtils.REST_PATH_PREFIX+"update")
public class DataUpdateRestServerImpl extends BaseRestServerInterfaceImpl<SearchEntity> implements IDataUpdateRestServer {
    @Reference
    IUpdateDataProvider updateDataProvider;
    @Override
    public DubboBaseInterface<DataUpdateEntity> getDubboBaseInterface(){
        return this.updateDataProvider;
    }

    @Override
    public String Adddata(String adcode, Double x, Double y,Integer Level,String Address,String name,String type){
        try{
            UpdateParams params=new UpdateParams(Level,adcode,x,y,Address,name,type);
            PageInfo<DataUpdateEntity>page=this.updateDataProvider.AddData(params);
            jsonView.successPack(page);

        }catch (DubboProviderException e){
            jsonView.failPack("添加数据失败");
            this.log.error("DataUpdateRestServerImpl.Adddata error");
            e.printStackTrace();
        }
        return this.dataFormat();
    }
}
