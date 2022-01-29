package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yzh.market.req.MarketMessageReq;
import com.yzh.market.vo.MarketMessageVo;

@Mapper
public interface MyMarketMessageMapper {

	List<MarketMessageVo> selectListByUserId(MarketMessageReq message);

	void save(MarketMessageReq message);

	void update(MarketMessageReq message);

	List<MarketMessageVo> selectListByTypeId(@Param("typeId") String  typeId);
	
	List<MarketMessageVo> selectTopList(MarketMessageReq message);

	MarketMessageVo get(MarketMessageReq message);

}
