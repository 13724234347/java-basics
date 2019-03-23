package com.tzh.util;

public class Account {
	private String account;
	private String cId;
	public Account(String account,String cId){
		this.account=account;
		this.cId=cId;
	}
	@Override
	public String toString() {
		return "账号信息    账号：" + account + ", 身份证号：" + cId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}


}
