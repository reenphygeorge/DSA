/*
 * 
 * Title: Euclid GCD using recursion
 * 
 * Date: 24th May 2021
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int result = gcd(a, b);
        System.out.println(result);
    }
}

// This code was implemented on day 18 of 100 days of code //