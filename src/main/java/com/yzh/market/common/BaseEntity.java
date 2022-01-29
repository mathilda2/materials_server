package com.yzh.market.common;

import java.util.Date;

import com.alibaba.druid.util.StringUtils;
import com.yzh.market.consts.MarketConsts;
import com.yzh.market.entity.MarketUser;
import com.yzh.market.utils.SnowFlake;
import com.yzh.market.utils.UserUtils;

public class BaseEntity {
	
	private String id;
	private String delFlag;
    private MarketUser createBy;
    private Date createDate;
    private MarketUser updateBy;
    private Date updateDate;
    
    public BaseEntity() {
		this.delFlag = MarketConsts.DEL_FLAG_NORMAL;
	}
    
    protected boolean isNewRecord = false;
    
    public void preInsert(){
		if (!this.isNewRecord){
			SnowFlake snowFlake = new SnowFlake(); 
			Long id = snowFlake.nextId();
			setId(id.toString());
		}
		MarketUser user = UserUtils.getUser();
		if (!StringUtils.isEmpty(user.getId())){
			this.updateBy = user;
			this.createBy = user;
		}
		this.updateDate = new Date();
		this.createDate = this.updateDate;
	}
	
	 
	public void preUpdate(){
		MarketUser user = UserUtils.getUser();
		if (!StringUtils.isEmpty(user.getId())){
			this.updateBy = user;
		}
		this.updateDate = new Date();
	}   
	
	public boolean getIsNewRecord() {
        return isNewRecord || StringUtils.isEmpty(getId());
    }

	public void setIsNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}
	
    public MarketUser getCreateBy() {
		return createBy;
	}
	public void setCreateBy(MarketUser createBy) {
		this.createBy = createBy;
	}
	public MarketUser getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(MarketUser updateBy) {
		this.updateBy = updateBy;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	 
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
