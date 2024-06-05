/*
	 Write a java program which print the given three digit number is palindrome or not 
	
	Program is determined by the following rules:
	
	if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
	if 1 then print a message that the number is pallindrome
	if 0 then print a message that the number is not a pallindrome
	if the given number is negative or zero, print -1
	if -1 then print a message that the given number is -ve kindly provide the +ve number only if the given number is not an three digit number, print -2
	if -2 then print the message that this program can check the operation for the 3 number only. */

package com.calculation;

import java.util.Scanner;

public class CheckPalindomeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ENter a number: ");
		int num=sc.nextInt();
		int num2,temp,rev=0,num1;
		num1=num;num2=num;
		int count1,count=0;
		while(num1!=0) {
			count1=num1%10;
			count++;
			num1=num1/10;
		}
		if(num>0) {
			if(count==3) {
				while(num!=0) {
					temp=num%10;
					rev=rev*10+temp;
					num=num/10;
				}
				if(num2==rev) System.out.println(num2+" is a Palindrome."); 
				else System.out.println(num2+" not is a Palindrome."); 
				}
			else System.out.println(-2+ " this program can check the operation for the 3 number only. ");
		}
		else System.out.println(-1+" the given number is -ve kindly provide the +ve number only");
	  sc.close();
	}

}
