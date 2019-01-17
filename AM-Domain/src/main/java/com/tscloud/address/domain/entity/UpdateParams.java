package com.tscloud.address.domain.entity;

import java.io.Serializable;

public class UpdateParams implements Serializable {
    private Integer level;
    private String  adcode;
    private Double x;
    private Double y;
    private String address;
    private String name;
    private String type;
    private Long id;
    public UpdateParams(Integer level,String adcode,Double x,Double y,String address,String name,String type){
    this.level=level;
    this.name=name;
    this.adcode=adcode;
    this.x=x;
    this.y=y;
    this.address=address;
    this.type=type;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getAdcode() {
        return adcode;
    }

    public void setAdcode(String adcode) {
        this.adcode = adcode;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
