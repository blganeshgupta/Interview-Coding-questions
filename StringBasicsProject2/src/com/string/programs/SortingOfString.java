package com.string.programs;

public class SortingOfString {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("ganesh");
	for(int i=0;i<s1.length()-1;i++) {
		if(s1.charAt(i)>s1.charAt(i+1)) {
			if(i+1<s1.length()) {
			s1.insert(s1.charAt(i), i+1);
			s1.insert(s1.charAt(i+1), i);
			}
		}
	}
	System.out.println(s1);
}
}
