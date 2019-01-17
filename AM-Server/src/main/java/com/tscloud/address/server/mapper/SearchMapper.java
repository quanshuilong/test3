package com.tscloud.address.server.mapper;

import com.tscloud.address.domain.entity.SearchEntity;
import com.tscloud.common.framework.mapper.BaseInterfaceMapper;

import java.util.List;
import java.util.Map;

public interface SearchMapper extends BaseInterfaceMapper<SearchEntity> {

   List<SearchEntity> SearchByID(Map<String,Object> params);
   List<SearchEntity>findAllByPage(Map<String,Object>params);
   List<SearchEntity> getVillage(Map<String,Object>params);
   List<SearchEntity>getCountry(Map<String,Object>params);
   List<SearchEntity>getProvince(Map<String,Object>params);
   List<SearchEntity>getCity(Map<String,Object>params);
   List<SearchEntity>getCounty(Map<String,Object>params);
   List<SearchEntity>getDistrict(Map<String,Object>params);
   List<SearchEntity>getStreetNo(Map<String,Object>params);
   List<SearchEntity>getStreetNo_Sub(Map<String,Object>params);
   List<SearchEntity>getEda(Map<String,Object>params);
   List<SearchEntity>getRoad(Map<String,Object>params);
   List<SearchEntity>getRoad_Branch(Map<String,Object>params);
   List<SearchEntity>getBd(Map<String,Object>params);
   List<SearchEntity>getMoutain(Map<String,Object>params);
   List<SearchEntity>getFactory(Map<String,Object>params);
   List<SearchEntity>getOther(Map<String,Object>params);
   List<SearchEntity>getRiver(Map<String,Object>params);
   List<SearchEntity>getCommuntity(Map<String,Object>params);
   List<SearchEntity>getLandmark(Map<String,Object>params);
   List<SearchEntity>getBuildings(Map<String,Object>params);
   List<SearchEntity>getBuildingsUnit(Map<String,Object>params);
   List<SearchEntity>getBuildingsFloor(Map<String,Object>params);
   List<SearchEntity>getBuildingsRoom(Map<String,Object>params);



}
