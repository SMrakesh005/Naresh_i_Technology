/*
 Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1

 */
package com.calculation;

import java.util.Scanner;

public class SumOfDigitsTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		if(n>=10 && n<=99) {
			System.out.println("Sum of its digits "+((n%10)+n/10));
		}
		else if(n<0) System.out.println("-3");
		else if(n>99) System.out.println("-2");
		else System.out.println("-1");sc.close();
	}

}
