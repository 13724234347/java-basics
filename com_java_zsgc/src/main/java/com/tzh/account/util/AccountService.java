package com.tzh.account.util;

import java.util.Scanner;

import com.tzh.account.util.Account;
import com.tzh.util.DataUtil;


public class AccountService {

	/*
	 * 添加账户
	 * */
	public void add(Scanner can){
		System.out.println("请输入账号：");
		String account =can.nextLine();
		boolean bol=addAccountExists(account);
		if(bol){
			System.out.print("你输入的账户已存在");
		}else{
			System.out.print("请输入身份证：");
			String cId=can.nextLine();
			boolean boll=addCIdExists(cId);
			if(boll){
				System.out.print("你输入的身份证号码已存在");
			}else{
				Account acount=new Account(account,cId);
				DataUtil.accoutList.add(acount);
				System.out.println("添加成功");
			}
		}
	}
	/*
	 * 删除账户
	 * */
	public void delete(Scanner can){
		System.out.println("请输入你要删除的账号：");
		String account =can.nextLine();
		boolean bol=addAccountExists(account);
		if(!bol){
			System.out.print("你输入的账户不存在");
		}
		int i=delAccountIndex(account);
		if(i  !=-1){
			DataUtil.accoutList.remove(account);
		}
		System.out.println("删除成功");
	}
	/*
	 * 修改账户
	 * */
	public void update(Scanner can){
		System.out.println("请输入你要修改的账户号码");
		String account=can.nextLine();
		boolean bol=addAccountExists(account);
		if(!bol){
			System.out.println("你要修改的账户号码已存在，请重输");
		}System.out.print("请输入新的账户号码");
		String newAccount=can.nextLine();
		if(!newAccount.equals(account)){
			boolean bol1 = addAccountExists(newAccount);
			if(bol1){
				System.out.println("你修改的公司已经存在");
			}
		}else{
			System.out.println("你输入的不能和修改前的一样");
		}
		for (int i = 0; i < DataUtil.accoutList.size(); i++) {
			Account com = DataUtil.accoutList.get(i);
			if (account.equals(com.getAccount())) {
				com.setAccount(newAccount);
				DataUtil.accoutList.set(i,com);
				break;
			}
		}
		System.out.println("修改成功");

	}

	/*
	 * 查询账户
	 * */
	public void query(){
		boolean bol=false;
		for(Account acc : DataUtil.accoutList){
			if(null !=acc){
				bol=true;
				System.out.println("账号:"+acc.getAccount()+"  身份证:"+acc.getcId());
			}
		}
		if(!bol){
			System.out.println("没有账号，请添加");
		}
	}

	/*
	 * 判断要增加的身份证号码是否重复
	 * */
	public static boolean addCIdExists(String cId){
		for(Account can:DataUtil.accoutList){
			if(null !=can && cId.endsWith(can.getcId())){
				return true;
			}
		}
		return false;

	}

	/*
	 * 判断账号是否重复
	 * */
	public static boolean addAccountExists(String account){
		//return false;
		for(Account can:DataUtil.accoutList){
			if(null !=can && account.endsWith(can.getAccount())){
				return true;
			}
		}
		return false;

	}
	/*
	 * 获得要删除账户的下标
	 * */
	public static int delAccountIndex(String account){
		for(int i=0;i<DataUtil.accoutList.size();i++){
			Account com=DataUtil.accoutList.get(i);
			if(account.endsWith(com.getAccount())){
				return i;
			}
		}
		return -1;
	}
}
