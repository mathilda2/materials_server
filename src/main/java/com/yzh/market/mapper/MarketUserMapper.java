package com.yzh.market.mapper;

import com.yzh.market.entity.MarketUser;
import com.yzh.market.entity.MarketUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketUserMapper {
    long countByExample(MarketUserExample example);

    int deleteByExample(MarketUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketUser record);

    int insertSelective(MarketUser record);

    List<MarketUser> selectByExample(MarketUserExample example);

    MarketUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketUser record, @Param("example") MarketUserExample example);

    int updateByExample(@Param("record") MarketUser record, @Param("example") MarketUserExample example);

    int updateByPrimaryKeySelective(MarketUser record);

    int updateByPrimaryKey(MarketUser record);
}