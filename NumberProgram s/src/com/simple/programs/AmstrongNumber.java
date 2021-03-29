package com.simple.programs;

public class AmstrongNumber {
public static void main(String[] args) {
	int a=153;//means 1*1*1+5*5*5+3*3*3=153 it is an amstrong number other numbers are..0, 1, 153, 370, 371
	int temp=a;
	int sum=0;
	while(a>0) {
		int r=a%10;
		sum=sum+r*r*r;
		a=a/10;
		
		
	}
	if(sum==temp) {
		System.out.println(temp+" is amstrong Number");
	}
	else {
		System.out.println(temp+" is not a amstrong number");
	}
}
}
