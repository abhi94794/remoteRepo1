package com.abhinav;

public class StringFollowedByString {

	public boolean endOther(String a, String b) {
		
		 return a.endsWith(b)||b.endsWith(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringFollowedByString byString = new StringFollowedByString();
		byString.endOther("abc", "pqr");

	}

}
