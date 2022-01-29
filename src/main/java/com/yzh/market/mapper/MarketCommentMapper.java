package com.yzh.market.mapper;

import com.yzh.market.entity.MarketComment;
import com.yzh.market.entity.MarketCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketCommentMapper {
    long countByExample(MarketCommentExample example);

    int deleteByExample(MarketCommentExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketComment record);

    int insertSelective(MarketComment record);

    List<MarketComment> selectByExample(MarketCommentExample example);

    MarketComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketComment record, @Param("example") MarketCommentExample example);

    int updateByExample(@Param("record") MarketComment record, @Param("example") MarketCommentExample example);

    int updateByPrimaryKeySelective(MarketComment record);

    int updateByPrimaryKey(MarketComment record);
}