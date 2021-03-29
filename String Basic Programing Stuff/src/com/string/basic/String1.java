package com.string.basic;

public class String1 {
	public static void main(String []args) {
	String input1="hello worlde";
	for(int i=0;i<input1.length();i++) {
		if(input1.charAt(i)=='e') {
			System.out.println("position of 'e' is:"+i);		
			break;
		}
		else {
			System.out.println("that word not exist");
		}	
	
		
	}
	
	}
}
