package com.programs;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		String  binary="";
		if(num==0) {
			binary="0";
		}else {
			while(num>0) {
				int num2=num%2;
				binary=num2+binary;
				num/=2;
			}
		
		}
		System.out.println("The binary equivalent is "+binary);
	}

}
