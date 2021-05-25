/*

    Title: Find the two non repeating numbers in an array where all other numbers repeat twice.

    Date: 19th May 2021

*/

import java.util.ArrayList;
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

        /*
         * 
         * Now res has XOR of the 2 non repeating numbers
         * 
         * Find the right-most set bit in res
         * 
         * Group all the numbers in the array on the basis of set bit which we found
         * 
         * Now the 2 non repeating numbers are in different group
         * 
         * Find XOR of all numbers of both groups separately
         * 
         * Find XOR of res with the two values we get in the previous step, to get the 2
         * non repeating numbers separately
         * 
         */

        // Finding Right-most set bit of res
        int mask = 1;
        int c = 0;
        while (true) {
            if ((mask & res) == 0) {
                c++;
                res = (res >> 1);
            }
            if ((mask & res) == 1) {
                break;
            }
        }

        // Grouping all the numbers in the array on the basis of set bit
        // Finding XOR of all numbers of both groups separately and are stored in x1, x2
        mask = 1;
        mask = (mask << c);

        int x1 = 0;
        int x2 = 0;
        for (int no : arr) {
            if ((mask & no) != 0) {
                x1 = (x1 ^ no);
            } else {
                x2 = (x2 ^ no);
            }
        }

        // Finding XOR of res with x1 and x2
        x1 = (x1 ^ res);
        x2 = (x2 ^ res);

        System.out.println("First Number is" + x1);
        System.out.println("Second Number is" + x2);
    }
}