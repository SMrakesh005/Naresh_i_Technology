/*
 Define a method which returns true if the given three digit number is palindrome otherwise return false.

  Write the method with the following specifications: 

  Name of method : isPalindrome()
  Modifiers : public, static
  return type : boolean
  Argument : one argument of type integer

This method accepts an integer value as argument and 
return true if the given number is palindrome, else retrun false.
 */
package com.nit.pack1;

//BLC

public class Palindrome {

	public static boolean IsPalindrome(int num) {
		// TODO Auto-generated method stub
		
		int rev=0,num1;
		num1=num;
		while(num!=0) 
		{
			int temp=num%10;
			rev=rev*10+temp;
			num=num/10;
		}
		if(num1==rev) {
			return true;
		}
		else {
			return false;
		}

	}

}
