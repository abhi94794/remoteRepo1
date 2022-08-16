package com.abhinav;

import java.util.HashSet;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a ="abhi";
		String b = new String("abhi");
		String c = new  String("abhi");
		HashSet h = new HashSet<String>();
		h.add("abhi");
		h.add(b);
		h.add(a);
		
		h.size();
		
		System.out.println("size:"+h.size());
		

	}

}
