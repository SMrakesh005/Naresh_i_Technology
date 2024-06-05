/* 
 *  Write a java program to covert string to double using parseDouble() and multiply two Floating -point Numbers and display
	the result by taking input from the command line argument?
 */

package com.conversion.binary;

public class StringToDoubleUsingParseDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double str=Double.parseDouble(args[0]);
		double str1=Double.parseDouble(args[1]);
		System.out.println("String to Double " +(str*str1));

	}

}
