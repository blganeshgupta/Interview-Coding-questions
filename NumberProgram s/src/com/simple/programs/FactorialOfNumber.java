package com.simple.programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
int n=scan.nextInt();
int fac=1;
if(n==0) {
	System.out.println("Factorial of numbers is :"+1);
}
else {
	for(int i=1;i<=n;i++) {
		fac=fac*i;
	}
	System.out.println(fac);
}

	
	}

}
