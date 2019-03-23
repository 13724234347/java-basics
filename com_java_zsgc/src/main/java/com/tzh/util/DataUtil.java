package com.tzh.util;

import com.tzh.Charge.util.CardCharge;
import com.tzh.account.util.Account;
import com.tzh.card.util.Card;

import java.util.ArrayList;
import java.util.List;


public class DataUtil {

	/**
	 * 账户集合
	 */
	public static List<Account> accoutList = new ArrayList<>();

	/**
	 * 卡集合
	 */
	public static List<Card> cardList = new ArrayList<>();

	/**
	 * 卡充值历史集合
	 */
	public static List<CardCharge> cardChargeList=new ArrayList<>();

}
