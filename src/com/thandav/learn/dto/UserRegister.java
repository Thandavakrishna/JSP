package com.thandav.learn.dto;

public class UserRegister {
	
	private String userId;
	private String userName;
	private String Address1;
	private String Address2;
	private String Address3;
	private String Pin;
	private String State;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress1() {
		return Address1;
	}
	public void setAddress1(String address1) {
		Address1 = address1;
	}
	public String getAddress2() {
		return Address2;
	}
	public void setAddress2(String address2) {
		Address2 = address2;
	}
	public String getAddress3() {
		return Address3;
	}
	public void setAddress3(String address3) {
		Address3 = address3;
	}
	public String getPin() {
		return Pin;
	}
	public void setPin(String pin) {
		Pin = pin;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
}
