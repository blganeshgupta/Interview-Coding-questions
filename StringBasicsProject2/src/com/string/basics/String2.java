package com.string.basics;

public class String2 {
public static void main(String[] args) {
	String s1 ="ramaaa";
	String s5="ramaA";
	String s2="Seetha";
	String s3=s1+s2;
	String s4=s1+s2;
String s7="akshitha";
	if(s3.equals(s4)) {
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s1.compareToIgnoreCase(s5));
		System.out.println("String values are Equal");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
		/*
		 * else { System.out.println("String values are not equal"); } if(s2.equals(s5))
		 * { System.out.println(s1.equals(s5)); System.out.println(s3.compareTo(s4));
		 * System.out.println("String values are Equal");
		 * System.out.println(s3.hashCode()); System.out.println(s4.hashCode()); } else
		 * { System.out.println("String values are not equal");
		 * System.out.println(s2.compareToIgnoreCase(s7));
		 * System.out.println(s2.compareTo(s7));
		 * 
		 * }
		 */
}

}
