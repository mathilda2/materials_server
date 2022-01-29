package com.yzh.market.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzh.market.common.CommonResp;
import com.yzh.market.common.PageResp;
import com.yzh.market.mapper.MarketAreaMapper;
import com.yzh.market.mapper.my.MyMarketAreaMapper;
import com.yzh.market.req.MarketAreaReq;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.vo.MarketAreaVo;

@Service
public class AreaService {
	
	
	@Autowired
	private MarketAreaMapper marketAreaMapper;
	
	@Autowired
	private MyMarketAreaMapper myMarketAreaMapper;
	
	@Autowired
	private CommonResp res ;
	
	@Autowired
	private SnowFlake snowFlake; 

	public PageResp<MarketAreaVo> list(MarketAreaReq area) {
		PageHelper.startPage(area.getPageNum(),area.getSize());
		List<MarketAreaVo> list = myMarketAreaMapper.findList(area);
		PageInfo<MarketAreaVo> pageInfo = new PageInfo<MarketAreaVo>(list);
		PageResp<MarketAreaVo> p = new PageResp<MarketAreaVo>();
		p.setList(list);
		p.setTotal(pageInfo.getTotal());
		return p;
	}
 
	public CommonResp save(MarketAreaReq area, HttpSession session) {
		String id = area.getId();
		if(!"".equals(id) && id !=null) {
			area.preUpdate();
			myMarketAreaMapper.update(area);
		}else {
			area.preInsert();
			myMarketAreaMapper.insert(area);
			res.setMessage("更改成功");
		}
		return res;
	}

	public CommonResp delete(MarketAreaReq req) {
		String id = req.getId();
		marketAreaMapper.deleteByPrimaryKey(id);
		res.setMessage("删除成功");
		return res;
	}
	
	 
	
	
}
