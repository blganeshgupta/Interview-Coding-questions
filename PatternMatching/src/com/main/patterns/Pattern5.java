package com.main.patterns;

public class Pattern5 {
public static void main(String[] args) {
	int n=10;
	 for (int i=0; i<n; i++)
     {

         // inner loop to handle number spaces
         // values changing acc. to requirement
         for (int j=n-i; j>0; j--)
         {
             // printing spaces
             System.out.print(" ");
         }

         //  inner loop to handle number of columns
         //  values changing acc. to outer loop
         for (int j=0; j<i; j++ )
         {
             // printing stars
             System.out.print("* ");
         }

         // ending line after each row
         System.out.println();
     }
 }
  
 
}
