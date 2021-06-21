/*
 * 
 * Title: remove repeating characters from a string with recursion
 * 
 * Date: 21th June 2021
 * 
 */

import java.util.*;

class Example3 {
    
	public static String removeDup(String str) {
	    if(str.length()==1) {
	        return str;
	    }
	    
	    char ch = str.charAt(0);
	    String ans=removeDup(str.substring(1));
	    
	    if(ch==ans.charAt(0)) {
	        return ans;
	    }
	    return (ch+ans);
	}
	public static void main (String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(removeDup(str));
	
	}
	
}

// This code was implemented on day 46 of 100 days of code //