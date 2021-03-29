package com.spring.bsic2;

class Demo5{
int a=1;
int b=2;
	public Demo5(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	
}
class Child5 extends Demo5{
	int c=40;
	int d=50;
	public Child5(int c, int d) {
		super(5,6);
		this.c=c;
		this.d=d;
		System.out.println(c);
		System.out.println(d);
	}
	
}
class Child6 {
	String b;
public Child6(int a) {
	this("sita");
}	
public Child6(String b) {
	//this(10);
	this.b=b;
	System.out.println(b);
}
public Child6() {
	this(10);
}
} 
abstract class  Animal{
	abstract void eat();
}
class Lion extends Animal{

	@Override
	void eat() {
		System.out.println("I eats flush of other small animals");
		
	}
	
	void rular() {
		System.out.println("I am controlling the animals inside the forest");
	}
}
class Road{
 Road r;
 void bike() {
	 r=new Road();
 }
}
public class Dempp2 {
public static void main(String[] args) {
	Child5 c5=new Child5(3,4);
	Child6 c6=new Child6();
  Animal a6=new Lion();
  a6.eat();
  ((Lion) a6).rular();
  Road r2= new Road();
  r2.bike();
  System.out.println(r2.r);
	}
}
