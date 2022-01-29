package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.mapper.MarketArticleMapper;
import com.yzh.market.mapper.my.MyMarketArticleMapper;
import com.yzh.market.req.MarketArticleReq;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketArticleVo;
import com.yzh.market.vo.MarketMessageVo;

@Service
public class ArticleService {
	
	
	@Autowired
	private MarketArticleMapper marketArticleMapper;
	
	@Autowired
	private MyMarketArticleMapper myMarketArticleMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake; 

	public PageResp<MarketArticleVo> list(MarketArticleReq article) {
		PageHelper.startPage(article.getPageNum(),article.getSize());
		List<MarketArticleVo> list = myMarketArticleMapper.findList(article);
		PageInfo<MarketArticleVo> pageInfo = new PageInfo<MarketArticleVo>(list);
		PageResp<MarketArticleVo> p = new PageResp<MarketArticleVo>();
		p.setPages(pageInfo.getPages());
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
 
	public CommonResp save(MarketArticleReq article, HttpSession session) {
		String id = article.getId();
		if(!"".equals(id) && id !=null) {
			article.preUpdate();
			myMarketArticleMapper.update(article);
		}else {
			article.preInsert();
			myMarketArticleMapper.insert(article);
			res.setMessage("更改成功");
		}
		return res;
	}

	public CommonResp delete(MarketArticleReq req) {
		String id = req.getId();
		marketArticleMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}

	public MarketArticleVo getArticleDetail(MarketArticleReq message) {
		MarketArticleVo marketArticleVo = myMarketArticleMapper.get(message);
		return marketArticleVo;
	}
	
	 
	
	
}
