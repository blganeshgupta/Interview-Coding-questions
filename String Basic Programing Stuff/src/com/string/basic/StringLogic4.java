package com.string.basic;

import java.util.Scanner;

public class StringLogic4 {
 
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	String a[]=new String[3];
	String main1="";
	String main2="";
	String main3="";
	for(int i=0;i<a.length;i++) {
		a[i]=scan.next();
		
	}
for(int i=0;i<a.length;i++) {
	if(i==0) {
	for(int j=0;j<a[i].length();j++) {
		if(a[i].charAt(j)=='a'||a[i].charAt(j)=='e'||a[i].charAt(j)=='i'||a[i].charAt(j)=='o'||a[i].charAt(j)=='u'||a[i].charAt(j)=='A'||a[i].charAt(j)=='E'||a[i].charAt(j)=='I'||a[i].charAt(j)=='O'||a[i].charAt(j)=='U') {
		main1=a[i].replace(a[i].charAt(j), '*');
		break;
		}
		
	}
	}
	if(main1.length()==0) {
		if(i==0)
		main1=a[i];
	}
	if(i-1==0) {
		for(int j=0;j<a[i].length();j++) {
			if(a[i].charAt(j)!='a'||a[i].charAt(j)!='e'||a[i].charAt(j)!='i'||a[i].charAt(j)!='o'||a[i].charAt(j)!='u'||a[i].charAt(j)=='u'||a[i].charAt(j)=='A'||a[i].charAt(j)=='E'||a[i].charAt(j)=='I'||a[i].charAt(j)=='O'||a[i].charAt(j)=='U') {
			int val=a[i].charAt(i);
			if(val>=65 && val<=90||val>=97&&val<=122) {
				main2=a[i].replace(a[i].charAt(j), '@');
				break;
			}
			break;
				}
		
}
	}
	
	
	if(main2.length()==0) {
		if(i-1==0)
		main2=a[i];
	}
}
System.out.println(main1);
System.out.println(main2);
System.out.println(a[2]);

	}

}
	
