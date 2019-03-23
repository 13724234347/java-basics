package com.tzh.thread4.com.syn.thread;

public class TestOne extends Thread{
		//TestTwo test1=new TestTwo();
		public synchronized void run() {
			for(int i=0;i<5;i++){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("a======"+this.currentThread().getName()+i);
			}
		}
		public void hh(){
			System.out.println("sgjdlj");
		}
		public synchronized void a() {
			for(int i=0;i<5;i++){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("b="+i);
			}
		}
		
	
}
