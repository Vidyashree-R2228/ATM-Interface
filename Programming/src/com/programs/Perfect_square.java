package com.programs;

import java.util.Scanner;

public class Perfect_square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if (isPerfect_square(num)) {
			System.out.println("it is perfect_square");
		}else {
			System.out.println("it is not perfect square");
		}
		
	}	
		public static boolean isPerfect_square(int num) {
			if(num<0) 
				return false;
			int i=0;
			while(i*i<=num) {
				if(i*i==num) {
					return true;
				}
				i++;
		
		}
			return false;

	}

}
