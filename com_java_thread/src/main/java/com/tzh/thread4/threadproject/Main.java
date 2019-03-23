package com.tzh.thread4.threadproject;

public class Main {
	public static void main(String[] args) {
		
		Extends ex=new Extends();
		Thread th=new Thread(ex);
		th.stop();
		th.start();
		
		
		Mythread my=new Mythread("tom");
		my.start();
		System.out.println(my.getName());
		System.out.println(my.getId());
		
		
		/*
		 * 
		Mythread test=new Mythread("tom");
		System.out.println(test.getName());
		System.out.println(test.getId());
		test.start(); 
		
		Mythread test1=new Mythread("Aday");
		System.out.println(test1.getName());
		test1.start();
		System.out.println(test1.getId());
		
		Mythread test2=new Mythread("Pite");
		System.out.println(test2.getName());
		test2.start();
		System.out.println(test2.getId());
		
		Mythread test3=new Mythread("tree");
		try {
			test3.sleep(1000*10);
			System.out.println(test3.getName());
			System.out.println(test3.getId());
			test3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("========="+Thread.activeCount());
		
	}
}
