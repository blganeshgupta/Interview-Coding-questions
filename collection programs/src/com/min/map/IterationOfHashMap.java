package com.min.map;

import java.util.HashMap;
import java.util.Iterator;

public class IterationOfHashMap {

	public static void main(String[] args) {
		 HashMap<String, String> hashmap = new HashMap<String, String>();
		    hashmap.put("Key1", "Value1");
		    hashmap.put("Key2", "Value2");
		    System.out.println("Iterating or looping map using foreach loop");
		    for(String val:hashmap.keySet()) {
		    	System.out.println(val+"="+hashmap.get(val));
		    }
		    System.out.println("-------------------------------------------iterator method-------------------------------------------------------------");
		    Iterator<String>itr=hashmap.keySet().iterator();
		    while(itr.hasNext()) {
		    	String key=itr.next();
		    	System.out.println(key+"="+hashmap.get(key));
		    }
	}

}
