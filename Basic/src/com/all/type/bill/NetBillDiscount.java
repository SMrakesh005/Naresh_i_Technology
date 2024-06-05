/*
 * A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees	    Discount %
	<5000						5
	>=5000 and <10000			10
	>=10000						15

Display Discount %, Discount Amount and Amount Payable
 */

package com.all.type.bill;

public class NetBillDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Bill=Integer.parseInt(args[0]);
		Double Display_Discount,Discount_Amount,Amount_Payable;
		if(Bill<5000) {
			Display_Discount=Bill*.05;
			Discount_Amount=Bill-Display_Discount;
			Amount_Payable=Discount_Amount-Display_Discount;
			System.out.println("Display Discount % "+5);
			System.out.println("Display Amount "+Display_Discount);
			System.out.println("Amount Payable "+Discount_Amount);
		}
		else if(Bill>=5000 && Bill<10000) {
			Display_Discount=Bill*.10;
			Discount_Amount=Bill-Display_Discount;
			Amount_Payable=Discount_Amount-Display_Discount;
			System.out.println("Display Discount % "+10);
			System.out.println("Display Amount "+Display_Discount);
			System.out.println("Amount Payable "+Discount_Amount);

		}
		else {
			Display_Discount=Bill*.10;
			Discount_Amount=Bill-Display_Discount;
			Amount_Payable=Discount_Amount-Display_Discount;
			System.out.println("Display Discount % "+15);
			System.out.println("Display Amount "+Display_Discount);
			System.out.println("Amount Payable "+Discount_Amount);

		}
	}

}
