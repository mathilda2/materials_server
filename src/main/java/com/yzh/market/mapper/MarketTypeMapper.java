package com.yzh.market.mapper;

import com.yzh.market.entity.MarketType;
import com.yzh.market.entity.MarketTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketTypeMapper {
    long countByExample(MarketTypeExample example);

    int deleteByExample(MarketTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketType record);

    int insertSelective(MarketType record);

    List<MarketType> selectByExample(MarketTypeExample example);

    MarketType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketType record, @Param("example") MarketTypeExample example);

    int updateByExample(@Param("record") MarketType record, @Param("example") MarketTypeExample example);

    int updateByPrimaryKeySelective(MarketType record);

    int updateByPrimaryKey(MarketType record);
}