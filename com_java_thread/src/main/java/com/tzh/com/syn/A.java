package com.tzh.com.syn;

public class A {
	public synchronized void a(){
		System.out.println("a");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static synchronized void b(){
		System.out.println("b");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void c(){
		synchronized (this) {
			System.out.println("c");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
