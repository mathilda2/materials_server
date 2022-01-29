package com.yzh.market.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.yzh.market.entity.MarketUser;
import com.yzh.market.mapper.MarketUserMapper;
import com.yzh.market.vo.MarketUserVo;

public class UserUtils {
	
	private static MarketUserMapper userMapper = SpringContextHolder.getBean(MarketUserMapper.class); 
	
	public static MarketUser get(String id) {
		MarketUser user = userMapper.selectByPrimaryKey(id);
	    if (user == null) {
	        return null;
	    }
	    return user;
	}
	 public static MarketUser getUser() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        if(null != requestAttributes) {
            HttpServletRequest request = requestAttributes.getRequest();
            HttpSession session = request.getSession();
            MarketUserVo user = (MarketUserVo)session.getAttribute("user");
            MarketUser copy = CopyUtil.copy(user, MarketUser.class);
            return copy;
        }
        return new MarketUser();
    }
}
