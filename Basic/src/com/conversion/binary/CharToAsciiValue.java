/*
 * Write a java program to find the ASCII value of a character
	For Example
	Output sholud be in below formart
	The ASCII value of a is :97
 */

package com.conversion.binary;
import java.util.*;
public class CharToAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 char ch=sc.next().charAt(0);
		 
//		 int s=Integer.parseInt(args[0]).charAt(0);
		
		 System.out.println("The ASCII value of "+ch+" is : "+(int)ch);sc.close();
	}

}
