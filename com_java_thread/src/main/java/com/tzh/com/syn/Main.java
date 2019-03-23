package com.tzh.com.syn;

public class Main {
	public static void main(String[] args) {
		A a=new A();
		B b=new B(a);
		C c=new C(a);
		D d=new D(a);
		
		//b.start();
		//c.start();
		
		b.start();
		d.start();
		
		//c.start();
		//d.start();
	}
}
