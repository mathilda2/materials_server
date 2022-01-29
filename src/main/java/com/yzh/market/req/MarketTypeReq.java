package com.yzh.market.req;

import com.yzh.market.common.PageReq;

public class MarketTypeReq extends PageReq{
	
	private String typeName;
	private String typeDesc;
	
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