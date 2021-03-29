package com.string.basic;

import java.util.Scanner;
public class StringCoutinting {
public static void main(String[] args) {
	System.out.println("enter string");
	Scanner scan =new Scanner(System.in);
	String ip=scan.nextLine();
	int vowelscount=0;
	int numcount=0;
	int spaces=0;
	int con=0;
	int others=0;
	String ip6 = ip.toLowerCase();
	for(int i=0;i<ip6.length();i++) {
		if(ip6.charAt(i)=='a'||ip6.charAt(i)=='e'||ip6.charAt(i)=='i'||ip6.charAt(i)=='o'||ip6.charAt(i)=='u') {
			vowelscount++;
		}

		
		else if (ip6.charAt(i)>=48&& ip6.charAt(i)<=57) {
			numcount++;
		}
		else if(ip6.charAt(i)==' ') {
			 spaces++;
		}
		else if(ip6.charAt(i)>=97 && ip6.charAt(i)<=122 ) {
			con++;
		}
		else {
			others++;
		}
			}
	System.out.println(vowelscount+"vowels count");
	System.out.println(con+"consonent");
	System.out.println(numcount+"numbercount");
	System.out.println(spaces+"spces count");
	System.out.println(others+"specials charactors");
}

}
