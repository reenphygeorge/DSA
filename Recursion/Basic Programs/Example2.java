/*
 * 
 * Title: a raised to b by recursion
 * 
 * Date: 15th June 2021
 * 
 */

import java.util.*;

class Example2 {
    public static int pow(int a, int b) {
        if (b == 0) { // Base Case
            return 1;
        }
        int prevPow = pow(a, b - 1);
        return a * prevPow; // Generalised relation b/w problem and sub-problem
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(pow(a, b));
    }
}

// This code was implemented on day 40 of 100 days of code //