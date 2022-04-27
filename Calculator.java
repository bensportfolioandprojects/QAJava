package com.wa.helloworld;

public class Calculator {
	
	public static void main(String[] args) {
	int num1 = 4;
	int num2 = 6;
	int result = num1 + num2;
	
	int num3 = 6;
	int num4 = 2;
	int result1 =	num3 * num4;
	
	int num5 = 13;
	int num6 = 9;
	int result2	= num5 - num6;
	
	double 	num7 = 7;
	double num8 = 9;
	double 	result3	= num7 % num8;
	System.out.println(result);
	System.out.println(result1);
	System.out.println(result2);
	if(num7<num8) {
		System.out.println("The division cannot be performed.");
	} else { 
		System.out.println(result3);
	}
	}
}
