/*
 * 
 * Title: Reverse a string with recursion
 * 
 * Date: 20th June 2021
 * 
 */

import java.util.*;

class Example1 {
	
	public static void reverse(String s) {
	    if(s.length()==0) {
	        return;
	    }
	    String str = s.substring(1);
	    reverse(str);
	    System.out.print(s.charAt(0));
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		reverse(str);
	}
}

// This code was implemented on day 45 of 100 days of code //