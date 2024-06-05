/*
 
Define a method which returns the sum of three rounded numbers. If the right most digit of the number is less than 5, 
then round off it's value to the previous multiple of
 10 otherwise if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 

Write the method with the following specifications: 

Name of method : sumOfRoundedValues()
     Modifiers : public, static
   return type : int
      Argument : three arguments of type integer  

This method accepts three integer values as argument and return the sum of three rounded numbers.
Example
if a = 23, b = 34, c = 66
   20 + 30 + 70 = 120
if a = 23, b = 37, c = 55
   20 + 40 + 60 = 120
Arguments: three argument of type integer
Return Type: an integer value 

Specifications: The value returned by the method sumOfRoundedValues() is determined by the following rules:

if any of the given number is negative or zero, return -1.
if any of the given numbers right most digit is of the number is less than 5, then round off it's value to the previous multiple of 10 otherwise 
if the right most digit of the number is greater or equal to 5, then round off to the next multiple of 10. 
 */
package com.nit.pack1;

public class roundOFNumber {

	public static int sumOfRoundedValues(int a, int b, int c) {
		int a1=a%10; int b1=b%10; int c1=c%10;
		int a2=a/10; int b2=b/10; int c2=c/10;
		
		if(a<0 || b<0 || c<0) {
			return -1;
		}
		if(a1<5) {
			a=(a2)*10;
		}
		if(a1>=5){
			a=(++a2)*10;
		}
		if(b1<5) {
			b=(b2)*10;
		}
		if(b1>=5){
			b=(++b2)*10;
		}
		if(c1<5) {
			c=(c2)*10;
		}
		if(c1>=5){
			c=(++c2)*10;
		}
		return (a+b+c);
		
	}

}
