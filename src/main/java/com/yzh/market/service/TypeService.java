package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketType;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.mapper.MarketTypeMapper;
import com.yzh.market.mapper.my.MyMarketMessageMapper;
import com.yzh.market.mapper.my.MyMarketTypeMapper;
import com.yzh.market.req.MarketTypeReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketMessageVo;
import com.yzh.market.vo.MarketTypeVo;

@Service
public class TypeService {	
	
	@Autowired
	private MarketTypeMapper marketTypeMapper;
	
	@Autowired
	private MyMarketMessageMapper myMarketMessageMapper;
	
	@Autowired
	private MyMarketTypeMapper myMarketTypeMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake;

	public PageResp<MarketTypeVo> list(MarketTypeReq type) {
		PageHelper.startPage(type.getPageNum(),type.getSize());
		List<MarketTypeVo> list = myMarketTypeMapper.findList(type);
		PageInfo<MarketTypeVo> pageInfo = new PageInfo<MarketTypeVo>(list);
		PageResp<MarketTypeVo> p = new PageResp<MarketTypeVo>();
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
 
	public CommonResp save(MarketTypeReq type, HttpSession session) {
		String id = type.getId();
		if(!"".equals(id) && id !=null) {
			type.preUpdate();
			myMarketTypeMapper.update(type);
		}else {
			type.preInsert();
			myMarketTypeMapper.insert(type);
			res.setMessage("更改成功");
		}
		
		return res;
	}

	public CommonResp delete(MarketTypeReq req) {
		String id = req.getId();
		marketTypeMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}

	public List<MarketTypeVo> getRecommendList(MarketTypeReq type) {
		List<MarketType> list = marketTypeMapper.selectByExample(null);
		List<MarketTypeVo> copyList = CopyUtil.copyList(list, MarketTypeVo.class);
		for(MarketTypeVo tlist : copyList) {
			String id = tlist.getId();
			PageHelper.startPage(1,10);
			List<MarketMessageVo> mlist = myMarketMessageMapper.selectListByTypeId(id);
			tlist.setChildList(mlist); 
		}
		return copyList;
	}
	
	
}
