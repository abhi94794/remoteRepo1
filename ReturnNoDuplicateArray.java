package com.abhinav;

import java.util.HashSet;

public class ReturnNoDuplicateArray {
	
	public static int[] noDuplicate(int [] data) {
		
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<data.length;i++) {
			set.add(i);
		}
		System.out.println(set);
		return data;
	}
	public static void main(String[]args) {
		int data[] = {1,2,5,6,7,4,2,4,5,6};
		
		noDuplicate(data);
	}

}
