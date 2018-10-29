package com.demo.film.model;

import java.math.BigDecimal;

public class Goods {
    private Integer id;

    private String name;

    private Integer cateId;

    private Integer brandId;

    private BigDecimal price;

    private Boolean isShow;

    private Boolean isSaleoff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public Boolean getIsSaleoff() {
        return isSaleoff;
    }

    public void setIsSaleoff(Boolean isSaleoff) {
        this.isSaleoff = isSaleoff;
    }
}