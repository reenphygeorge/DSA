/*
 * 
 * Title: Replace pi with 3.14 with recursion
 * 
 * Date: 20th June 2021
 * 
 */


import java.util.*;

class Example2 {
    
	public static void replacePi(String s) {
	    if(s.length()==0){
	        return;
	    }
	    if(s.charAt(0)=='p' && s.charAt(1)=='i') {
	        System.out.print("3.14");
	        replacePi(s.substring(2));
	    }
	    else {
	        System.out.print(s.substring(0,1));
	        replacePi(s.substring(1));
	    }
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		replacePi(str);
	}
}

// This code was implemented on day 45 of 100 days of code //