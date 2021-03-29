package com.string.programs;

import java.util.TreeSet;

public class Anagram2 {
public static void main(String[] args) {
	String s1="mail";
	String s2="liaa";
	String s3="";
	String s4="";
	if(s1.length()==s2.length()) {
		TreeSet <Character>ts1=new TreeSet();
		TreeSet <Character>ts2=new TreeSet();

for(int i=0;i<s1.length();i++){
	ts1.add(s1.charAt(i));
	ts2.add(s2.charAt(i));
}
for(char c:ts1) {
	s3=s3+c;
}
for(char c:ts2) {
	s4=s4+c;
}
if(s3.equalsIgnoreCase(s4)) {
System.out.println("given two Strings anagrams");
}
else {
	System.out.println("given two Strings are not anograms");
}


	}
	else {
		System.out.println("given two strings are not equal");
	}
		
}
}
