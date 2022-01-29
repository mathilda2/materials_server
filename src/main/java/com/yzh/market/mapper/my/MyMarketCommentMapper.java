package com.yzh.market.mapper.my;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yzh.market.req.MarketCommentReq;
import com.yzh.market.vo.MarketCommentVo;

@Mapper
public interface MyMarketCommentMapper {

	List<MarketCommentVo> findList(MarketCommentReq marketCommentReq);

	void save(MarketCommentReq message);

	void update(MarketCommentReq message);


}
