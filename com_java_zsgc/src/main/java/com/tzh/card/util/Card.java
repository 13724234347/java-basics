package com.tzh.card.util;

public class Card {
	private String cardNo;
	private String cId;
	private String money;
	private String state;
	
	public Card(){
		super();
	}
	public Card(String cardNo,String cId,String money,String state){
		super();
		this.cardNo=cardNo;
		this.cId=cId;
		this.money=money;
		this.state=state;
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cId=" + cId + ", money=" + money + ", state=" + state + "]";
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
