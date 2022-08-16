package com.abhinav;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abh");
		al.add("Abhi");
		al.add("Abhinav");
		al.add("Vicky");
		al.add("Ram");
		al.add("wish");
		al.add("RAMA");
		al.add("SUmo");
	//fetch out the name whose length is greater than 3 using STream api
		
	List l2=al.stream().filter(x->x.length()<4).collect(Collectors.toList());
	
	System.out.println(l2);
		
		
		
	

	}

}
