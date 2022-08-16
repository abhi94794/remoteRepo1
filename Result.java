package com.abhinav;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
public static void main(String[]args)
{   
	
        Locale locale = new Locale("en", "India");
        System.out.println(locale.getDisplayName());
        NumberFormat us = NumberFormat.getCurrencyInstance(locale.US);
        System.out.println(us);
}
}

    