package com.yzh.market.vo;

import com.yzh.market.common.BaseEntity;
import com.yzh.market.entity.MarketMessage;
import com.yzh.market.entity.MarketUser;

public class MarketCommentVo extends BaseEntity{

    private String content;

    private MarketMessage message;

    private MarketUser user;
    private String key;
    
    public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

	public MarketMessage getMessage() {
		return message;
	}

	public void setMessage(MarketMessage message) {
		this.message = message;
	}

	public MarketUser getUser() {
		return user;
	}

	public void setUser(MarketUser user) {
		this.user = user;
	}

}