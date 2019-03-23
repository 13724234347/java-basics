package com.tzh.fangshe;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws Exception {
		 /**
		  * @2017-10-09夜晚
		  */
		Class<?> cls=Class.forName("com.tzh.fangshe.Test");
		Test test=(Test)cls.newInstance();
		test.setName("你恐怕是失了智");
		test.setAge(48);
		
		Method mths1 = cls.getDeclaredMethod("getName");
		Method mths2 = cls.getDeclaredMethod("getAge");
		mths1.invoke(test);
		mths2.invoke(test);
		System.out.println(test.getName());
		System.out.println(test.getAge());
		/**
		  * @2017-10-09上午
		  */
		Field[] fieldlist = cls.getDeclaredFields();//反射变量
		Method[] mths = cls.getDeclaredMethods();//反射方法
		
 		for (int i = 0; i < fieldlist.length; i++){
			Field fld=fieldlist[i];
			System.out.println("路径为com.tzh.fangshe.Test里的变量名："+   fld.getName());//打印变量名
		}
		for (int i = 0; i < mths.length; i++) {
			Method mth=mths[i];
			//System.out.println(mth.getName());
			Class<?>[] parameterTypes = mth.getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				Class<?> class1 = parameterTypes[j];
				//System.out.println("路径为com.fanshe.Test的方法名："+   mth.getName());//打印方法名
				System.out.println(mth.getName()+"方法有参数，参数类型为======"+class1.getName());//打印"mth.getName"里的参数类型
			}
		}
	}
}