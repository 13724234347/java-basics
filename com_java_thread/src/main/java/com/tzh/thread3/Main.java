package com.tzh.thread3;

import com.tzh.thread3.Tel;
import com.tzh.thread3.Tel2;


public class Main {
	public static void main(String[] args) {
		//1.一个生产者    手机   thread.sleep 1秒钟生产一台       wait
		//2.一个消费者    手机   thread.sleep 5秒钟消费一台       wait

		//3. 对于生产者来说，库存量达到100台，就不进行生产。。。。。对于消费者消费时， 如果发现库存小于10台，又进行生产
		Test t=new Test();

		Tel tel=new Tel(t);
		tel.start();

		Tel2 tel2=new Tel2(t);
		tel2.start();

	}
}
