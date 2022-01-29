package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.mapper.MarketCommentMapper;
import com.yzh.market.mapper.my.MyMarketCommentMapper;
import com.yzh.market.req.MarketCommentReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketCommentVo;
import com.yzh.market.vo.MarketUserVo;

@Service
public class CommentService {
	
	@Autowired
	private MyMarketCommentMapper myMarketCommentMapper;
	
	@Autowired
	private MarketCommentMapper marketCommentMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake;

	public PageResp<MarketCommentVo> list(MarketCommentReq comment) {
		PageHelper.startPage(comment.getPageNum(),comment.getSize());
		List<MarketCommentVo> list = myMarketCommentMapper.findList(comment);
		PageInfo<MarketCommentVo> pageInfo = new PageInfo<MarketCommentVo>(list);
		PageResp<MarketCommentVo> p = new PageResp<MarketCommentVo>();
		p.setList(list);
		p.setPages(pageInfo.getPages());
		p.setTotal(pageInfo.getTotal());
		return p;
	}
	
	public CommonResp save(MarketCommentReq comment, HttpSession session) {
		String id = comment.getId();
		if(!"".equals(id) && id !=null) {
			comment.preUpdate();
			myMarketCommentMapper.update(comment);
		}else {
			MarketUserVo user = (MarketUserVo)session.getAttribute("user");
			MarketUser u = CopyUtil.copy(user, MarketUser.class);
			comment.preInsert();
			comment.setUser(u);
			myMarketCommentMapper.save(comment);
			res.setMessage("评论成功!");
		}
		
		return res;
	}

	public CommonResp delete(MarketCommentReq req) {
		String id = req.getId();
		marketCommentMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}
	
}
