/*
 A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged.
  Display total selling price, profit along with vat and service charge.
  CP=32500
  SP=CP+CP*.27
  VAT=SP*.127
  SER_CHRG=SP*.0387
 */

package com.all.type.bill;
import java.util.*;
public class TvSetBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Double SP,VAT,SER_CHRG,PROFIT;
		System.out.println("COST PRICE OF TV: 32,500");
//		Double CP=sc.nextDouble();
		Double CP=Double.parseDouble(args[0]);
		SP=CP+CP*.27;
		VAT=SP*.127;
		SER_CHRG=SP*.0387;
		PROFIT=SP-CP;
		System.out.println("Total Selling Price Rs."+SP);
		System.out.println("Profit is Rs."+PROFIT);
		System.out.println("VAT Price Rs."+VAT);
		System.out.println("service charge Rs."+SER_CHRG);
		
		sc.close();

	}

}
