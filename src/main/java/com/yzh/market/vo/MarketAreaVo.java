package com.yzh.market.vo;

import com.yzh.market.common.BaseEntity;

public class MarketAreaVo extends BaseEntity{

    private String areaName;

    private String areaDesc;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }
}