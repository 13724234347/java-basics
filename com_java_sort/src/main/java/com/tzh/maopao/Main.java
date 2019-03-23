package com.tzh.maopao;

public class Main {
	public static void main(String[] args) {
		int a[] = {32 ,41 ,33 ,5 ,1 ,10 ,123 ,990 ,1231};
		for (int i = 0; i < a.length; i++) { //这是循环整个数组

			for (int j = i; j < a.length; j++) {//这里是循环需要比较的数组
				if(a[i] > a[j])// >是从小到大排序,<是从大到小
				{
					//通过一个临时变量，进行数组值位置交换
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}

		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}