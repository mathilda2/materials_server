package com.yzh.market.req;

import com.yzh.market.common.PageReq;
import com.yzh.market.entity.MarketArea;
import com.yzh.market.entity.MarketSalesType;
import com.yzh.market.entity.MarketType;
import com.yzh.market.entity.MarketUser;

public class MarketMessageReq extends PageReq{

	private String messageTitle;
    private MarketTypeReq type;
    private MarketAreaReq area;
    private String price;
    private String messageDesc;
    private MarketUser  user;
    private String messagePhoto;
    private String oldValue;
    private String topValue;
    private MarketSalesTypeReq salesType;
    private String key;
    private String flag;

    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	 
	public MarketAreaReq getArea() {
		return area;
	}

	public void setArea(MarketAreaReq area) {
		this.area = area;
	}

	public MarketUser getUser() {
		return user;
	}

	public void setUser(MarketUser  user) {
		this.user = user;
	}

	public MarketSalesTypeReq getSalesType() {
		return salesType;
	}

	public void setSalesType(MarketSalesTypeReq salesType) {
		this.salesType = salesType;
	}

	public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMessageDesc() {
        return messageDesc;
    }

    public void setMessageDesc(String messageDesc) {
        this.messageDesc = messageDesc;
    }

   

    public String getMessagePhoto() {
        return messagePhoto;
    }

    public void setMessagePhoto(String messagePhoto) {
        this.messagePhoto = messagePhoto;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getTopValue() {
        return topValue;
    }

    public void setTopValue(String topValue) {
        this.topValue = topValue;
    }

	public MarketTypeReq getType() {
		return type;
	}

	public void setType(MarketTypeReq type) {
		this.type = type;
	}

 
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
    
}