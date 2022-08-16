package com.abhinav;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Tricky1 {

	public static void main(String args[]) {
		
		HashMap< Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "abc");
		hm.put(2, "xyz");
		
		Set set = new HashSet();
		set.add(hm.keySet());
		set.add("3");
		System.out.println("return"+set);
		set.add(2);
		//set.add(e)
	}
}
