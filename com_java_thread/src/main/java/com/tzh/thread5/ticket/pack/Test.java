package com.tzh.thread5.ticket.pack;

public class Test {
	public static void main(String[] args)throws Exception {
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d"; 
		String e = "e";
		String f = "f";
		String g = "g";
		
		ThreadTest threadTest1 = new ThreadTest(a, b, "1");
		ThreadTest threadTest2 = new ThreadTest(b, c, "2");
		ThreadTest threadTest3 = new ThreadTest(c, d, "3");
		ThreadTest threadTest4 = new ThreadTest(d, e, "4");
		ThreadTest threadTest5 = new ThreadTest(e, f, "5");
		ThreadTest threadTest6 = new ThreadTest(f, g, "6");
		ThreadTest threadTest7 = new ThreadTest(g, a, "7");
		
		threadTest1.start();
		Thread.sleep(1000);
		
		threadTest2.start();
		Thread.sleep(1000);
		
		threadTest3.start();
		Thread.sleep(1000);
		
		threadTest4.start();
		Thread.sleep(1000);
		
		threadTest5.start();
		Thread.sleep(1000);
		
		threadTest6.start();
		Thread.sleep(1000);
		
		threadTest7.start();
	}
}
