package com.tzh.Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtil{
	public static void main(String[] args) throws Exception{
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		Date date = new Date();
		String str = sdf.format(date);
		System.out.println(str);*/
		//Calendar   是一个时间工具类
		Calendar calendar = Calendar.getInstance();//获取calendar对象，为什么不NEW，因为构造方法是受保护的.这里关系到修饰符的范围，
		//权限修饰符   public private protected 还有一个是默认的
		//里面还没有设置时间，如果没有设置，就会取当前系统默认时间

		//可以设置时间（calendar原来没值，可以通过设置时间，1，设置date 2，设置通过set来设置 3，通过时间戳设置）
		//1. calendar.setTime(new Date());
		//2. calendar.set(2017,9,05,10,31,20);
		//3. calendar.setTimeInMillis(System.currentTimeMillis());

		String strDate = "2017-10-06 11:36:31";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = simpleDateFormat.parse(strDate);
		calendar.setTime(date);

		//得到年月日时分秒，如果再想得到别的信息就去java.util.Calendar 中寻找常量进行获取
	/*	System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));*/

		System.out.println(calendar.getTimeInMillis());//得到时间戳
		System.out.println(calendar.getTime());//得到日期




		//比如：我计算的月会改变年，calendar会自动改变
		calendar.add(calendar.YEAR, 10);//把calendar进行年计算（进行加减）
		calendar.add(calendar.MONTH, 10);//把calendar进行年计算（进行加减）
		calendar.add(calendar.DAY_OF_MONTH, 10);//把calendar进行年计算（进行加减）
		calendar.add(calendar.HOUR_OF_DAY, 10);//把calendar进行年计算（进行加减）
		calendar.add(calendar.MINUTE, 10);//把calendar进行年计算（进行加减）
		calendar.add(calendar.SECOND, 10);//把calendar进行年计算（进行加减）

		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));


		//System.out.println("date=== " +date);

	}
}
