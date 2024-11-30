package com.programs;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int num=sc.nextInt();
		int first=0;
		System.out.println(first);
		int secound=1;
		int nextnum=0;
		for(int i=3;i<=num;i++) {
			System.out.println(secound);
			 nextnum=first+secound;
			 first=secound;
			 secound=nextnum;
		}
		
	}
	

}
