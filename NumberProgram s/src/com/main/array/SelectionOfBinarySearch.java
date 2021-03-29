package com.main.array;

import java.util.Scanner;

public class SelectionOfBinarySearch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter the size of any array");
	int size=scan.nextInt();
	int []element=new int [size];
	System.out.println("please enter elements ");
	for(int i=0;i<size;i++) {
	element[i]=scan.nextInt();
	}
	System.out.println("please enter value in sorted order");
	int value=scan.nextInt();
	int index=-1;
		for(int i=0;i<element.length;i++) {
		if(element[i]==value) {
			index=i;
			break;
		}
				}
	if(index>=0) {
		System.out.println("index of :"+value+"is :"+index);
	}
	else {
		System.out.println("your entered value is not here");
	}


}
				

}
