/*
 * 
 * Title: Check if an array is sorted with recursion
 * 
 * Date: 16th June 2021
 * 
 */

import java.util.*;

public class Example6 {

    public static int fstSearch(int arr[], int n, int key, int pos) {
        if (pos == n) {
            return -1;
        }
        if (arr[pos] == key) {
            return pos;
        }
        return (fstSearch(arr, n, key, pos++));
    }

    // public static int lstSearch(int arr[], int n, int key, int pos) {

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int arr[] = new int[n];
        int pos = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(fstSearch(arr, n, key, pos));
        // System.out.println(lstSearch(arr, n, key, pos));
    }
}

// This code was implemented on day 41 of 100 days of code //