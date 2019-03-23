package com.tzh.Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String str = sdf.format(date);
		System.out.println(str);
		
		String aaa=str;
		Date d=sdf.parse(aaa);
		System.out.println(d);
		System.out.println(date);
	}
}