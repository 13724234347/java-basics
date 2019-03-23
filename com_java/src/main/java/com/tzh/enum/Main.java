package com.Enum.project;

public class Main {
	enum Test {
		EAST("东","7:00"), UP("上","12:00"), WESTERN("西","18:00"), NORTH("另一边","00:00");

		private String direction;
		private String time;
		private Test(String direction,String time){
			this.direction=direction;
			this.time=time;
		}
		public String getDirection() {
			return direction;
		}
		public String getTime() {
			return time;
		}
	}
	public static void a(Test c) {
		switch (c) {
			case EAST:
				System.out.println("aa");
				break;
			case UP:
				System.out.println("bb");
				break;
			case WESTERN:
				System.out.println("cc");
				break;
			case NORTH:
				System.out.println("dd");
				break;
		}
	}
	public static void main(String[] args) {
		System.out.println("每天早上"+Test.EAST.getTime()+"太阳从"+Test.EAST.getDirection()+"边升起");
		System.out.println("每天中午"+Test.UP.getTime()+"太阳还在天"+Test.UP.getDirection()+"高高挂起");
		System.out.println("每天傍晚"+Test.WESTERN.getTime()+"太阳从"+Test.WESTERN.getDirection()+"边落下");
		System.out.println("每天凌晨"+Test.NORTH.getTime()+"太阳在地球"+Test.NORTH.getDirection()+"高高挂起");
		a(Test.EAST);
		a(Test.UP);
		a(Test.WESTERN);
		a(Test.NORTH);
	}
}
