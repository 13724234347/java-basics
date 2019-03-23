package com.tzh.work;

public class Test {
	//静态的，同步的；
	public static synchronized void test(){
		System.out.println("=====静态的，同步的");
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//非静态的，同步的；
	public synchronized void test1(){
		System.out.println("======非静态的，同步的");
		try {
			Thread.sleep(3*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//同步块；
	public void test2(){
		synchronized (this) {
			System.out.println("同步块");
			try {
				Thread.sleep(3*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
