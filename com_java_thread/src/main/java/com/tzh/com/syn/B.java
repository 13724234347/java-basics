package com.tzh.com.syn;

public class B extends Thread{
	A a;
	public B(A a){
		this.a=a;
	}
	@Override
	public void run() {
		a.a();
	}
}
