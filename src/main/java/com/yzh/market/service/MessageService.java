package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketMessage;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.mapper.MarketMessageMapper;
import com.yzh.market.mapper.my.MyMarketMessageMapper;
import com.yzh.market.req.MarketMessageReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.vo.MarketMessageVo;
import com.yzh.market.vo.MarketUserVo;

@Service
public class MessageService {
	
	@Autowired
	private MyMarketMessageMapper myMarketMessageMapper;
	
	@Autowired
	private MarketMessageMapper marketMessageMapper;
	
	@Autowired
	private CommonResp res ;
	
	public PageResp<MarketMessageVo> list(MarketMessageReq message) {
		PageHelper.startPage(message.getPageNum(),message.getSize());
		List<MarketMessageVo> list = myMarketMessageMapper.selectListByUserId(message);
		PageInfo<MarketMessageVo> pageInfo = new PageInfo<MarketMessageVo>(list);
		PageResp<MarketMessageVo> p = new PageResp<MarketMessageVo>();
		p.setPages(pageInfo.getPages());
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
	
	public PageResp<MarketMessageVo> getTopList(MarketMessageReq message) {
		PageHelper.startPage(message.getPageNum(),10);
		List<MarketMessageVo> list = myMarketMessageMapper.selectTopList(message);
		PageResp<MarketMessageVo> p = new PageResp<MarketMessageVo>();
		p.setList(list);
		return p;
	}
 
	public CommonResp save(MarketMessageReq message, HttpSession session) {
		String id = message.getId();
		if(!"".equals(id) && id !=null) {
			message.preUpdate();
			myMarketMessageMapper.update(message);
		}else {
			MarketUserVo user = (MarketUserVo)session.getAttribute("user");
			MarketUser u = CopyUtil.copy(user, MarketUser.class);
			message.preInsert();
			message.setUser(u);
			message.setTopValue("0");
			myMarketMessageMapper.save(message);
			res.setMessage("ok");
		}
		
		return res;
	}

	public CommonResp delete(MarketMessageReq req) {
		String id = req.getId();
		marketMessageMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}

	public MarketMessageVo getMessageDetail(MarketMessageReq message) {
		MarketMessageVo marketMessage = myMarketMessageMapper.get(message);
		MarketMessage mess = new MarketMessage();
		Integer topValue = Integer.valueOf(marketMessage.getTopValue());
		mess.setId(message.getId());
		mess.setTopValue(topValue+1+"");
		marketMessageMapper.updateByPrimaryKeySelective(mess);
		return marketMessage;
	}
	
}
