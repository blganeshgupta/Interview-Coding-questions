package com.simple.programs;

public class Palindrom {

	public static void main(String[] args) {
		
		int a=201;
	int temp=a;
	int sum=0;
	
	while(a>0) {
		int r=a%10;
		sum=sum*10+r;
		a=a/10;
		
		
	}
	if(temp==sum) {
		System.out.println(temp  +"  is a plindrome");
	}
	else {
		System.out.println(temp +" is not a palidrome");
	}
	}
}
