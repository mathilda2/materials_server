package com.yzh.market.req;

import com.yzh.market.common.PageReq;

public class MarketAreaReq extends PageReq{

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