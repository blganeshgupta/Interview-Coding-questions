 package com.simple.programs;

public class EvenOrOddWithOutModulus {
public static void main(String[] args) {
	
	int a=545646;
	int b=a;
	while(a>0) {
		a=a-2;
		
	}
	if(a==0) {
		System.out.println(b+" is an even number");
	}
	else {
		System.out.println(b+" is an odd number");
	}
}
}
