package com.nit.test1;

import java.util.Scanner;

import com.nit.pack1.sumOFDigits;

public class TestSumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a NUmber:");
		int num=sc.nextInt();
		int sum_Digits = sumOFDigits.getSumOfDigits(num);
		System.out.println(sum_Digits);
		sc.close();
		
	}

}
