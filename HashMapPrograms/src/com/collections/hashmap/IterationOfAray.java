package com.collections.hashmap;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.Iterator;
import java.util.ListIterator;

public class IterationOfAray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	ArrayList<String> art=new ArrayList();
	
	while(true) {
		String s=scan.next();
		if(s.equalsIgnoreCase("exit")) {
			break;
		}
		else
		{
			art.add(s);
		}
			
	}
	
	
	
	Iterator itr=art.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("--------------------------------------------------------------------");
	ListIterator lstr=art.listIterator();
	while(lstr.hasNext()) {
		System.out.println(lstr.next());
	}
	while(lstr.hasPrevious()) {
		System.out.println(lstr.previous());
	}
	
}
}
