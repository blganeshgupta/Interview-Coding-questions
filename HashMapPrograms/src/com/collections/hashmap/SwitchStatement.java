package com.collections.hashmap;

public class SwitchStatement {

	public static void main(String[] args) {
		int  n=10;
		for(int i=1;i<10;i++) {
			if(i==2) {
				continue;
			}
			switch(i) {
			case 1:
			   
			    break;
			  case (2*2):
			    System.out.println("Tuesday");
			   break;
			  case (3*2):
			    System.out.println("Wednesday");
			    break;
			  case (2+5):
				    System.out.println("Tuesday");
				   break;
				  case (7-2):
				    System.out.println("Wednesday");
				    break;
			   
			  
			
			}
			if(i==2) {
				break;
			}
		}
		System.out.print("done");
	}

}
