package com.abhinav;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElement {

	static int [] inputArray = new int[] {1,2,3,1,2,3,1,3,5,6,4};
			
	
	public static void main(String[] args)
	{   
	    Set<Integer> uniqueElements = new HashSet<>();
	         
	    Set<Integer> duplicateElements =  Arrays.stream(inputArray)
	                                            .filter(i -> !uniqueElements.add(i))
	                                            .boxed()
	                                            .collect(Collectors.toSet());
	         
	    System.out.println(duplicateElements);
	}
	
	
	
}
