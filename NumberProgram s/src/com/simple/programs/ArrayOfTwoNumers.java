package com.simple.programs;

import java.awt.List;
import java.util.ArrayList;

public class ArrayOfTwoNumers {

	public static void main(String[] args) {
	ArrayList<Integer>arr1=new ArrayList();
	arr1.add(44);
	arr1.add(56);
	arr1.add(76);
	arr1.add(86);
		ArrayList<Integer>arr2=new ArrayList();
		arr2.add(26);
		arr2.add(66);
		arr2.add(39);
		arr2.add(69);
		arr2.add(44);
		arr1.retainAll(arr2);
		System.out.println("common elements in two arralists are:"+arr1);
		
	}

}
