package com.tzh.thread1;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
	public static void main(String[] args) {
		ReadWriteLock rwl=new ReentrantReadWriteLock();
		//new Test1(rwl).start();
		new Test2(rwl).start();
		new Test3(rwl).start();
	}
}
