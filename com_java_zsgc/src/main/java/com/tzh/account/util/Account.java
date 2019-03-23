package com.tzh.account.util;

public class Account {
	private String account;
	private String cId;

	public Account(String account,String cId){
		this.account=account;
		this.cId=cId;
	}
	@Override
	public String toString() {
		return "账户信息     账户号码：" + account + "; 身份证号码：" + cId + ";";
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
	public void setcIf(String cId) {
		this.cId = cId;
	}


}
