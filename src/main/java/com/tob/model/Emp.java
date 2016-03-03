package com.tob.model;

import java.sql.Date;

public class Emp {
	/** 員工編號 */
	private Integer empNo;
	/** 狀態 */
	private Integer state;
	
	/** 帳號 */
	private String account;
	/** 密碼 */
	private String password;
	/** 姓名 */
	private String name;
	/** 手機號碼 */
	private String phoneNumber;
	/** 電話號碼 */
	private String telNumber;
	/** 電子信箱 */
	private String email;
	/** 住家地址 */
	private String address;
	
	/** 到職日 */
	private Date availabilityDt;

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getAvailabilityDt() {
		return availabilityDt;
	}

	public void setAvailabilityDt(Date availabilityDt) {
		this.availabilityDt = availabilityDt;
	}
	
}
