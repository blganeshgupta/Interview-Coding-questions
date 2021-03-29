package com.inhertance.value1;

abstract class Demo{
	private int a=20;
public Demo() {
		
		System.out.println("this constructor excecuted by the c hild class");
	}
	abstract   void ramana(); 
	
}
class Child extends Demo{
	Child(){
		System.out.println();
	}

	@Override
	 protected void ramana() {
		// TODO Auto-generated method stub
		
	}
	
}

public class TestClass1 {

	public static void main(String[] args) {
		Child ch=new Child();
		
		
	}

}
