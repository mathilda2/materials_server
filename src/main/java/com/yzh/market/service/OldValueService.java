package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketOldValue;
import com.yzh.market.mapper.MarketOldValueMapper;
import com.yzh.market.mapper.my.MyMarketOldValueMapper;
import com.yzh.market.req.MarketOldValueReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketAreaVo;
import com.yzh.market.vo.MarketOldValueVo;

@Service
public class OldValueService {
	
	
	@Autowired
	private MarketOldValueMapper marketOldValueMapper;
	
	@Autowired
	private MyMarketOldValueMapper myMarketOldValueMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake;

	public PageResp<MarketOldValueVo> list(MarketOldValueReq type) {
		PageHelper.startPage(type.getPageNum(),type.getSize());
		List<MarketOldValueVo> list = myMarketOldValueMapper.findList(type);
		PageInfo<MarketOldValueVo> pageInfo = new PageInfo<MarketOldValueVo>(list);
		PageResp<MarketOldValueVo> p = new PageResp<MarketOldValueVo>();
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
 
	public CommonResp save(MarketOldValueReq type, HttpSession session) {
		String id = type.getId();
		if(!"".equals(id) && id !=null) {
			type.preUpdate();
			myMarketOldValueMapper.update(type);
		}else {
			type.preInsert();
			myMarketOldValueMapper.insert(type);
			res.setMessage("更改成功");
		}
		return res;
	}

	public CommonResp delete(MarketOldValueReq req) {
		String id = req.getId();
		marketOldValueMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}
	
	 
	
	
}
