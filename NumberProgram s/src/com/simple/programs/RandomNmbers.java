package com.simple.programs;

import java.util.Random;

public class RandomNmbers {
public static void main(String[] args) {
	
	Random r=new Random();
	System.out.println("the random numbers are....");
	for(int i=0;i<=5;i++) {
		System.out.println(r.nextInt(20));
		
	}
}
}
