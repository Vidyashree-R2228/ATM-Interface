package com.programs;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
			  while (num2!= 0) {
		            int remainder = num1%num2;  // Find the remainder
		            num1= num2;  // Update a to b
		            num2 = remainder;  // Update b to the remainder
		        }
			  System.out.println(num1);
		      
		}
	
		

	}


