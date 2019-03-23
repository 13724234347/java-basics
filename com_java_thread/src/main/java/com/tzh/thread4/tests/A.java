package com.tzh.thread4.tests;

public class A extends Thread{
	private Integer min;
	private Integer max;
	private Integer sum = 0;
	
	public Integer getSum(){
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	public A(){
		
	}
	public A(Integer min,Integer max){
		this.min = min;
		this.max = max;
	}
	@Override
	public void run() {
		for (int i = min; i < max; i++) {
			sum = sum +i;
		}
	}
	
}
