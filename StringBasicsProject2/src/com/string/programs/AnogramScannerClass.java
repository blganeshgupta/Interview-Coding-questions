package com.string.programs;

import java.util.Arrays;
import java.util.Scanner;

public class AnogramScannerClass {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enetr two words");
	String s1=scan.next();
	String s2=scan.next();
	if(s1.length()==s2.length()) {
		System.out.println(s1.length());
		System.out.println(s2.length());
		char [] a1=s1.toLowerCase().toCharArray();
		char [] a2=s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(a1.equals(a2)) {
			System.out.println("two Strings are Anagram ");
		}
		else {
			System.out.println("two Strings are  not Anagram ");
		}
			

		
	}
	else {
		System.out.println("not an anogram");
	}
}
}
