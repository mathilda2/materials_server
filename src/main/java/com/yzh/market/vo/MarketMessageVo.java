package com.yzh.market.vo;

import com.yzh.market.common.BaseEntity;
import com.yzh.market.entity.MarketArea;
import com.yzh.market.entity.MarketType;
import com.yzh.market.entity.MarketUser;

public class MarketMessageVo extends BaseEntity{
	
    private String messageTitle;
    private MarketType type;
    private MarketArea area;
    private String price;
    private String messageDesc;
    private MarketUser user;
    private String messagePhoto;
    private String oldValue;
    private String topValue;
    private String key;
    private String flag;
    
    public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getKey() { 
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public MarketType getType() {
		return type;
	}

	public void setType(MarketType type) {
		this.type = type;
	}

	public MarketArea getArea() {
		return area;
	}

	public void setArea(MarketArea area) {
		this.area = area;
	}


    public MarketUser getUser() {
		return user;
	}

	public void setUser(MarketUser user) {
		this.user = user;
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

}