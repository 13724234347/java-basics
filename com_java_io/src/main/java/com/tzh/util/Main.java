package com.tzh.util;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		AccountService accountService=new AccountService();
		while(true){
			System.out.println("请输入：1.添加账户 信息 2.删除账户信息  3.更改账户信息   4.查询账户信息  5.退出 账户管理系统");
			String accountSystem=can.nextLine();
			if("1".equals(accountSystem)){
				accountService.addAccount(can);
			}else if("2".equals(accountSystem)){
				accountService.deleteAccount(can);
			}else if("3".equals(accountSystem)){
				accountService.Update(can);
			}else if("4".equals(accountSystem)){
				accountService.query();
			}else if("5".equals(accountSystem)){
				System.out.println("退出 账户管理系统");
				break;
			}
		}
	}
}

