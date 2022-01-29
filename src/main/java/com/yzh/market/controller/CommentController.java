package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.req.MarketCommentReq;
import com.yzh.market.service.CommentService;
import com.yzh.market.vo.MarketCommentVo;

@RestController
@RequestMapping("/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/list")
	public CommonResp list(@RequestBody MarketCommentReq comment,HttpServletRequest httpServletRequest) {
		CommonResp<PageResp<MarketCommentVo>> resp = new CommonResp<PageResp<MarketCommentVo>>();
		PageResp<MarketCommentVo> list = commentService.list(comment);
		resp.setContent(list); 
		resp.setMessage("操作成功");
		return resp;
	}
	
	@RequestMapping("/save")
	public CommonResp save(@RequestBody MarketCommentReq comment,HttpSession session) {
		CommonResp resp  = commentService.save(comment,session);
		return resp;
	}
	
	@RequestMapping("/delete")
	public CommonResp delete(@RequestBody MarketCommentReq comment) {
		CommonResp resp  = commentService.delete(comment);
		return resp;
	}
	
	
}
