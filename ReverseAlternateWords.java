package com.abhinav;
//My name is Abhinav o/p Abhinav si name yM
public class ReverseAlternateWords {
	
	public void reverseAlternateWord(String paragraph) {
		
		String[] line=paragraph.split(" ");
		String reverseWord ="";
		String ans="";
		
		for(int i=line.length-1;i>=0;i--) {
		//	System.out.println(line[0]);
		//	System.out.print(" "+line[i]);//Abhinav is name My
			
			if(i%2!=0) {
				String word = line[i];
				
				for(int j=word.length()-1;j>=0;j--) {
					 reverseWord = reverseWord + word.charAt(j);
				}
				ans= ans+reverseWord+" ";
				
			//System.out.print(" "+reverseWord);
				reverseWord="";
			}
			else
						
				  ans = ans + line[i] +" ";
			System.out.print("a"+ans);
	
		}
//		/System.out.println(ans+" ");//vanihbA is eman My 
	}
	
public static void  main(String args[]) {
	
	ReverseAlternateWords alternateWords = new ReverseAlternateWords();
	alternateWords.reverseAlternateWord("My name is Abhinav");
}
}
