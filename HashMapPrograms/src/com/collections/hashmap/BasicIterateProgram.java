package com.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;
import java.util.Map.Entry;

public class BasicIterateProgram {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);

		HashMap<String, String>hp=new HashMap();
		int n=scan.nextInt();
	
		for(int i=0;i<n;i++) {
			System.out.println("Enter key:"+i);

						String key=scan.next();
			System.out.println("Enter value"+i);
						
			String value=scan.next();
			hp.put(key, value);
			
		}
		System.out.println(hp);
		Iterator<String> itr=hp.keySet().iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			String value=hp.get(key);
			System.out.println("key and Values are"+key+":"+value);
		}
		for(Entry<String, String> a:hp.entrySet()) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}
				
	}
}
