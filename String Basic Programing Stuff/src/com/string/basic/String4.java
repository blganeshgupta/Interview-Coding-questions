package com.string.basic;
import java.util.Scanner;
public class String4 {
	public static void main(String[] args) {
		System.out.println("enter your full name");
	
	Scanner scan =new Scanner(System.in);
	String fullname=scan.nextLine();
	 String mainname ="";
	String [] name=fullname.split(" ");
	for(int i=0;i<name.length;i++) {
		
		if(i<name.length-1) {
			String hlp1=name[i];
		
		String upperCase = hlp1.toUpperCase();		
mainname=mainname+upperCase.charAt(0);
		mainname=mainname+".";

		}
		else if(i<name.length) {
			String str1 = name[i].substring(0,1);
			mainname=mainname+str1.toUpperCase();
			mainname=mainname+name[i].substring(1);		}
	
		System.out.println();
	}
	System.out.println(mainname);
	}

}
