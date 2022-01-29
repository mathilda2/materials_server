package com.yzh.market.req;

import com.yzh.market.common.PageReq;
import com.yzh.market.entity.MarketMessage;
import com.yzh.market.entity.MarketUser;

public class MarketCommentReq extends PageReq{
 
    private String content;

    private MarketMessage message;
    
    private MarketUser user;

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