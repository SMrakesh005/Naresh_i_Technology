/*
 -----------
  Write a program to input the basic salary of a person. He gets 15% of the basic as HRA,
  15% of the basic as Conveyance allowance and 10% of the basic as Entertainment allowance.
  The total salary is calculated by adding Basic + HRA + Conveyance + Entertainment Allowance.
  Calculate and print the total salary of person.Take the Basic Salary from Command Line Argument
  
 */
package com.all.type.bill;
import java.util.Scanner;
public class BasicSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary: ");
		Double Basic_Salary=sc.nextDouble();
		Double HRA= 0.15*Basic_Salary;
		Double Conveyance_allowance=0.15*Basic_Salary;
		Double Entertainment_allowance=0.10*Basic_Salary;
		Double Total_Salary=Basic_Salary + HRA + Conveyance_allowance + Entertainment_allowance;
		System.out.println("Total salary of person Rs."+Total_Salary);sc.close();
	}

}
