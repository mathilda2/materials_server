package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketArticleReq;
import com.yzh.market.req.MarketMessageReq;
import com.yzh.market.service.ArticleService;
import com.yzh.market.vo.MarketArticleVo;
import com.yzh.market.vo.MarketMessageVo;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketArticleReq article,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketArticleVo>> resp = new CommonResp<PageResp<MarketArticleVo>>();
		PageResp<MarketArticleVo> list = articleService.list(article);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketArticleReq article,HttpSession session) {
		CommonResp resp  = articleService.save(article,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketArticleReq article) {
		CommonResp resp  = articleService.delete(article);
		return resp;
	}
	
	@RequestMapping("/getArticleDetail")
	public CommonResp getArticleDetail(@RequestBody MarketArticleReq message) {
		CommonResp<MarketArticleVo> resp = new CommonResp<MarketArticleVo>();
		MarketArticleVo marketMessageVo   = articleService.getArticleDetail(message);
		resp.setContent(marketMessageVo); 
		resp.setMessage("操作成功");
		return resp;
	}
	
}
