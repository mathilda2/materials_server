package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.entity.MarketSalesType;
import com.yzh.market.mapper.MarketSalesTypeMapper;
import com.yzh.market.mapper.my.MyMarketSalesTypeMapper;
import com.yzh.market.req.MarketSalesTypeReq;
import com.yzh.market.utils.CopyUtil;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketSalesTypeVo;
import com.yzh.market.vo.MarketTypeVo;

@Service
public class SalesTypeService {
	
	
	@Autowired
	private MarketSalesTypeMapper marketSalesTypeMapper;
	
	@Autowired
	private MyMarketSalesTypeMapper myMarketSalesTypeMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake;

	public PageResp<MarketSalesTypeVo> list(MarketSalesTypeReq salesSalesType) {
		PageHelper.startPage(salesSalesType.getPageNum(),salesSalesType.getSize());
		List<MarketSalesTypeVo> list = myMarketSalesTypeMapper.findList(salesSalesType);
		PageInfo<MarketSalesTypeVo> pageInfo = new PageInfo<MarketSalesTypeVo>(list);
		PageResp<MarketSalesTypeVo> p = new PageResp<MarketSalesTypeVo>();
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
 
	public CommonResp save(MarketSalesTypeReq salesSalesType, HttpSession session) {
		String id = salesSalesType.getId();
		if(!"".equals(id) && id !=null) {
			salesSalesType.preUpdate();
			myMarketSalesTypeMapper.update(salesSalesType);
		}else {
			salesSalesType.preInsert();
			myMarketSalesTypeMapper.insert(salesSalesType);
			res.setMessage("更改成功");
		}
		return res;
	}

	public CommonResp delete(MarketSalesTypeReq req) {
		String id = req.getId();
		marketSalesTypeMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}
	
	 
	
	
}
