package com.string.programs;

import java.util.Scanner;

public class ReverseFullString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String a[]=s.split(" " );
StringBuffer s3=new StringBuffer();
for(int i=0;i<a.length;i++) {
	String s2="";
	

	
for(int j=a[i].length()-1;j>=0;j--) {
	
	s2=s2+a[i].charAt(j);
	
}
s3.append(s2+" ");

}
System.out.println(s3);
	}

}
