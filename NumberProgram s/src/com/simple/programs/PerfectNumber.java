package com.simple.programs;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PerfectNumber {
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
	int sum=0;
	for(int i:a) {
	sum=sum+i;
	}
	if(sum==num) {
		System.out.println( num+"   is perfect number");
	}
	else {
		System.out.println(num+"  is not a perfect number");
	}
}
}
