package com.tzh.work;

public class ThreadsTest extends Thread {
	Test test;
	
	public ThreadsTest(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		test.test();
	}
}
