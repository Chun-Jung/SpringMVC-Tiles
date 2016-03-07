package com.tob.model;

import org.apache.commons.lang3.StringUtils;

public class Auth {
	/** 權限編號 */
	private Integer authNo;
	/** 權限名稱 */
	private String authName;
	
	public Auth(){	}
	public Auth(Integer authNo){
		this.authNo = authNo;
		this.authName = StringUtils.EMPTY;
	}
	
	public Integer getAuthNo() {
		return authNo;
	}
	public void setAuthNo(Integer authNo) {
		this.authNo = authNo;
	}
	public String getAuthName() {
		return authName;
	}
	public void setAuthName(String authName) {
		this.authName = authName;
	}
	
}
