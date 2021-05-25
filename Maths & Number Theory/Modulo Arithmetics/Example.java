/*
 * 
 * Title: Power of a number in O(log(b)) by Modulo M
 * 
 * Date: 25th May 2021
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static long fastPow(long a, long b, long m) {

        long res = 1;
        while (b > 0) {
            // checking whether b is even or odd
            if ((b & 1) != 0) {
                res = ((res % m) * (a % m)) % m;
            }
            a = ((a % m) * (a % m)) % m;
            b = (b >> 1); // b=b/2
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long m = sc.nextLong();
        sc.close();
        long result = fastPow(a, b, m);
        System.out.println(result);
    }
}

// This code was implemented on day 19 of 100 days of code //
