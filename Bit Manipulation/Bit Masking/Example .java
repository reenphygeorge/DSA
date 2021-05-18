/*

    Title: Seting ith bit
    
    Description: Change ith bit to 1
    
    Date: 10th May 2021

*/

import java.util.*;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		// input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = sc.nextInt();

		// initializing bit mask
		int mask = (1 << (i - 1));

		// Performing OR operation
		int result = (n | mask);

		// output
		System.out.println("The new number is " + result);
	}
}

// This code was implemented on day 4 of 100 days of code //
