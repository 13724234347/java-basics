package com.tzh.thread3;

public class Tel extends Thread {
	public Test test;
	
	public Tel(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		test.shengchangzhe();
	}
}
