package com.tzh.card.util;

import com.tzh.Charge.util.CardCharge;
import com.tzh.account.util.Account;
import com.tzh.util.DataUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CardService {
	/**
	 * 办卡
	 * 输入身份证号,验证是否有这个账户
	 */
	public void add(Scanner scan){
		System.out.println("请输入你的身份证:");
		String cId = scan.nextLine();
		boolean sfbol = sfExists(cId);
		if(!sfbol){
			System.out.println("你输入的身份证不存在");
		}
		boolean bol = comRepeat(cId);
		if(bol){
			System.out.println("身份证"+cId+"已经办过卡了,如果丢失请携带身份证或者卡号注销旧卡");
		}
		String state = "0";
		System.out.println("请输入卡号");
		String cradNo=scan.nextLine();
		System.out.println("请输入本次要充值金额");
		String money=scan.nextLine();
		Card card= new Card(cradNo,cId,String.valueOf(money),state);
		DataUtil.cardList.add(card);
		System.out.println("添加Crad信息成功");
	}

	/**
	 * 充值
	 * 输入身份证号,卡号
	 * if (正确){
	 * 	输入要充值的金额数
	 *  充值成功
	 *  修改卡的余额
	 *  记录历史
	 * }else {
	 * 	提示信息不正确
	 * }
	 * @throws NoExistsException
	 */
	public void charge(Scanner scan){
		System.out.println("请输入身份证");
		String cId = scan.nextLine();
		boolean sfBol = sfExists(cId);
		if(!sfBol){
			System.out.println("你输入的身份证不存在");
		}
		System.out.println("请输入卡号:");
		String cardNo = scan.nextLine();
		boolean caBol = cardNoExists(cardNo);
		if(!caBol){
			System.out.println("你输入的卡号不存在");
		}
		System.out.println("请输入要充值的金额:");
		String money = scan.nextLine();//充值上限没有做
		Double dMoney = Double.valueOf(money);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		String time = df.format(new Date());// new Date()为获取当前系统时间   当前时间
		for(int i=0;i<DataUtil.cardList.size();i++){
			Card ca = DataUtil.cardList.get(i);
			//确定取出的不是空,而且卡号和身份证号码都是正确匹配的
			if(null != ca && cId.equals(ca.getcId()) && cardNo.equals(ca.getCardNo())){
				ca.setMoney(ca.getMoney()+dMoney);
				DataUtil.cardList.set(i, ca);
				CardCharge chis = new CardCharge(cardNo, cId, String.valueOf(ca.getMoney()), money, time);
				DataUtil.cardChargeList.add(chis);
				break;
			}
		}
		System.out.println("充值成功");
	}

	/**
	 * 消卡
	 * @throws NoExistsException
	 */
	public void delete(Scanner scan){
		System.out.println("请输入身份证");
		String sf = scan.nextLine();
		boolean sfBol = sfExists(sf);
		if(!sfBol){
			System.out.println("你输入的身份证不存在");
		}
		System.out.println("请输入注销卡号:");
		String cardNo = scan.nextLine();
		boolean caBol = cardNoExists(cardNo);
		if(!caBol){
			System.out.println("你输入的卡号不存在");
		}
		int i = delComIndex(cardNo,sf);
		if(i != -1){
			DataUtil.accoutList.remove(i);
		}
		System.out.println("删除成功");
	}
	/**
	 * 查询Crad信息
	 * 输入卡号, 根据卡号到CardChargeHis中查询
	 * @throws NoExistsException
	 */
	public void cardFormention(Scanner can){
		System.out.println("请输入要查询的卡号:");
		String cardNo = can.nextLine();
		boolean bol = cardNoExists(cardNo);
		if(!bol){
			System.out.println("你输入的卡号不存在");
		}
		for (Card com : DataUtil.cardList) {
			if (null != com && com.getCardNo().equals(cardNo)) {
				System.out.println("卡号:"+com.getCardNo()+"  身份证:"+com.getcId()+"  卡号："+com.getCardNo()+"  本次充值:"+com.getMoney()+"  Crad状态（0.正常卡  1.已注销）"+com.getState() );
			}
		}
	}

	/**
	 * 查询Crad充值历史
	 * 输入卡号, 根据卡号到CardChargeHis中查询
	 * @throws NoExistsException
	 */
	public void queryHis(Scanner can){
		System.out.println("请输入要查询的卡号:");
		String cardNo = can.nextLine();
		boolean bol = cardNoExists(cardNo);
		if(!bol){
			System.out.println("你输入的卡号不存在");
		}
		for (CardCharge com : DataUtil.cardChargeList) {
			if (null != com && com.getCardNo().equals(cardNo)) {
				System.out.println("卡号:"+com.getCardNo()+"  身份证:"+com.getcId()+"  余额:"+com.getCurMoney()+"  本次充值:"+com.getMoney()+"   充值时间:"+com.getDatetime());
			}
		}
	}

	/**
	 * 判断身份证是否创建过号码
	 * @param name 身份证
	 * @return
	 */
	public static boolean comRepeat(String name){
		for (Card com : DataUtil.cardList) {
			if (null != com && name.equals(com.getcId())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断身份证是否是存在的
	 * @param name 身份证
	 * @return
	 */
	public static boolean sfExists(String name){
		for (Account com : DataUtil.accoutList) {
			if (null != com && name.equals(com.getcId())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断卡号是否是存在的
	 * @param name 卡号
	 * @return
	 */
	public static boolean cardNoExists(String name){
		for (Card com : DataUtil.cardList) {
			if (null != com && name.equals(com.getCardNo())) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 得到要删除卡号的下标
	 * @param oldName 卡号
	 * @param sf 身份证号
	 * @return
	 */
	public static int delComIndex(String oldName,String sf){
		for(int i = 0;i<DataUtil.cardList.size();i++){
			Card com = DataUtil.cardList.get(i);
			if(null != com && oldName.equals(com.getCardNo()) && sf.equals(com.getcId())){
				return i;
			}
		}
		return -1;
	}
	/**
	 * 销卡同时卡片充值历史类对应的历史也要删除
	 */
	public static void delCardAndHis(){

	}
}
