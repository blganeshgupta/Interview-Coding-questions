package com.string.programs;

import java.util.Scanner;

public class ReverseWordAndLetters {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String a[]=s.split(" " );
		StringBuffer s3=new StringBuffer();
		for(int i=a.length-1;i>=0;i--) {
			String s2="";
			

			
		for(int j=a[i].length()-1;j>=0;j--) {
			
			s2=s2+a[i].charAt(j);
			
		}
		s3.append(s2+" ");

		}
		System.out.println(s3);
	
	
	}

}
