package com.yzh.market.mapper;

import com.yzh.market.entity.MarketArea;
import com.yzh.market.entity.MarketAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketAreaMapper {
    long countByExample(MarketAreaExample example);

    int deleteByExample(MarketAreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketArea record);

    int insertSelective(MarketArea record);

    List<MarketArea> selectByExample(MarketAreaExample example);

    MarketArea selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketArea record, @Param("example") MarketAreaExample example);

    int updateByExample(@Param("record") MarketArea record, @Param("example") MarketAreaExample example);

    int updateByPrimaryKeySelective(MarketArea record);

    int updateByPrimaryKey(MarketArea record);
}