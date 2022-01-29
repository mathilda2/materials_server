package com.yzh.market.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yzh.market.common.CommonResp;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.req.MarketUserReq;
import com.yzh.market.service.UserService;
import com.yzh.market.vo.MarketUserVo;

@RestController
public class LoginController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private CommonResp res ;
	
	@RequestMapping("/login")
	public CommonResp login(@RequestBody MarketUserReq user,HttpServletRequest httpServletRequest) {
		CommonResp resp = userService.login(user);
		HttpSession session = httpServletRequest.getSession();
		session.setAttribute("user", resp.getContent());
		return resp;
	}
	
	@RequestMapping("/register")
	public CommonResp register(@RequestBody MarketUserReq user,HttpSession session) {
		CommonResp resp = userService.register(user);
		return resp;
	}
	
	@RequestMapping("/logout")
	public CommonResp logout(@RequestBody MarketUserReq user,HttpSession session) {
		String id = user.getId();
		MarketUserVo u = (MarketUserVo) session.getAttribute("currentUser_"+id);
		session.removeAttribute("user");
		res.setMessage("退出成功");
		res.setContent(new MarketUser());
		return res;
	}
}
