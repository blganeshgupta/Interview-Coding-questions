package com.string.programs;

public class Car {
	

	public Car(int weels , int doors) {
		System.out.println("No of weels is:"+weels+" no of doors:"+doors);
	}
	public Car(String company, int cost,String fuelType) {
		this(4,4);
		System.out.println("Companty Name:"+company+" cost of car"+cost+"fuelType:"+fuelType);
	}
	public Car(double milage, double volume ) {
		this("Maruthi",500000,"Petrol");
		System.out.println("Milage of car is:"+milage +" Volume of the Engine is:"+volume);
	}
	public static void main(String[] args) {
		Car c=new Car(21.2,1.2);
	}

}
