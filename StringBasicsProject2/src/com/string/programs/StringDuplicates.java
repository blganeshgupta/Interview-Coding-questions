package com.string.programs;

import java.nio.charset.Charset;
import java.util.TreeSet;

public class StringDuplicates {
public static void main(String[] args) {
	String s="Ganeshfdgfdg";
	 TreeSet<Character> ts=new TreeSet();

	for(int i=0;i<s.length();i++) {
		int count=0;
	for(int j=0;j<s.length();j++) {
		if(s.charAt(i)==s.charAt(j)) {
			count++;
			
		}
		
	}
	if(count>1) {
		 ts.add(s.charAt(i));
	}
	}
	System.out.println(ts);
	for(Character c:ts) {
		System.out.println(c);
	}
	}

}
