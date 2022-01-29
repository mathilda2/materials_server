package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketMessageReq;
import com.yzh.market.service.MessageService;
import com.yzh.market.vo.MarketMessageVo;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketMessageReq message,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketMessageVo>> resp = new CommonResp<PageResp<MarketMessageVo>>();
		PageResp<MarketMessageVo> list = messageService.list(message);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/getTopList")
	public CommonResp getTopList(@RequestBody MarketMessageReq message,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketMessageVo>> resp = new CommonResp<PageResp<MarketMessageVo>>();
		PageResp<MarketMessageVo> list = messageService.getTopList(message);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/getMessageDetail")
	public CommonResp getMessageDetail(@RequestBody MarketMessageReq message) {
		CommonResp<MarketMessageVo> resp = new CommonResp<MarketMessageVo>();
		MarketMessageVo marketMessageVo   = messageService.getMessageDetail(message);
		resp.setContent(marketMessageVo); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketMessageReq message,HttpSession session) {
		CommonResp resp  = messageService.save(message,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketMessageReq message) {
		CommonResp resp  = messageService.delete(message);
		return resp;
	}
}
