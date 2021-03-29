package com.string.basics;

import java.util.Scanner;

public class String4 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String s=scan.nextLine();
		String []a=s.split(" ");
		String result=null;
		
		for(int i=0;i<a.length;i++) {
	 
			char s1=a[i].charAt(a[i].length()-1);
	result=	a[i].replace(a[i].charAt(0), s1);
	System.out.print(result+" ");
		}
	}

}
