package com.programs;

import java.util.Scanner;

public class senior_citizen {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num>60) {
		System.out.println( num+ " you are eligible for a senior citizen discount");
	}
	else  {
		System.out.println( num+ " you are not eligible for citizen discount");
		
	}

	}

}
