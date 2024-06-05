package com.nit.test1;

import java.util.Scanner;

import com.nit.pack1.Palindrome;

public class TestPalindrome{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number :");
		int num=sc.nextInt();
		
		Boolean Check = Palindrome.IsPalindrome(num);
		System.out.println(Check);
		
//		if(Check) {
//			System.out.println("Palindrome");
//		}
//		else {
//			System.out.println("Not Palindrome");
//		}

		sc.close();
	}

}
