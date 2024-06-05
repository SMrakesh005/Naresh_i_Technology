/*
 * write a java program to calculate the total surface area of a cylinder? 
 Formula- 2 pi square r + 2 pi r h (take the pi as 3.14).
 */
package com.area.any.field;

public class TotalSurfaceAreaOfCylender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int R=Integer.parseInt(args[0]);
		int H=Integer.parseInt(args[1]);
		float PI=3.14f;
		double Area=(2*PI*R*R)+(2*PI*R*H);
		System.out.println("total surface area of a cylinder : "+Area);
	}

}
