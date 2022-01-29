package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.entity.MarketType;
import com.yzh.market.req.MarketTypeReq;
import com.yzh.market.vo.MarketTypeVo;

@Mapper
public interface MyMarketTypeMapper {

	List<MarketTypeVo> findList(MarketTypeReq marketTypeReq);

	void insert(MarketTypeReq type);

	void update(MarketTypeReq type);

	
}
