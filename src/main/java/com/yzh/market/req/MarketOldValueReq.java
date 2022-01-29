package com.yzh.market.req;

import com.yzh.market.common.PageReq;

public class MarketOldValueReq  extends PageReq{

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