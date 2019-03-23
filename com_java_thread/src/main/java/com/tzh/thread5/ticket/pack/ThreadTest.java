package com.tzh.thread5.ticket.pack;

public class ThreadTest extends Thread{
	private String dangqiang;
	private String xiage;
	private String value;
	public ThreadTest(String dangqiang,String xiage,String value) {
		this.dangqiang = dangqiang;
		this.xiage = xiage;
		this.value = value;
	}
	@Override
	public void run() {
		try{
			while(true)
			{
				Thread.sleep(500);
				synchronized (dangqiang) {
					synchronized (xiage) {
						System.out.println(value);
						xiage.notify();
					}
					dangqiang.wait();
				}

				/*
				 * synchronized (a) {
					synchronized (b) {
						System.out.println(value);
						b.notify();
					}
					a.wait();
					a  == 进入等待





					synchronized (b) {
					synchronized (c) {
						System.out.println(value);
						c.notify();
					}
					b.wait();

					b == 进入等待




					synchronized (c) {
					synchronized (d) {
						System.out.println(value);
						d.notify();
					}
					c.wait();

					c == 进入等待




					synchronized (d) {
					synchronized (e) {
						System.out.println(value);
						e.notify();
					}
					d.wait();

					d== 进入等待



					synchronized (e) {
					synchronized (a) {
						System.out.println(value);
						a.notify();
					}
					e.wait();

					e == 进入等待
				}
				}
				}
				}
				}
				 * 
				 */
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
