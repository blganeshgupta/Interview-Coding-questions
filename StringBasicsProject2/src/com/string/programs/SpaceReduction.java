package com.string.programs;

import java.util.Scanner;

public class SpaceReduction {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please Enter the String.....");
	String s=scan.nextLine();
	String s2="";
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			s2=s2+s.charAt(i);
		}
		else if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
			s2=s2+s.charAt(i);
		}
	}
	System.out.println(s2);
}
}
