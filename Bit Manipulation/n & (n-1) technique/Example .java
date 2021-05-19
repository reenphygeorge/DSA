/*

    Title: No of bits to be changed to convert a to b

    Description: To count the no of bits to be changed in a given number 'a' 
                 so that 'a' is converted to 'b'

    Date: 10th May 2021

*/

import java.util.*;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		// input a and b
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		/*
		 * a^b gives a binary number with 1 at all the positions where bits has to be
		 * changed.
		 */
		int n = (a ^ b);

		int c = 0;

		// n & (n-1) technique
		while (n != 0) {
			n = (n & (n - 1));
			c++;
		}

		// output
		System.out.println(c);
	}
}

// This code was implemented on day 4 of 100 days of code //
