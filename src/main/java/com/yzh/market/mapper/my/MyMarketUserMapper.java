package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yzh.market.entity.MarketUser;
import com.yzh.market.req.MarketUserReq;
import com.yzh.market.vo.MarketUserVo;

@Mapper
public interface MyMarketUserMapper {

	MarketUser selectUserByName(@Param("userName") String  userName);

	List<MarketUserVo> selectList(MarketUserReq user);

	void insert(MarketUserReq comment);

	void update(MarketUserReq comment);
	
}
