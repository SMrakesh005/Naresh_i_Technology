package com.nit.test1;

import java.util.Scanner;

import com.nit.pack1.greatestNumber;

public class TestCheckGreatestNumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a 1st number: ");
		int num=sc.nextInt();
		System.out.print("Enter a 2nd number: ");
		int num1=sc.nextInt();
		System.out.print("Enter a 3rdnumber: ");
		int num2=sc.nextInt();
		
		int gretest = greatestNumber.getGretest(num, num1, num2);
		System.out.println(gretest);
		sc.close();
	
	}

}
