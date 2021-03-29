package com.string.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Angram {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s1=scan.next();
	String s2=scan.next();
	
	
	//System.out.println(s1.equalsIgnoreCase(s2));
	if(s1.length()==s2.length()) {

	char []a1=s1.toLowerCase().toCharArray();
	char []a2=s2.toLowerCase().toCharArray();
Arrays.sort(a1);
Arrays.sort(a2);
String ss1 = a1.toString();
String ss2= a2.toString();
if(s1.equalsIgnoreCase(s2)) {
	System.out.println("two Strings are Anagram ");
}
else {
	System.out.println("two Strings are not anograms ");
}
	
	}
	else {
		System.out.println("Two Strings are not angram");
	}
}
}
