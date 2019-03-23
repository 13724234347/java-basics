package com.tzh.com.syn;

public class C  extends Thread{
	A a;
	public C(A a){
		this.a=a;
	}
	@Override
	public void run() {
		a.b();
	}
}
