/*

    Title: Check if a Number is Odd or Even using Bitwise Operator

    Date: 9th May 2021

*/

import java.util.*;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		// input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Performing AND operation
		if ((n & 1) == 1) {
			System.out.println("No is odd");
		} else {
			System.out.println("No is even");
		}
	}
}

// This code was implemented on day 3 of 100 days of code //
