package com.string.basic;

public class String2 {

	public static void main(String[] args) {
		String input3="this is an orange juice";
	String [] arr1	=input3.split(" ");
	String input4="oranger";
	String result="not existed";
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i].equals(input4)) {
			//System.out.println("yes this program contains orange word");
			result="existed";
			break;
		}
		
	}
	System.out.println(result);

		}

}
