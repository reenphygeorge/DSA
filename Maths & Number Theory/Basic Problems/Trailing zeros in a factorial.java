/*
 * 
 * Title: Find the no of trailing zeros in factorial of a number
 * 
 * Date: 21th May 2021
 * 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Taking Inputs
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // calculating the no of trailing zeros ( To get 0 in the right side of a
        // number, the number should be multiplied by 10. So we need to find how many 10
        // occurs in the range. For that we would count the no: of 5 in the range)
        int count = 0;
        for (double i = 5; i < n; i = i * 5) {
            count += (n / i);
        }

        // Output
        System.out.println("No: of trailing zeros = " + count);
    }
}

// This code was implemented on day 15 of 100 days of code //
