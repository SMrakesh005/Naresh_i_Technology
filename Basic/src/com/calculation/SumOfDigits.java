package com.calculation;
import java.util.*;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENter a number: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp,sum=0;
		for(int i=0; i<num; num/=10) {
		temp=num%10;
		sum+=temp;
//		num/=10;
		}
		System.out.println("Sum of Digits is : "+sum);sc.close();
	}

}
