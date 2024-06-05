package com.all.type.bill;

public class DominosBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Bill_Chicken,Bill_Veg,Total_Bill;
		int n=Integer.parseInt(args[0]);
		System.out.println("Enter chicken rolls you want: "+n);
//		Scanner sc=new Scanner(System.in);
		Bill_Chicken=n*60;
		int m=Integer.parseInt(args[1]);
		System.out.println("Enter Vegitable puffs you want: "+m);
//		Scanner veg=new Scanner(System.in);
		Bill_Veg=m*25;
		
		System.out.println("Special discount on final bill of Rs.50 ");
		Total_Bill=Bill_Veg+Bill_Chicken-50;
		System.out.println("Total bill is :Rs."+Total_Bill);

	}

}
