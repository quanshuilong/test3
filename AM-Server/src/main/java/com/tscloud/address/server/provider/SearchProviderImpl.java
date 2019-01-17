package com.tscloud.address.server.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.DistrictEntity;
import com.tscloud.address.domain.entity.SearchByIDParams;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.SearchParams;
import com.tscloud.address.domain.provider.ISearchProvider;
import com.tscloud.address.domain.service.IDistrictService;
import com.tscloud.address.domain.service.ISearchService;
import com.tscloud.common.framework.Exception.DubboProviderException;
import com.tscloud.common.framework.Exception.ServiceException;
import com.tscloud.common.framework.dubbo.DubboBaseInterface;
import com.tscloud.common.framework.dubbo.impl.DubboBaseInterfaceImpl;
import com.tscloud.common.framework.service.IBaseInterfaceService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SearchProviderImpl extends DubboBaseInterfaceImpl<SearchEntity> implements ISearchProvider{
  @Autowired
  private ISearchService SearchService;
  @Override
  public IBaseInterfaceService<SearchEntity>getBaseInterfaceService(){
      return this.SearchService;
  }
    @Override
    public PageInfo<SearchEntity> findAllByPage(SearchByIDParams params) throws DubboProviderException {
        try {
            return SearchService.findAllByPage(params);
        }catch (ServiceException e){
            throw new DubboProviderException(e.getMessage(), e);
        }
    }


  @Override
    public PageInfo<SearchEntity> SearchByID(SearchByIDParams params)throws DubboProviderException{
      try{
          return SearchService.SearchByID(params);
      }catch (ServiceException e){
          throw new DubboProviderException(e.getMessage(), e);
      }
  }
}
