package com.simple.programs;

public class FibonociiSeries {
	

public static void main(String[] args) {
	 int num1 = 0, num2 = 1; 
	int a=0 ,b=1,c;
	for(int i=0;i<=5;i++) {
		   // Print the number 
        System.out.print(a + " "); 

        // Swap 
       c = a+ b; 
        b = a; 
        a=c; 		
	}
}
}
