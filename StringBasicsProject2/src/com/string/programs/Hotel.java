package com.string.programs;
public class Hotel {
	static final String ITEMNAME="Puris";
	static int quantity;
	int item() {
		int cost=20*quantity;
		return cost;
		
	}
public static void main(String[] args) {
	
	Hotel h=new Hotel();
quantity=3;
System.out.println("If I need 4 "+ITEMNAME+" the Cost is:"+h.item());
}
 
}
