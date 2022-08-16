package com.abhinav;

import java.util.HashMap;

public class CountRepeatedwordsinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String para = "My name is abhinav ghotekar and ghotekar abhinav is reverse";
		
		String []str = para.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
				
		for(String string : str) {
			
			if(hm.containsKey(string)) {
				hm.put(string, hm.get(string)+1);
				
			}
			else {
				hm.put(string, 1);
			}
			
		}
		
		System.out.println("hm:"+hm);
	}

}
