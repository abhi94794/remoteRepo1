package com.abhinav;

public class ReverseJavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arr ="My name is Abhinav".split(" ");
		
		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.print(arr[i]+ " ");
		}
		
	}

}
