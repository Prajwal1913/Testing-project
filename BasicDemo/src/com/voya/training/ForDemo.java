package com.voya.training;

public class ForDemo {
	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			int j = 2*i;
//			System.out.println("2 * " +i+ " = " +j);
//		}
		int x =0;
		while(x<10) {
			System.out.println(x);
			x++;
		}
		do {
			System.out.println(x);
			x--;
		}while(x>=0);
	}
}
