package com.tzh.com.syn;

public class D  extends Thread{
	A a;
	public D(A a){
		this.a=a;
	}
	@Override
	public void run() {
		a.c();
	}
}
