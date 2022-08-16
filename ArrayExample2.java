package com.abhinav;

import java.util.Scanner;

public class ArrayExample2 {

	public static int[] takeInput(){
		
		System.out.println("Enter size of an array");
		
		Scanner sc = new Scanner(System.in);
		int size =sc.nextInt();
		int arr[]	= new int[size];
		
		//take input from user
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
	}
		return arr ;
		
		
	}
	
	public static void print(int arr[]) {
		int size =arr.length;
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = takeInput();
		print(arr);
		int largest = findLargest(arr);
		System.out.println(largest);
		}

	private static int findLargest(int[] arr) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {}
			max =arr[i];
		}
		return max;
	}
		
		/*for(int i=0;i<size;i++)
		System.out.println(arr[i] + " ");*/
		
		/*
		 * int arr[] =new int[10]; arr[2] = 10; System.out.println(arr[1]);
		 * System.out.println(arr[2]);
		 * 
		 * double arr2[] = new double[10];
		 * 
		 * System.out.println(arr2[0]);
		 */
		
		
	

	}


