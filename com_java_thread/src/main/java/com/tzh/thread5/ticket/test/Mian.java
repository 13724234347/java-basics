package com.tzh.thread5.ticket.test;

public class Mian {
	public static void main(String[] args){
		String a="a";
		String b="b";
		String c="c";
		Test test = new Test(a,b,c);
		test.start();

		
	}
}
