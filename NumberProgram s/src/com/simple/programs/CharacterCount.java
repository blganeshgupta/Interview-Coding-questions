package com.simple.programs;

import java.util.Map.Entry;
import java.util.TreeMap;

public class CharacterCount {

	public static void main(String[] args) {
		String s="ganeshhh";
		TreeMap<Character, Integer>val=new TreeMap();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				
			}
			val.put(s.charAt(i), count);
		}

		
		System.out.println(val);
		for(Entry<Character, Integer> e:val.entrySet()) {
			System.out.println(e);
		}
	}

}
