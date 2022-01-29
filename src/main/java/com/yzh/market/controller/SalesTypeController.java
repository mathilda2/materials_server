package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketSalesTypeReq;
import com.yzh.market.service.SalesTypeService; 
import com.yzh.market.vo.MarketSalesTypeVo;

@RestController
@RequestMapping("/salesType")
public class  SalesTypeController {

	@Autowired
	private SalesTypeService salesTypeService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketSalesTypeReq salesType,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketSalesTypeVo>> resp = new CommonResp<PageResp<MarketSalesTypeVo>>();
		PageResp<MarketSalesTypeVo> list = salesTypeService.list(salesType);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketSalesTypeReq salesType,HttpSession session) {
		CommonResp resp  = salesTypeService.save(salesType,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketSalesTypeReq salesType) {
		CommonResp resp  = salesTypeService.delete(salesType);
		return resp;
	}
	
}
