package com.ravisir.daily.test;

//Converting bigger type to smaller type
public class test2
{
public static void main(String[] args)
	{
		short s = 127;
		byte b = (byte) s;    //Explicit OR Narrowing OR manual 	
		System.out.println(b);
	}
}
