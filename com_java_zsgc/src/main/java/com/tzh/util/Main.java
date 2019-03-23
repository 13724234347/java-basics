package com.tzh.util;

import com.tzh.account.util.AccountService;
import com.tzh.card.util.CardService;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		CardService cardService=new CardService();
		Scanner can=new Scanner(System.in);
		while(true){
			System.out.print("欢迎来到校园一卡通系统");
			System.out.println("请输入：1.账户管理系统  2.Card管理系统  3.退出管理系统");
			String schoolSystem=can.nextLine();
			if("1".equals(schoolSystem)){
				while(true){
					System.out.println("请输入：1.添加账户 信息 2.删除账户信息  3.更改账户信息   4.查询账户信息  5.退出 账户管理系统");
					String accountSystem=can.nextLine();
					if("1".equals(accountSystem)){
						accountService.add(can);
					}else if("2".equals(accountSystem)){
						accountService.delete(can);
					}else if("3".equals(accountSystem)){
						accountService.equals(can);
					}else if("4".equals(accountSystem)){
						accountService.query();
					}else if("5".equals(accountSystem)){
						System.out.println("退出 账户管理系统");
						break;
					}
				}
			}else if("2".equals(schoolSystem)){
				while(true){
					System.out.println("请输入：1.办卡 2.充值  3.注销卡 4.查看Card信息 5.查看充值历史  6.退出 Card管理系统");
					String cardSystem=can.nextLine();
					if("1".equals(cardSystem)){
						cardService.add(can);
					}else if("2".equals(cardSystem)){
						cardService.charge(can);
					}else if("3".equals(cardSystem)){
						cardService	.delete(can);
					}else if("4".equals(cardSystem)){
						cardService.cardFormention(can);
					}else if("5".equals(cardSystem)){
						cardService.queryHis(can);
					}else if("6".equals(cardSystem)){
						System.out.println("退出Card管理系统");
						break;
					}
				}
			}else if("3".equals(schoolSystem)){
				System.out.println("退出管理系统");
				break;
			}
		}
	}
}
