package com.abhinav;

import java.util.Arrays;

/*Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class LeetcodePractice1 {

	public static void main(String[] args) {
		
		int num[]= {2,7,11,15};
		int target = 9;
		int answer[]=new int[2];
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]+num[j]==target) {
					answer[0]=i;
					answer[1]=j;
					
				}
			}
		}
		System.out.println("answer is:"+Arrays.toString(answer));
		
		
		
	}

}
