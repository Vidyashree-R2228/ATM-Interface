package com.programs;

import java.util.Scanner;

public class natural_num_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
			
		}
		System.out.println("The sum of the natural number are "+ sum);

	}

}