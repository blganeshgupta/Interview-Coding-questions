package com.main.patterns;

import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n = scan.nextInt();
	
	for(int i=0;i<n;i++) {
		
		for (int j=n-i;j>1;j--) {
			System.out.print (' ');
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		for (int j=n-i;j>1;j--) {
			System.out.print ("  ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}

		System.out.println();
	}
	
}
}
