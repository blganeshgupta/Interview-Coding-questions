package com.string.basics;

import java.util.Scanner;

public class String6 {
private static String s3;

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	String s2="";

	for(int i=0;i<s.length();i++) {
char   test=s.charAt(i);
 String main=String.valueOf(test);
if(s2.contains(main)) {
	s3=s3+s.charAt(i);
}
else {
	s2=s2+s.charAt(i);
}

	

	
	}
	System.out.println(s2);
	}
}
