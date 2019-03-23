package com.tzh.thread3;

public class Tel2 extends Thread{
	public Test test;
	
	public Tel2(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		test.xiaofeizhe();
	}
}
