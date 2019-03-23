package com.tzh.work;

public class Mian {
	public static void main(String[] args) {
		Test test=new Test();
		ThreadsTest thread=new ThreadsTest(test);//静态的，同步的
		ThreadsTest1 thread1=new ThreadsTest1(test);//非静态的，同步的
		ThreadsTest2 thread2=new ThreadsTest2(test);//同步块

		//thread.start();
		//thread1.start();

		thread1.start();
		thread2.start();

		//thread.start();
		//thread2.start();






		//静态的，同步的与非静态的，同步的.
		//thread.start();
		//thread1.start();

		//非静态的，同步的与同步块.
		//thread1.start();
		//thread2.start();

		//静态的，同步与同步块
		//thread.start();
		//thread2.start();

		//thread.start();
		//thread1.start();
		//thread2.start();
	}
}
