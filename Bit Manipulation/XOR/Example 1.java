/*

    Title: Find the only none repeating number in an array where all other numbers repeat twice.

    Date: 19th May 2021

*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Inputs
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Using XOR to find the output
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = (res ^ arr[i]);
        }

        // Printing the output
        System.out.println(res);
    }
}

// This code was implemented on day 13 of 100 days of code //
