/*
 * 
 * Title: Sum of n natural numbers by recursion
 * 
 * Date: 28th May 2021
 * 
 */

import java.util.*;

class Main {
    public static int sum(int n) {
        if (n == 1) { // Base Case
            return 1;
        }
        return n + sum(n - 1); // Generalised relation b/w problem and sub-problem
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(sum(n));
    }
}

// This code was implemented on day 21 of 100 days of code //