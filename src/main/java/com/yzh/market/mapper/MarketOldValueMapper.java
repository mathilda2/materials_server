package com.yzh.market.mapper;

import com.yzh.market.entity.MarketOldValue;
import com.yzh.market.entity.MarketOldValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketOldValueMapper {
    long countByExample(MarketOldValueExample example);

    int deleteByExample(MarketOldValueExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketOldValue record);

    int insertSelective(MarketOldValue record);

    List<MarketOldValue> selectByExample(MarketOldValueExample example);

    MarketOldValue selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketOldValue record, @Param("example") MarketOldValueExample example);

    int updateByExample(@Param("record") MarketOldValue record, @Param("example") MarketOldValueExample example);

    int updateByPrimaryKeySelective(MarketOldValue record);

    int updateByPrimaryKey(MarketOldValue record);
}