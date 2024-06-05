package com.nit.test1;

import java.util.Scanner;

import com.nit.pack1.MultiplicationTable;

public class TestMultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Table Number You Want :");
		int num=sc.nextInt();
		MultiplicationTable.multiplicationTable(num);
		sc.close();

	}

}
