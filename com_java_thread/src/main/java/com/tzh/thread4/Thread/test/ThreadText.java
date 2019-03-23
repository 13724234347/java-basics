package com.tzh.thread4.Thread.test;

public class ThreadText {
	public static void main(String[] args) {
		ThreadTest test=new ThreadTest();

		Thread th=new Thread(test,"tom");
		Thread th1=new Thread(test,"猪");
		Thread th2=new Thread(test,"dog");
		th.start();
		th1.start();
		th2.start();
	}
}
