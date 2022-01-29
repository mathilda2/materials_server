package com.yzh.market.req;

import org.hibernate.validator.constraints.NotEmpty;

import com.yzh.market.common.PageReq;

public class MarketUserReq extends PageReq{
    private String id;
    
    @NotEmpty(message="【用户名】不能为空")
    private String userName;
    
    @NotEmpty(message="【密码】不能为空")
    private String passWord;
    
    private String image;
    private String studentNo;
    private String birthday;
    private String sex;
    private String email;
    private String phone;
    
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassword(String passWord) {
        this.passWord = passWord;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}