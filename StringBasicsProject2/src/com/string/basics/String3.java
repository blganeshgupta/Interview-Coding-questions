package com.string.basics;

import java.util.Scanner;

public class String3 {

	public static void main(String[] args) {
		
	Scanner scan =new Scanner(System.in);
	String s=scan.nextLine();
	char []a=s.toCharArray();
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]==a[j]) {
				
				System.out.println(a[j]);
			}
			
		}
		
	}


		}
}
