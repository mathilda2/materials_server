package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketAreaReq;
import com.yzh.market.service.AreaService;
import com.yzh.market.vo.MarketAreaVo;

@RestController
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketAreaReq area,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketAreaVo>> resp = new CommonResp<PageResp<MarketAreaVo>>();
		PageResp<MarketAreaVo> list = areaService.list(area);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketAreaReq area,HttpSession session) {
		CommonResp resp  = areaService.save(area,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketAreaReq area) {
		CommonResp resp  = areaService.delete(area);
		return resp;
	}
	
}
