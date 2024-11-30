package com.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int rev=0;
	int sum=0;
	int temp=num;
	while(temp>0) {
		sum=temp%10;
		rev=rev*10+sum;
		temp/=10;
		
	}
	if(num==rev) {
		System.out.println("it is palindrome");
	}else {
		System.out.println("it is not palindrome");
	}

	}

}
