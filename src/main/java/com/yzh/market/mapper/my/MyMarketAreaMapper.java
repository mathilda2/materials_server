package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.req.MarketAreaReq;
import com.yzh.market.vo.MarketAreaVo;

@Mapper
public interface MyMarketAreaMapper {

	List<MarketAreaVo> findList(MarketAreaReq marketAreaReq);

	void insert(MarketAreaReq area);

	void update(MarketAreaReq area);

	
}
