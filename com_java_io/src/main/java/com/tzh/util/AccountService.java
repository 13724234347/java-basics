package com.tzh.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AccountService {
	/*
	 * IO增加
	 * */
	public void addAccount(Scanner can) {
		List<String> list = new ArrayList<>();
		String path = "F:\\test\\io\\account.txt";
		File file1 = new File(path);
		try {
			FileInputStream out = new FileInputStream(file1);
			InputStreamReader output = new InputStreamReader(out);
			BufferedReader read = new BufferedReader(output);
			String line = "";
			while ((line = read.readLine()) != null) {
				System.out.println("信息" + line);
				list.add(line);
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("增加账号");
		String account = can.nextLine();
		for(String strs:list){
			String strArr[] = strs.split(",");
			if(strArr[0].equals(account)){
				System.out.println("账号已存在，请重输");
				return;
			}
		}

		System.out.println("输入你的身份证号");
		String cId = can.nextLine();
		String str = "F:\\test\\io\\account.txt";
		File file = new File(str);

		try {
			FileOutputStream out = new FileOutputStream(file, true);
			OutputStreamWriter output = new OutputStreamWriter(out);
			BufferedWriter read = new BufferedWriter(output);
			try {
				read.write(account.trim() + "," + cId.trim());
				read.newLine();
				read.flush();
				read.close();
				output.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/*
	 * IO删除
	 * */
	public void deleteAccount(Scanner can) {
		List<String> list = new ArrayList<>();
		String str = "F:\\test\\io\\account.txt";
		File file = new File(str);
		try {
			FileInputStream out = new FileInputStream(file);
			InputStreamReader output = new InputStreamReader(out);
			BufferedReader read = new BufferedReader(output);
			String line = "";
			while ((line = read.readLine()) != null) {
				System.out.println("信息" + line);
				list.add(line);
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String zhString = null;
		System.out.println("请输入你要删除的账户");
		String account = can.nextLine();
		for (String string : list) {
			String accountArr[] = string.split(",");
			if (account.equals(accountArr[0].trim())) {
				zhString = string;
			}
		}
		if (null != zhString) {
			list.remove(zhString);
		} else {
			System.out.println("没有这个账户，请重输");
			return;
		}
		String path = "F:\\test\\io\\account.txt";
		File files = new File(path);

		try {
			FileOutputStream out = new FileOutputStream(files);
			OutputStreamWriter output = new OutputStreamWriter(out);
			BufferedWriter read = new BufferedWriter(output);
			for (String string : list) {
				read.write(string);
				read.newLine();
				read.flush();
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("删除成功");
	}
	/*
	 *IO 修改
	 * */
	public void Update(Scanner can) {
		List<String> list = new ArrayList<>();
		String str = "F:\\test\\io\\account.txt";
		File file = new File(str);

		try {
			FileInputStream out = new FileInputStream(file);
			InputStreamReader output = new InputStreamReader(out);
			BufferedReader read = new BufferedReader(output);
			String line = "";
			while ((line = read.readLine()) != null) {
				System.out.println("信息" + line);
				list.add(line);
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("请输入你要修改的账户");
		String account = can.nextLine();
		int updateIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			String string = list.get(i);
			String updateIndexArr[] = string.split(",");
			if (account.equals(updateIndexArr[0])) {
				updateIndex = i;
			}
		}
		if (-1 == updateIndex) {
			System.out.println("没有这个账户，请重输");
			return;
		}
		System.out.println("请输入新的账户");
		String newAccount = can.nextLine();
		for(String strs:list){
			String strArr[] = strs.split(",");
			if(strArr[0].equals(newAccount)){
				System.out.println("账号已存在，请重输");
				return;
			}
		}
		System.out.println("请输入新的身份证号码");
		String newCId = can.nextLine();
		list.set(updateIndex, newAccount + "," + newCId);

		String sr = "F:\\test\\io\\account.txt";
		File files = new File(sr);

		try {
			FileOutputStream out = new FileOutputStream(file);
			OutputStreamWriter output = new OutputStreamWriter(out);
			BufferedWriter read = new BufferedWriter(output);
			for (String string : list) {
				read.write(string);
				read.newLine();
				read.flush();
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("修改成功");
	}
	/*
	 * IO查询
	 * */
	public void query() {
		List<String> list = new ArrayList<>();
		String str = "F:\\test\\io\\account.txt";
		File file = new File(str);
		try {
			FileInputStream out = new FileInputStream(file);
			InputStreamReader output = new InputStreamReader(out);
			BufferedReader read = new BufferedReader(output);
			String line = "";
			while ((line = read.readLine()) != null) {
				System.out.println("信息" + line);
			}
			read.close();
			output.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
