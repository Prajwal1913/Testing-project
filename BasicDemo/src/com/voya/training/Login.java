package com.voya.training;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] usernames= {"prajwal","nikil","dada","danish"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to login : ");
		String uname= sc.next();
		boolean isPresent = false;
		for(String username : usernames) {
			if(uname.equals(username)) {
				System.out.println("Invalid username");
				isPresent = true;
				break;
			}
		}
		if(!isPresent){
			System.out.println("you are logged in successfully");
		}
	}
}
