package com.simple.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class ArrayDuplicatesRemoval {
//removing duplicates of an array
	public static void main(String[] args) {
		List<Integer>arr=new ArrayList();
	Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter values of an Array");
	int n=scan.nextInt();
	for(int i=0;i<n;i++) {
		int val=scan.nextInt();
		arr.add(val);
	}
	Set <Integer>s=new HashSet();
for(int a:arr ) {
	s.add(a);
}
arr.clear();
arr.addAll(s);
System.out.println(arr);
	}

}
