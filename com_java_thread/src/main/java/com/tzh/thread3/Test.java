package com.tzh.thread3;

public class Test {

	private int telNumb=0;
	public synchronized void shengchangzhe() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(telNumb==100){
				System.out.println("仓库已满 ");
				notify();
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				telNumb++;
			}
			System.out.println("生产了第"+telNumb+"台手机");
		}
	}
	public synchronized void xiaofeizhe(){
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			if(telNumb<10){
				System.out.println("库存不足");
				notify();
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else{
				telNumb--;
			}
			System.out.println("消费者了第"+telNumb+"台手机");
		}

	}

}
