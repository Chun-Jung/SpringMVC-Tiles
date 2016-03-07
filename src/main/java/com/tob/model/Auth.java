package com.tob.model;

import org.apache.commons.lang3.StringUtils;

public class Auth {
	/** �v���s�� */
	private Integer authNo;
	/** �v���W�� */
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
