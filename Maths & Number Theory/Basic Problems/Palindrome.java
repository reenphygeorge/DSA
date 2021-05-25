/*
 * 
 * Title: Check whether the number is a palindrome or not
 * 
 * Date: 21th May 2021
 * 
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Taking Inputs
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // reversing n
        int temp = n;
        int n_rev = 0;
        while (temp != 0) {
            n_rev = (n_rev * 10) + (temp % 10);
            temp = temp / 10;
        }

        // checking whether n is palindrome
        if (n == n_rev)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }
}

// This code was implemented on day 15 of 100 days of code //
