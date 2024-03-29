package com.voya.training;

import java.util.Scanner;

public class ScanDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NAME : ");
		String a = sc.nextLine();
		System.out.println("Enter the ID : ");
		int b = sc.nextInt();
		System.out.println("Enter the CITY : ");
		sc.nextLine();
		String c = sc.nextLine();
		System.out.println("Enter the AGE : ");
		int d = sc.nextInt();
		System.out.println(" Name is " +a+ "\n ID is " +b+ "\n City is " +c+ "\n Age is " +d);
		
	}
}
