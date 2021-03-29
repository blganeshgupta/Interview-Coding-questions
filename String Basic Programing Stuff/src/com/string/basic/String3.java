package com.string.basic;

public class String3 {
public static void main(String[] args) {
	String input4="hello, world";
	for (int i = 0; i < input4.length(); i++) {
		if(input4.charAt(i)=='o') {
			System.out.println("position is:"+i);
			break;
		}
		
	}
	for (int j =input4.length()-1; j>=0; j--) {
		if(input4.charAt(j)=='o') {
			System.out.println("position is:"+j);
			break;
		}

		
}
	for (int j =input4.length()-1; j>=0; j--) {
		if(input4.charAt(j)==',') {
			System.out.println("position is:"+j);
			break;
		}
	
}
}
}