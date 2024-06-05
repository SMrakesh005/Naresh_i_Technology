/*
 Define a method which returns the sum of digits of the given two digit number.

Write the method with the following specifications: 

	Name of method : getSumOfDigits()
    Modifiers : public, static
    return type : int
    Argument : three arguments of type integer  
This method accepts an integer value as argument and return the sum of it's digits.
Specifications: The value returned by the method getSumOfdigits() is determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, return 7
if the given value is negative, return -3
if the given value is greater than 99, return -2
if the given value is in between 0 and 9, return -1
 */
package com.nit.pack1;

public class sumOFDigits {

	public static int getSumOfDigits(int num) {
		int temp,c=0,sum=0,num1;
		num1=num;
		while(num!=0) {
			temp=num%10;
			c++;
			sum=sum+temp;
			num=num/10;
		}
		if(num1<0) {
			return -3;
		}
		else if(c==3) {
			return -2;
		}
		else if(c==1) {
			return -1;
		}
		else {
//			int temp1=num1%10;
//			num1=num1/10;
//			int sum=temp1+num1;
			return sum;
		}
		
		
	}

}
