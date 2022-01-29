package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.entity.MarketUserExample;
import com.yzh.market.exception.BusinessException;
import com.yzh.market.exception.BusinessExceptionCode;
import com.yzh.market.mapper.MarketUserMapper;
import com.yzh.market.mapper.my.MyMarketUserMapper;
import com.yzh.market.req.MarketMessageReq;
import com.yzh.market.req.MarketUserReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketMessageVo;
import com.yzh.market.vo.MarketUserVo;

@Service
public class UserService {
	
	@Autowired
	private MarketUserMapper  marketUserMapper;
	
	@Autowired
	private MyMarketUserMapper myUserMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake;
	
	public CommonResp login(MarketUserReq user  ) {
		String userName = user.getUserName();
		MarketUser marketUser = myUserMapper.selectUserByName(userName);
		if(marketUser == null) {
			throw new BusinessException(BusinessExceptionCode.LOGIN_USER_ERROR);
		}
		MarketUserVo u = CopyUtil.copy(marketUser, MarketUserVo.class);
		res.setMessage("ok");
		res.setContent(u);
		return res ;
	}

	public CommonResp register(MarketUserReq user ) {
		String userName = user.getUserName();
		MarketUser marketUser = myUserMapper.selectUserByName(userName);
		if(marketUser != null) {
			throw new BusinessException(BusinessExceptionCode.USER_LOGIN_NAME_EXIST);
		}
		MarketUser u = CopyUtil.copy(user, MarketUser.class);
		Long id = snowFlake.nextId();
		u.setId(id.toString());
		int insert = marketUserMapper.insert(u);
		MarketUserVo userVo = CopyUtil.copy(u, MarketUserVo.class);
		if(insert == 1) {
			res.setContent(userVo);
			res.setMessage("恭喜！注册成功");
		}else {
			res.setContent(new MarketUserVo());
			res.setMessage("注册失败!");
		}
		return res;
	}
	public PageResp<MarketUserVo> list(MarketUserReq user) {
		PageHelper.startPage(user.getPageNum(),user.getSize());
		List<MarketUserVo> list = myUserMapper.selectList(user);
		PageInfo<MarketUserVo> pageInfo = new PageInfo<MarketUserVo>(list);
		PageResp<MarketUserVo> p = new PageResp<MarketUserVo>();
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
	public CommonResp save(MarketUserReq comment, HttpSession session) {
		String id = comment.getId();
		if(!"".equals(id) && id !=null) {
			comment.preUpdate();
			MarketUser userT = CopyUtil.copy(comment, MarketUser.class);
			/* marketUserMapper.updateByPrimaryKey(userT);*/
			myUserMapper.update(comment);
			MarketUserVo userVo = CopyUtil.copy(userT, MarketUserVo.class);
			res.setContent(userVo);
			res.setMessage("更改成功!");
		}else {
			comment.preInsert();
			myUserMapper.insert(comment);
			res.setMessage("评论成功!");
		}
		
		return res;
	}

	public CommonResp delete(MarketUserReq req) {
		String id = req.getId();
		marketUserMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}
	
}
