package com.programs;

import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num +" it is positive number");
		}else if(num<0) {
			System.out.println(num +" it is negative number");
		}else {
			System.out.println(num +" it is zero");
		}

	}

}
