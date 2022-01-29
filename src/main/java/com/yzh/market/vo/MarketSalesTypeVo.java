package com.yzh.market.vo;

import com.yzh.market.common.BaseEntity;

public class MarketSalesTypeVo extends BaseEntity{

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