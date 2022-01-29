package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketOldValueReq;
import com.yzh.market.service.OldValueService;
import com.yzh.market.vo.MarketOldValueVo;

@RestController
@RequestMapping("/oldValue")
public class OldValueController {

	@Autowired
	private OldValueService oldValueService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketOldValueReq oldValue,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketOldValueVo>> resp = new CommonResp<PageResp<MarketOldValueVo>>();
		PageResp<MarketOldValueVo> list = oldValueService.list(oldValue);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketOldValueReq oldValue,HttpSession session) {
		CommonResp resp  = oldValueService.save(oldValue,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketOldValueReq oldValue) {
		CommonResp resp  = oldValueService.delete(oldValue);
		return resp;
	}
	
}
