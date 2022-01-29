package com.yzh.market.vo;

import java.util.ArrayList;
import java.util.List;

import com.yzh.market.common.BaseEntity;

public class MarketTypeVo extends BaseEntity{

    private String typeName;

    private String typeDesc;
    
    private List<MarketMessageVo> childList = new ArrayList<MarketMessageVo>();
    
    
    public List<MarketMessageVo> getChildList() {
		return childList;
	}

	public void setChildList(List<MarketMessageVo> childList) {
		this.childList = childList;
	}

	public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }
}