package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.req.MarketOldValueReq;
import com.yzh.market.vo.MarketOldValueVo;

@Mapper
public interface MyMarketOldValueMapper {

	List<MarketOldValueVo> findList(MarketOldValueReq marketOldValueReq);

	void insert(MarketOldValueReq area);

	void update(MarketOldValueReq area);

	
}
