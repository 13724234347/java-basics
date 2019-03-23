package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;

public class TestLock1 {

	public void lock1(ReadWriteLock rwl){
		rwl.writeLock().lock();
		try {
			System.out.println("a写锁========");
			Thread.sleep(1000);
			System.out.println("b写锁========");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			rwl.writeLock().unlock();
		}


	}
}
