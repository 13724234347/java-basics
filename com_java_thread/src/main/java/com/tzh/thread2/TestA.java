package com.tzh.thread2;

public class TestA extends Thread
{
	ReadWrite rw;
	public TestA(ReadWrite rw) {
		this.rw = rw;
	}
	public void run() {
		rw.read();
	}
}