package com.tzh.thread5.ticket.packge;

public class Test extends Thread{
	private int chepiaoNumb=1;
	private Test test;
	public static void main(String[] args) {
		Test test=new Test();

		Test a=new Test(test);
		a.setName("a售票窗口");

		Test b=new Test(test);
		b.setName("b售票窗口");

		Test c=new Test(test);
		c.setName("c售票窗口");

		Test d=new Test(test);
		d.setName("d售票窗口");

		Test e=new Test(test);
		e.setName("e售票窗口");


		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
	public Test(){

	}
	public Test(Test test){
		this.test=test;
	}
	@Override
	public void run() {
		while(this.test.chepiaoNumb>0){
			synchronized (this.test) {
				if(this.test.chepiaoNumb !=2000){
					System.out.println(this.currentThread().getName()+"售出了第"+(this.test.chepiaoNumb++)+"张票");
					try {
						Thread.sleep(000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
