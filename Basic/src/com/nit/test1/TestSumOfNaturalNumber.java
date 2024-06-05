package com.nit.test1;

import java.util.Scanner;

public class TestSumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num=sc.nextInt();
		
		CheckTestNaturalSum.naturalNumberSum(num);
		
		sc.close();

	}

}
