package com.tzh.work;

public class ThreadsTest2 extends Thread {
	Test test;
	
	public ThreadsTest2(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		test.test2();
	}
}
