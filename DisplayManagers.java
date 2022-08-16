package com.abhinav;

import java.util.Arrays;

public class DisplayManagers {

	
	/*
	 * public int[] display(int[] numbers) {
	 * 
	 * for(int i=0;i<numbers.length;i++) {
	 * 
	 * 
	 * if(numbers[i]>numbers[j]) { System.out.println(numbers[i]); }
	 * 
	 * } }
	 * 
	 * 
	 * public static void main(String[]args) { DisplayManagers dis = new
	 * DisplayManagers(); int[] arr = { 10, 4, 6, 3, 5 }; dis.display(arr); } }
	 */

public static void RhsLargest(int[] arr)
{
    int temp =0;
    for (int i = arr.length - 1; i >= 0; i--)
    {
    	if (arr[i] > temp)
        {
    		temp = arr[i];
    	//	Arrays.sort(arr);
            System.out.println( arr[i]);
        }
    }
}

public static void main(String[] args)
{
    int[] arr = { 10, 4, 6, 3, 5 };
    RhsLargest(arr);
}}