package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class TestLock2 {
	public void lock2(ReadWriteLock rwl){
		rwl.readLock().lock();
		try {
			System.out.println("aa读锁========");
			Thread.sleep(1000);
			System.out.println("bb读锁========");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rwl.readLock().unlock();
		}
	}
}