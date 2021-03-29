package com.simple.programs;

public class LeapYear {
public static void main(String[] args) {
	int year=2024;
	if(year<2022)
	if(year%100==00) {
		if(year%400==0) {
			System.out.println(year +"  is a leap year");
		}
		else {
			System.out.println(year+"  is not a leap year");
		}
	}
	else {
		if(year%4==0) {
			System.out.println(year+"  is leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}
	else {
		System.out.println(year+" is not a valid year");
	}

}
}
