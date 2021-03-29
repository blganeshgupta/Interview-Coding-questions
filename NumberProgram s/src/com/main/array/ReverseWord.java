package com.main.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	System.out.println("please enter the values separed by ,");
	String s=scan.nextLine();
	List lr=Arrays.asList(s.split(","));
	Collections.reverse(lr);
	System.out.println(lr);
}
}
