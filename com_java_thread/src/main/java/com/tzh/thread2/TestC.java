package com.tzh.thread2;

public class TestC extends Thread
{
	ReadWrite rw;
	public TestC(ReadWrite rw) {
		this.rw = rw;
	}
	public void run() {
		rw.read1();
	}
}
