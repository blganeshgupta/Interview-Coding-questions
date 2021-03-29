package com.string.basics;

public class Strings1 {

	public static void main(String args[]) {
		
		String s1="rame is a good boy";
		String s2="rame is a good boy";
		String s3=new String ("rame is a good boy");
		String s4=new String ("rame is a good boy");
		if(s1==s2) {
			System.out.println("reference variables are compared");
		}
		else {
			System.out.println("reference variables are not compared");
		}
		
		if(s4==s3) {
			System.out.println("reference variables are compared");
	
		}
		else {
			System.out.println("reference variables are not compared");

		}
		
	}
	
}
