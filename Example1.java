package com.abhinav;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;



public class Example1 {
	
	public static void main(String args[]) {
		
	//	System.out.println(10+2+"A");
	String a = String.format("%0"+ (6 - "12345678".length() )+"d%s",0 ,"12345678"); 
		
		System.out.println(a);
		
		String strDouble = String.format("%.2f", 1.23456);
	//	System.out.println(strDouble);
		
		if(!("BC8000000109").matches("[a-zA-Z0-9]") || "BC8000000109".length()!=12 ) {
			//System.out.println("true");
		}
		
		/*
		 * String s1="adA12", s2="jh@l";
		 * System.out.println(!s1.matches("[a-zA-Z0-9]+"));
		 * System.out.println(s2.matches("[a-zA-Z0-9]+"));
		 */
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddmmyy");
		LocalDate date3 = LocalDate.of(2016, 10, 14).plusDays(1);
		//System.out.println("Adding one day to the given date: "+date3);
		
		//LocalDate date4 = LocalDate.parse("02102021", dateTimeFormatter).plusDays(21);
		
		
		
	}

}
