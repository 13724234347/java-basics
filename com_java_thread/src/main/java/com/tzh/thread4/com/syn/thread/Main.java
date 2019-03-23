package com.tzh.thread4.com.syn.thread;

import com.tzh.thread4.com.syn.thread.TestOne;

public class Main {
	public static void main(String[] args) {
		TestOne test=new TestOne();
		Thread th=new Thread(test,"tom");
		Thread th1=new Thread(test,"猪");
		Thread th2=new Thread(test,"dog");
		th.start();
		th1.start();
		th2.start();
		test.hh();
	}
}
