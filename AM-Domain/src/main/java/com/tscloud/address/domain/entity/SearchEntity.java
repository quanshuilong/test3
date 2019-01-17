package com.tscloud.address.domain.entity;

import com.tscloud.common.framework.domain.TrackableEntity;

public class SearchEntity extends TrackableEntity {
    private  Integer AddrId;
    private String Name;
    private String Address;
    private String Adcode;
    private String PoiType;
    private Double x;
    private  Double y;

    public void setAddrId(Integer addrId) {
        AddrId = addrId;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x/3600;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y/3600;
    }

    public Integer getAddrId() {
        return AddrId;
    }

    public void setId(Integer id) {
        AddrId = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAdcode() {
        return Adcode;
    }

    public void setAdcode(String adcode) {
        Adcode = adcode;
    }

    public String getPoiType() {
        return PoiType;
    }

    public void setPoiType(String poiType) {
        PoiType = poiType;
    }
}
