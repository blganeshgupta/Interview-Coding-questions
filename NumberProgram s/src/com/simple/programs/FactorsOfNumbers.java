package com.simple.programs;

import java.util.ArrayList;
import java.util.Scanner;

public class FactorsOfNumbers {
public static void main(String[] args) {
	System.out.println("Enter Number");
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int half=num/2;
	ArrayList <Integer>a = new ArrayList();
	for(int i=1;i<=half;i++) {
		if(num%i==0) {
			a.add(i);
		}
	}
	a.add(num);
	System.out.println("factors of "+num+" is"+a);
}
}
