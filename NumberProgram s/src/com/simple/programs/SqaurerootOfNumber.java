package com.simple.programs;

import java.util.Scanner;

public class SqaurerootOfNumber {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please Enter the value");
	double val=scan.nextDouble();
	double d=Math.sqrt(val);
	System.out.println("square root of number is:"+d);
}
}
