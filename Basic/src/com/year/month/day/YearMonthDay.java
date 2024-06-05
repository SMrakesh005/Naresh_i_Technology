/*
 * Write a program in java to input number of days. Find and display number of years, months and days.
 */
package com.year.month.day;

public class YearMonthDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days=Integer.parseInt(args[0]);
		int YEAR,MONTH;
		YEAR=days/365;
		days=days%365;
		MONTH=days/30;
		days=days%30;
		
		System.out.println("Year="+YEAR+" Months="+MONTH+" Days="+days);
		

	}

}
