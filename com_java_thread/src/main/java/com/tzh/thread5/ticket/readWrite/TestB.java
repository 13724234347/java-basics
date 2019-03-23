package com.tzh.thread5.ticket.readWrite;

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
