/*

    Title: Swap two numbers with Bitwise Operator (or without a 3rd variable)

    Date: 9th May 2021

*/

import java.util.*;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		// input
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		// Performing XOR operation
		a = (a ^ b);
		b = (a ^ b);
		a = (a ^ b);

		// output
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}

// This code was implemented on day 3 of 100 days of code //
