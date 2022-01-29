package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.req.MarketArticleReq;
import com.yzh.market.vo.MarketArticleVo;

@Mapper
public interface MyMarketArticleMapper {

	List<MarketArticleVo> findList(MarketArticleReq marketArticleReq);

	void insert(MarketArticleReq area);

	void update(MarketArticleReq area);

	MarketArticleVo get(MarketArticleReq message);

	
}
