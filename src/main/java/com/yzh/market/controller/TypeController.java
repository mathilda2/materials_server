package com.yzh.market.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketTypeReq;
import com.yzh.market.service.TypeService;
import com.yzh.market.vo.MarketTypeVo;

@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeService typeService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketTypeReq type,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketTypeVo>> resp = new CommonResp<PageResp<MarketTypeVo>>();
		PageResp<MarketTypeVo> list = typeService.list(type);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/getRecommendList")
	public CommonResp getRecommendList(@RequestBody MarketTypeReq type,HttpServletRequest httpServletRequest) {
		CommonResp<List<MarketTypeVo>> resp = new CommonResp<List<MarketTypeVo>>();
		List<MarketTypeVo> list = typeService.getRecommendList(type);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketTypeReq type,HttpSession session) {
		CommonResp resp  = typeService.save(type,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketTypeReq type) {
		CommonResp resp  = typeService.delete(type);
		return resp;
	}
	
}
