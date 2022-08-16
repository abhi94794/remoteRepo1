package com.abhinav;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortIntegers {

	public static void main(String args[]) {
		
	//	int a[]= {10,50,20,40,30};
		
		List<Integer> list = Arrays.asList(10,50,20,40,30);
		
		
		//list.stream().sorted().forEach((System.out::println));
		List<Integer> neList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(neList);
	}
}
