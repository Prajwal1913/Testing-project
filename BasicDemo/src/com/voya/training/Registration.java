package com.voya.training;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String[] usernames= {"prajwal","nikil","dada","danish"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to register : ");
		String uname= sc.next();
		boolean existname = false;
		for(String username : usernames) {
			if(uname.equals(username)) {
				System.out.println("Name is already registered");
				existname = true;
				break;
			}
		}
		if(!existname){
			System.out.println("you are registered");
		}
	}
}
