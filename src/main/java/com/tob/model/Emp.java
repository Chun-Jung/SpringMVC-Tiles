package com.tob.model;

import java.sql.Date;

public class Emp {
	/** ���u�s�� */
	private Integer empNo;
	/** ���A */
	private Integer state;
	
	/** �b�� */
	private String account;
	/** �K�X */
	private String password;
	/** �m�W */
	private String empName;
	/** ������X */
	private String phoneNumber;
	/** �q�ܸ��X */
	private String telNumber;
	/** �q�l�H�c */
	private String email;
	/** ��a�a�} */
	private String address;
	
	/** ��¾�� */
	private Date availabilityDt;
	/** �إߤ�� */
	private Date createDt;

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

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}
	
}
