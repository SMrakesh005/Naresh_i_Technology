package com.temperature.change;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double fah=Double.parseDouble(args[0]);
		double cel=(fah-32)*5/9;
		System.out.println("Farenheit To Celsius "+cel);
	}

}
