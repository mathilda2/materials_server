package com.yzh.market.mapper;

import com.yzh.market.entity.MarketSalesType;
import com.yzh.market.entity.MarketSalesTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketSalesTypeMapper {
    long countByExample(MarketSalesTypeExample example);

    int deleteByExample(MarketSalesTypeExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketSalesType record);

    int insertSelective(MarketSalesType record);

    List<MarketSalesType> selectByExample(MarketSalesTypeExample example);

    MarketSalesType selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketSalesType record, @Param("example") MarketSalesTypeExample example);

    int updateByExample(@Param("record") MarketSalesType record, @Param("example") MarketSalesTypeExample example);

    int updateByPrimaryKeySelective(MarketSalesType record);

    int updateByPrimaryKey(MarketSalesType record);
}