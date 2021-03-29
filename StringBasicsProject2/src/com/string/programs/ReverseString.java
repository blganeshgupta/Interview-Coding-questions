package com.string.programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		String s=scan.next();
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		System.out.println(s2);
		if(s2.equalsIgnoreCase(s)) {
			System.out.println("given word is given same value when reverse");
		}
		else {
			System.out.println("not phebonoic series");
		}
	}
}
 