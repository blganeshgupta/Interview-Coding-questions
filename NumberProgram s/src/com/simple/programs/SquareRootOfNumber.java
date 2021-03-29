package com.simple.programs;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		int a=9;
		double b=a/2;
		double temp=0;
		do {
			 temp=b;
			b=(b+(a/temp))/2;
		}while((temp-b)!=0);
System.out.println("square root of "+a+" is :"+b);
	}

}
