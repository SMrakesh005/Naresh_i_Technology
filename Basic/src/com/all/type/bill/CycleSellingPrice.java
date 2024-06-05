/*
 *Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and added new accessories worth Rs. 500.
 * Rohan wants to make a profit of Rs. 1500 on selling the cycle. Find the selling price of the cycle.
 *  Write a java program to store all values and calculate and display the selling price.
 *  cp=1200;
 *  spend=250,  color=350,   accessories 500, wants to profit 1500
 */

package com.all.type.bill;

public class CycleSellingPrice {
	public static void main(String []args) {
		Double CP=1200.0,REPAIR=250.0,COLORING=350.0,ACCESSORIES=500.0,PR_WANTS=1500.0;
		Double Total=CP+REPAIR+COLORING+ACCESSORIES+PR_WANTS;
		System.out.println("display the selling price "+Total);
	}

}
