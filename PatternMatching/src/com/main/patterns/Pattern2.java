package com.main.patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				System.out.print('-');
				System.out.print(' ');
			}
			for(int k=n/2;k<n;k++) {
				System.out.print('*');
				System.out.print(' ');
			}
			System.out.println();
		}

	}

}
