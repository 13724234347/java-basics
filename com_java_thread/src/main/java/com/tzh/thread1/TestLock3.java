package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class TestLock3 {
	public void lock3(ReadWriteLock rwl){
		rwl.readLock().lock();
		try {
			System.out.println("aaa读锁========");
			Thread.sleep(1000);
			System.out.println("bbb读锁========");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rwl.readLock().unlock();
		}


	}
}