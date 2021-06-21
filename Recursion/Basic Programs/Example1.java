/*
 * 
 * Title: Sum of n natural numbers by recursion
 * 
 * Date: 15th June 2021
 * 
 */

import java.util.*;

class Example1 {
    public static int sum(int n) {
        if (n == 0) { // Base Case
            return 0;
        }
        int prevSum = sum(n - 1);
        return n + prevSum; // Generalised relation b/w problem and sub-problem
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sum(n));
    }
}

// This code was implemented on day 40 of 100 days of code //