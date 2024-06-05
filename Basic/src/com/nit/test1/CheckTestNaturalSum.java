package com.nit.test1;

public class CheckTestNaturalSum {

	public static void naturalNumberSum(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.print("Sum Of Natural Number b/w 1 to "+num+ " is :");
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		System.out.print(sum);

	}

}
