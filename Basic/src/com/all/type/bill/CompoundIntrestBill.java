/*
 * write a Java program to calculate compound interest for 3 years? 
 Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));
 */
package com.all.type.bill;

public class CompoundIntrestBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Pri=Double.parseDouble(args[0]);
		double Rate=Double.parseDouble(args[1]);
		
		double Amount = Pri*((1+Rate/100)*(1+Rate/100)*(1+Rate/100));
		double CI=Amount-Pri;
		System.out.println("Principle is "+Pri+" & Rate is "+Rate);
		System.out.println("Amount for 3 year "+Amount);
		System.out.println("compound interest for 3 year "+CI);
	}

}
