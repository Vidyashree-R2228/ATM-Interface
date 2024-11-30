package com.programs;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(temp>0) {
			int num2=temp%10;
			rev=rev*10+num2;
			temp/=10;
			
		}
		System.out.println(rev);

	}

}
