package com.yzh.market.req;

import com.yzh.market.common.PageReq;

public class MarketSalesTypeReq extends PageReq{

    private String salesTypeName;

    private String salesTypeDesc;

    public String getSalesTypeName() {
        return salesTypeName;
    }

    public void setSalesTypeName(String salesTypeName) {
        this.salesTypeName = salesTypeName;
    }

    public String getSalesTypeDesc() {
        return salesTypeDesc;
    }

    public void setSalesTypeDesc(String salesTypeDesc) {
        this.salesTypeDesc = salesTypeDesc;
    }
}