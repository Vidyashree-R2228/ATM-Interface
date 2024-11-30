package com.programs;

import java.util.Scanner;

public class smallest_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num==0) {
			System.out.println("the smallest digit is: 0");
		return;
		}
		int smallest=num%10;
		while(num!=0) {
			int num1=num%10;
			if (num1 < smallest) {
                smallest = num1; // Update smallest if the current digit is smaller
            }
            num /= 10; // Remove the last digit
        }

        // Output the smallest digit
        System.out.println("The smallest digit is: " + smallest);
    }
}
		
				
			

