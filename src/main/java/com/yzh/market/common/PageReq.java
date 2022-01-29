package com.yzh.market.common;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

public class PageReq extends BaseEntity{
	@NotNull(message="【页码】 不能为空")
	private int pageNum;
	
	@NotNull(message="【每页条数】 不能为空")
	@Max(value=1000,message="【每页条数】不能超过100")
	private int size;
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
