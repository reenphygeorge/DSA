/*
 * 
 * Title: nth Fibonacci number with recursion
 * 
 * Date: 16th June 2021
 * 
 */

import java.util.*;

public class Example4 {

    public static int f(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(f(n));
    }
}

// This code was implemented on day 41 of 100 days of code //