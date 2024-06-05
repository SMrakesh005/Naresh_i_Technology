package com.nit.test1;

public class CheckEvenNumber {

	public static void evenNumber(int num) {
		// TODO Auto-generated method stub
		
		System.out.print("Even number b/w 2 to "+num+ " is :");
//		for(int i=2; i<=num; i+=2) {
//			System.out.print(i+" ");
//		}
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
