package com.simple.programs;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
Scanner scan=new Scanner (System.in);
int a=scan.nextInt();
int count=0;
if(a==0||a==1) {
	System.out.println(a+" number is not a prime number");
	
}
else {
int n=a/2;
for(int i=2;i<=n;i++) {
	if(a%i==0) {
		System.out.println(a+"  is Number not a prime number");
		count++;
		break;

		
	}
	}

}
if(count==0) {
	System.out.println("prime number");
}
}
}
