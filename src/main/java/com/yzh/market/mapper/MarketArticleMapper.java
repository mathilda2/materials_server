package com.yzh.market.mapper;

import com.yzh.market.entity.MarketArticle;
import com.yzh.market.entity.MarketArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketArticleMapper {
    long countByExample(MarketArticleExample example);

    int deleteByExample(MarketArticleExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketArticle record);

    int insertSelective(MarketArticle record);

    List<MarketArticle> selectByExample(MarketArticleExample example);

    MarketArticle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketArticle record, @Param("example") MarketArticleExample example);

    int updateByExample(@Param("record") MarketArticle record, @Param("example") MarketArticleExample example);

    int updateByPrimaryKeySelective(MarketArticle record);

    int updateByPrimaryKey(MarketArticle record);
}