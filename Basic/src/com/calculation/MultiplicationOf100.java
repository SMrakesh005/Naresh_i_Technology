/*
 * Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.

 */
package com.calculation;

import java.util.Scanner;

public class MultiplicationOf100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		int temp=num/100;
		if(num>0) System.out.println("Next Multiplication "+(++temp*100));
		else System.out.println("-1");
		sc.close();
	}

}
