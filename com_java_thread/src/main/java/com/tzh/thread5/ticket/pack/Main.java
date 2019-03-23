package com.tzh.thread5.ticket.pack;

public class Main extends Thread{
	public static void main(String[] args) {
		Main main=new Main();

		Main a = new Main(main);
		a.setName("一号售票员");

		Main a1 = new Main(main);
		a1.setName("二号售票员");

		Main a2 = new Main(main);
		a2.setName("三号售票员");

		Main a3 = new Main(main);
		a3.setName("四号售票员");

		Main a4 = new Main(main);
		a4.setName("五号售票员");


		a.start();
		a1.start();
		a2.start();
		a3.start();
		a4.start();

	}
	public int ticket=999;
	private Main main;
	public Main(){

	}
	public Main(Main main){;
		this.main=main;
	}
	@Override
	public void run() {
		while(this.main.ticket>0){//while 循环 条件是ticket变量大于0
			synchronized(this.main) {//满足while循环的条件就同步
				if(this.main.ticket != -1){//如果ticket不等于-1就执行以下代码
					System.out.println(this.currentThread().getName()+"售出一张票，还剩"+(this.main.ticket--)+"张票");
				}
				try {
					Thread.sleep(1000,338);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}



}
