package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class Test3 extends Thread{
	ReadWriteLock rwl;
	public Test3(ReadWriteLock rwl){
		this.rwl=rwl;
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		super.run();
		new TestLock3().lock3(rwl);
		
	}
}
