package com.main.patterns;

public class Pattern19 {
public static void main(String[] args) {
	int n=10;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<=n;j++) {
			if(j+i==n/2||j-i==n/2||j+i==3*n/2||i-j==n/2) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}