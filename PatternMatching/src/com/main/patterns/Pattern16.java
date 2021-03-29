package com.main.patterns;

public class Pattern16 {
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<n/2;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for(int j=n/2-i;j>0;j--) {
			
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=0;i<n/2;i++) {
		
		for(int j=n/2-i;j>0;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
