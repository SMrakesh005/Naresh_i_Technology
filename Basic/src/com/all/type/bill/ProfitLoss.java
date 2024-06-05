package com.all.type.bill;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double SP =Double.parseDouble(args[0]);
		double CP =Double.parseDouble(args[1]);
		double Profit,Loss,Profit_Percentage,Loss_Percentage;
		Profit = SP - CP;
		Loss = CP - SP;
		Profit_Percentage = (Profit / CP) * 100;
		Loss_Percentage = (Loss / CP) * 100;
		
		System.out.println("Profit "+Profit);
		System.out.println("Profit_Percentage "+Profit_Percentage+" %");
		System.out.println("Loss "+Loss);
		System.out.println("Loss_Percentage "+Loss_Percentage+" %");
	}

}
