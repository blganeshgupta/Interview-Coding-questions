package com.string.programs;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	int [][]a=new int [3] [3];
Scanner scan =new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			
			a[i][j]=scan.nextInt();
		}
		System.out.println();
		
	}
	for(int i=0;i<a.length;i++ ){
		

	 for(int j=a.length-1;j>=0;j--){
			System.out.print(a[j][i]+" ");
			
		
		}
		System.out.println();
	}
	
}
}

