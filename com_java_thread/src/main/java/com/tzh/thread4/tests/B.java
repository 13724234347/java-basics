package com.tzh.thread4.tests;

public class B {
	 public static void main(String[] args) {
		A a1 = new A(0,20);
		Thread t = new Thread(a1);
		t.start();
		
		A a2 = new A(20,40);
		Thread t1 = new Thread(a2);
		t1.start();
		
		A a3 = new A(40,60);
		Thread t2 = new Thread(a3);
		t2.start();
		
		A a4 = new A(60,80);
		Thread t3 = new Thread(a4);
		t3.start();
		
		A a5 = new A(80,101);
		Thread t4 = new Thread(a5);
		t4.start();
		
		try {
			t.join();
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("====="+(a1.getSum()+a2.getSum()+a3.getSum()+a4.getSum()+a5.getSum()));
	}
}
