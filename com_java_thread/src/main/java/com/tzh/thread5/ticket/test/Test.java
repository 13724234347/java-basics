package com.tzh.thread5.ticket.test;

public class Test extends Thread {
	private String dangqiang;
	private String xiage;
	private String value;
	public Test(String dangqiang,String xiage,String value){
		this.dangqiang=dangqiang;
		this.xiage=xiage;
		this.value=value;
	}
	@Override
	public void run() {
		try{
			while (true){
				Thread.sleep(1000);
				synchronized (dangqiang) {
					synchronized (xiage) {
						System.out.println(value);
						xiage.notify();
					}
					dangqiang.wait();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
