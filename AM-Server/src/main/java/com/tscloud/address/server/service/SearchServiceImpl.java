package com.tscloud.address.server.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tscloud.address.domain.entity.LevelEntity;
import com.tscloud.address.domain.entity.SearchByIDParams;
import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.address.domain.entity.SearchParams;
import com.tscloud.address.domain.service.IDistrictService;
import com.tscloud.address.domain.service.ISearchService;
import com.tscloud.address.server.mapper.LevelMapper;
import com.tscloud.address.server.mapper.SearchMapper;
import com.tscloud.common.framework.mapper.BaseInterfaceMapper;
import com.tscloud.common.framework.service.impl.BaseInterfaceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SearchServiceImpl extends BaseInterfaceServiceImpl<SearchEntity> implements ISearchService {
   @Autowired
    private SearchMapper searchMapper;
   @Autowired
   private LevelMapper levelMapper;

   @Override
    public BaseInterfaceMapper<SearchEntity> getBaseInterfaceMapper() {
       return this.searchMapper;
   }
   @Override
   public PageInfo<SearchEntity> SearchByID(SearchByIDParams params) {
       Map<String,Object> param=new HashMap<>();
       param.put("addrId",params.getSearchId());
       List<LevelEntity>levels=levelMapper.getLevelByID(param);
       if(levels.size()==0){
         return  new PageInfo<>(searchMapper.SearchByID(param));
       }
       PageInfo<SearchEntity>pageInfo;
       Integer Level=levels.get(0).getLevel();
       switch (Level){
           case 1:pageInfo=new PageInfo<>(searchMapper.getCountry(param));break;
           case 2:pageInfo=new PageInfo<>(searchMapper.getProvince(param));break;
           case 3:pageInfo=new PageInfo<>(searchMapper.getCity(param));break;
           case 4: pageInfo=new PageInfo<>(searchMapper.getCounty(param)); break;
           case 5:pageInfo=new PageInfo<>(searchMapper.getDistrict(param));break;
           case 6:pageInfo=new PageInfo<>(searchMapper.getVillage(param));break;
           case 7:pageInfo=new PageInfo<>(searchMapper.getEda(param));break;
           case 8:pageInfo=new PageInfo<>(searchMapper.getMoutain(param));break;
           case 9:pageInfo=new PageInfo<>(searchMapper.getRiver(param));break;
           case 10: pageInfo=new PageInfo<>(searchMapper.getRoad(param));break;
           case 11:pageInfo=new PageInfo<>(searchMapper.getRoad_Branch(param));break;
           case 20:pageInfo=new PageInfo<>(searchMapper.getStreetNo(param));break;
           case 23:pageInfo=new PageInfo<>(searchMapper.getStreetNo_Sub(param));break;
           case 30:pageInfo=new PageInfo<>(searchMapper.getCommuntity(param));break;
           case 31:pageInfo=new PageInfo<>(searchMapper.getLandmark(param));break;
           case 32:pageInfo=new PageInfo<>(searchMapper.getOther(param));break;
           case 33:pageInfo=new PageInfo<>(searchMapper.getBd(param));break;
           case 34:pageInfo=new PageInfo<>(searchMapper.getFactory(param));break;
           case 40:pageInfo=new PageInfo<>(searchMapper.getBuildings(param));break;
           case 41:pageInfo=new PageInfo<>(searchMapper.getBuildingsUnit(param));break;
           case 42:pageInfo=new PageInfo<>(searchMapper.getBuildingsFloor(param));break;
           case 43:pageInfo=new PageInfo<>(searchMapper.getBuildingsRoom(param));break;
           default:pageInfo=new PageInfo<>(searchMapper.SearchByID(param));break;
       }
       return pageInfo;
   }
   @Override
   public PageInfo<SearchEntity> findAllByPage(SearchByIDParams params){
       Map<String,Object> param=new HashMap<>();
       param.put("addrId",params.getSearchId());
       PageHelper.startPage(1,10,true);
       return new PageInfo<>(searchMapper.findAllByPage(param));
   }

}
