//  Formula is :-  celsius=((fahrenheit-32)*5)/9;

package com.temperature.change;
import java.util.Scanner;
public class FarenheitToCelsiusInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cel,fah;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Temperature : ");
		fah=sc.nextFloat();
		cel=((fah-32)*5)/9;
		System.out.println("FarenheitToCelsius : "+cel);sc.close();
	}

}
