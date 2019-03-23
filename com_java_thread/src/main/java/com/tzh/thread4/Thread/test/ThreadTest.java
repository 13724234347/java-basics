package com.tzh.thread4.Thread.test;

public class ThreadTest extends Thread{
	private int numb=10;
	@Override
	public void run(){
		while( numb < 11 && 0 < numb){
			numb--;
			System.out.println("=========第"+numb+"个线程共享,叫"+this.currentThread().getName());
		}
	}
}
