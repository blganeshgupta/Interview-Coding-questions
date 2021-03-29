package com.main.patterns;

public class Pattern10 {
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<n;i++) {
		for(int j=n-i;j>1;j--) {
			System.out.print(" ");
		}
		for(int k=0;k<n;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
