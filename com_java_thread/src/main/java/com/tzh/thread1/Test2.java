package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class Test2 extends Thread{
	ReadWriteLock rwl;
	public Test2(ReadWriteLock rwl){
		this.rwl=rwl;
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		super.run();
		new TestLock2().lock2(rwl);
		
	}
}
