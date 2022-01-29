package com.yzh.market.mapper;

import com.yzh.market.entity.MarketMessage;
import com.yzh.market.entity.MarketMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketMessageMapper {
    long countByExample(MarketMessageExample example);

    int deleteByExample(MarketMessageExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketMessage record);

    int insertSelective(MarketMessage record);

    List<MarketMessage> selectByExample(MarketMessageExample example);

    MarketMessage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketMessage record, @Param("example") MarketMessageExample example);

    int updateByExample(@Param("record") MarketMessage record, @Param("example") MarketMessageExample example);

    int updateByPrimaryKeySelective(MarketMessage record);

    int updateByPrimaryKey(MarketMessage record);
}