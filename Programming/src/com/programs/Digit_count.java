package com.programs;

import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int count=0;
		int num=sc.nextInt();
		do {
            count++; // Increment counter variable
            num = num / 10; // Remove the last digit
        } while (num > 0); // Continue until number becomes 0
		
		System.out.println("the counter number is "+count);

	}

}
