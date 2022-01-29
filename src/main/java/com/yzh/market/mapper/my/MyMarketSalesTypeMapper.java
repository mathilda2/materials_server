package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.req.MarketSalesTypeReq;
import com.yzh.market.vo.MarketSalesTypeVo;

@Mapper
public interface MyMarketSalesTypeMapper {

	List<MarketSalesTypeVo> findList(MarketSalesTypeReq marketSalesTypeReq);

	void insert(MarketSalesTypeReq type);

	void update(MarketSalesTypeReq type);

	
}
