package com.tzh.Charge.util;

public class CardCharge {
	private String cardNo; // 卡片号码
	private String cId;  //冗余
	private String curMoney; //当前余额
	private String money; //本次充值金额
	private String datetime;//充值时间

	public CardCharge(String cardNo, String cId, String curMoney, String money, String datetime) {
		super();
		this.cardNo = cardNo;
		this.cId = cId;
		this.curMoney = curMoney;
		this.money = money;
		this.datetime = datetime;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getCurMoney() {
		return curMoney;
	}
	public void setCurMoney(String curMoney) {
		this.curMoney = curMoney;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "CardCharge [cardNo=" + cardNo + ", cId=" + cId + ", curMoney=" + curMoney + ", money=" + money
				+ ", datetime=" + datetime + "]";
	}

}
