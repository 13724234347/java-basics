package com.tzh.thread2;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 *
 * @author Administrator
 *
 */

//同步方法
//同步块  －－ > 精确的控制同步范围
//同步锁     更加能实现具体的业务，提高效率

public class ReadWriteLockTest {
	public static void main(String[] args) {
		ReadWrite rw = new ReadWrite();
		TestA testa = new TestA(rw);
		TestB testb = new TestB(rw);
		TestC testc = new TestC(rw);

		testa.start();
		testb.start();
		testc.start();
	}


}