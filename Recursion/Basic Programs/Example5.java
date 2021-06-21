/*
 * 
 * Title: Check if an array is sorted with recursion
 * 
 * Date: 16th June 2021
 * 
 */

import java.util.*;

public class Example5 {

    public static boolean sorted(int[] arr, int n) {
        if (n == 1) {
            return true;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return sorted(arr, n - 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(sorted(arr, n));
    }
}

// This code was implemented on day 41 of 100 days of code //