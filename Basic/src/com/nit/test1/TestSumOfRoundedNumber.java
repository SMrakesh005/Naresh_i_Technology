package com.nit.test1;

import java.util.Scanner;

import com.nit.pack1.roundOFNumber;

public class TestSumOfRoundedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number");
		int num=sc.nextInt();
		System.out.print("Enter 2nd Number");
		int num1=sc.nextInt();
		System.out.print("Enter 3rd Number");
		int num2=sc.nextInt();
		
		int sumOfRoundedValues = roundOFNumber.sumOfRoundedValues(num, num1, num2);
		System.out.println(sumOfRoundedValues);
		sc.close();
	}

}
