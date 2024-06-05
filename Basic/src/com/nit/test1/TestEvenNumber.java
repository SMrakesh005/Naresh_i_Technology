//WAP in java to print all even numbers from 1 - 100


package com.nit.test1;

import java.util.Scanner;

public class TestEvenNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number :");
		int num=sc.nextInt();
		
		CheckEvenNumber.evenNumber(num);
		
		sc.close();
	}

}
