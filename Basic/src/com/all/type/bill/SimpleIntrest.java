/*
 * Write a program to enter Principal, Rate and Time. Calculate and display Simple Interest and Amount.
 */
package com.all.type.bill;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double PRINCIPAL=Double.parseDouble(args[0]);
		Double Rate=Double.parseDouble(args[1]);
		Double Time=Double.parseDouble(args[2]);
		
		Double SI=(PRINCIPAL*Rate*Time)/100;
		System.out.println("Simple Intrest : "+SI);
	}

}
