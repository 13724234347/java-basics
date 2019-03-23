package com.tzh.work;

public class ThreadsTest1 extends Thread {
	Test test;
	
	public ThreadsTest1(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		test.test1();
	}
}
