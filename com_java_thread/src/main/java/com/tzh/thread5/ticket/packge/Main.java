package com.tzh.thread5.ticket.packge;

public class Main extends  Thread{
	private int index=1;
	private Main main;
	public static void main(String[] args){
		Main main=new Main();
		Main a=new Main(main);
		a.setName("a售票窗口");

		Main b=new Main(main);
		b.setName("b售票窗口");

		Main c=new Main(main);
		c.setName("c售票窗口");

		Main d=new Main(main);
		d.setName("d售票窗口");

		a.start();
		b.start();
		c.start();
		d.start();

	}
	public Main(){

	}
	public Main(Main main){
		this.main=main;
	}
	@Override
	public void run() {
		while(this.main .index>0){
			synchronized(this.main){
				if(this.main.index !=1000){
					System.out.println(this.currentThread().getName()+"售出了第"+(this.main.index++)+"张票");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
