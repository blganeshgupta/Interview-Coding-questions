package com.simple.programs;

public class GcdOfTwoNumbers {
public static void main(String[] args) {
	int a=36, b=18;
	while(a!=b) {
	if(a>b) {
		a=a-b;
	}
	else  {
		b=b-a;
	}
	}
	System.out.println(a);
}
}
