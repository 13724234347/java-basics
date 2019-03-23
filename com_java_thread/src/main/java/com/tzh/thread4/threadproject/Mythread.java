package com.tzh.thread4.threadproject;

public class Mythread extends Thread{
	private String name;
	public Mythread(String name){
		this.name=name;
	}
	public void run(){
		try {
			Thread.sleep(1000);
			System.out.println("我的第一个线程程序=========="+name);

		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000*10);
			for(int i=0;i<5;i++){
				Thread.sleep(1000*10);
				System.out.println("for循环====="+i);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
