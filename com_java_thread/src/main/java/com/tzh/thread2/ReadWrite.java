package com.tzh.thread2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {
	//创建一个读写锁
	ReadWriteLock rwl = new ReentrantReadWriteLock();


	//read   write    lock  读写锁

	//读写锁，
	//读读共享       如果一个线程在读数据，其它线程也可以进来读数据
	//读写互斥       如果一个线程在读数据，其它进行写数据的线程就需要进行等待
	//写读互斥      如果一个线程在写数据，其它读数据的线程需要进行等待
	//写写互斥      如果一个线程在写数据，其它写数据的线程需要进行等待

	//开三个线程， 三个线程调用不同类里面的的方法，实现读写锁效果


	/**
	 * 读数据
	 */
	public void read() {
		rwl.readLock().lock(); //给读上锁
		try {
			System.out.println(Thread.currentThread().getName() + " 1=====");
			Thread.sleep((long) (10 * 1000));
			System.out.println(Thread.currentThread().getName() + "  2======");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			rwl.readLock().unlock();//给读解锁
		}

	}

	/**
	 * 写数据
	 *
	 * @param data
	 */
	public void write() {
		rwl.readLock().lock();
		try {
			System.out.println(Thread.currentThread().getName() + " 1-----");
			Thread.sleep((long) (10 * 1000));
			System.out.println(Thread.currentThread().getName() + "  2------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			rwl.readLock().unlock();
		}

	}


	public void read1() {
		rwl.writeLock().lock(); //给读上锁
		try {
			System.out.println(Thread.currentThread().getName() + " 1****** ");
			Thread.sleep((long) (10 * 1000));
			System.out.println(Thread.currentThread().getName() + "  2******");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			rwl.writeLock().unlock();//给读解锁
		}

	}

}