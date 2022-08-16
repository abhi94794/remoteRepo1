package com.abhinav;

import java.util.HashMap;

public class CountStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "MyNameisAbhinav";
		
		String newLine = line.toLowerCase();
		
		char[] arr = newLine.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(char c :arr) {
			
			if(hm.containsKey(c)) {
				hm.put(c, hm.get(c)+1);
			}
			else {
				hm.put(c,1);
			}
		}
		
		System.out.println("hm:"+hm);
		

	}

}
