/*
	 write Java Program Convert Fahrenheit To Celsius | Vice Versa
	 Formula-
	 Celsius=(Fahrenheit-32)*5/9;
	 Fahrenheit=((9*Celsius)/5)+32;
	 Note [ Write two seprate program for converting celsius into 
	 Fahrenheit
	 and Fahrenheit into celsius ]
 */
package com.temperature.change;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Cel=Double.parseDouble(args[0]);
		double Fah=((9*Cel)/5)+32;
		System.out.println("Celsius To Farenheit "+Fah);
	}

}
