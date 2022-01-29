package com.yzh.market.vo;

import com.yzh.market.common.BaseEntity;

public class MarketOldValueVo extends BaseEntity{

    private String oldValue;

    private String oldName;

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

}