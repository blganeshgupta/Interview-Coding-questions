package com.main.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfAnArry {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("please enter all values separed by comma");
		String s2=scan.nextLine();
		
		String [] s= s2.split(",");
		
		if(s==null||(s.length/2)==0) {
			System.out.println(Arrays.toString(s));
		}
		else {
			for(int i=0;i<s.length/2;i++) {
				String temp=s[i];
				s[i]=s[s.length-1-i];
				s[s.length-1-i]=temp;
			}
			System.out.println(Arrays.toString(s));
		}
	}

}
