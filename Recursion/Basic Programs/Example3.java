/*
 * 
 * Title: Factorial of n with recursion
 * 
 * Date: 15th June 2021
 * 
 */

import java.util.*;

public class Example3 {

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int prevFact = fact(n - 1);
        return n * prevFact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fact(n));
    }
}

// This code was implemented on day 40 of 100 days of code //