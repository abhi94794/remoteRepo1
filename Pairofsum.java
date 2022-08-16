package com.abhinav;

public class Pairofsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,2,5,6,7,1,2};
		int sum=3;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("arr[i]="+arr[i]+"arr[j]="+arr[j]); 
				}
			}
		}

	}

}
