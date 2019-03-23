package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class Test1 extends Thread{
	ReadWriteLock rwl;
	public Test1(ReadWriteLock rwl){
		this.rwl=rwl;
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		super.run();
		new TestLock1().lock1(rwl);
		
	}
}
