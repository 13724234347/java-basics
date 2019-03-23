package com.tzh.thread2;

public class TestB extends Thread
{
	ReadWrite rw;
	public TestB(ReadWrite rw) {
		this.rw = rw;
	}
	public void run() {
		rw.write();
	}
}
