package com.abhinav;

import java.util.HashSet;

public class HashMapCodeInterview {

	public static void main(String[] args) {
		
		HashSet< Object> hash = new HashSet<Object>();
		hash.add(new String("abc"));
		hash.add(new String("abc"));
		
		System.out.println(hash.size());
	}

}
