/*
 Define a method which returns the greatest number among three numbers.

Write the method with the following specifications: 

	Name of method : getGretest()
    Modifiers : public, static
    return type : int
    Argument : three arguments of type integer  

This accepts Three integer values as argument and return the greatest value.

Arguments: three arguments of type integer
Return Type: an integer value 

Specifications: The value returned by the method getGreatest() is determined by the following rules:

if any of the given numbers are negative, return -1.
if any of the given numbers are zero, return -2.
if the given numbers are positive, return the greatest.

 */
package com.nit.pack1;

public class greatestNumber {

	public static int getGretest(int num, int num1, int num2) {
		
		if(num<0 || num1<0 || num2<0)
		{
			return -1; 
		}
		else if(num==0 || num1==0 || num2==0)
		{
			return -2;
		}
		else {
			if(num>num1 && num>num2) {
				return num;
			}
			else if(num1>num && num1>num2) {
				return num1;
			}
			else {
				return num2;
			}
			
		}

	}

}
