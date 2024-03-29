package com.voya.training;

public class Ternary {
	public static void main(String[] args) {
		int a =100;
		int b =20;
		int c =30;
		String x = a>b&&a>c ? "a is  greater" : b>c ? "b is greater" : "c is greater";
		System.out.println(x);
	}
}
