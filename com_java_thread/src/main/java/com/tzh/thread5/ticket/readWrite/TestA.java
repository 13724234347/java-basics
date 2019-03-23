package com.tzh.thread5.ticket.readWrite;

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