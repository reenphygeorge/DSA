/*
 * 
 * Title: Binary Search
 * 
 * Date: 10th June 2021
 * 
 */

import java.util.*;

class code {

    public static int bSearch(int arr[], int n, int x) {
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Inputing the Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();

        // Searching
        int loc = bSearch(arr, n, x);

        // Printing the location of the element
        System.out.println("Location of " + x + ": " + loc);
    }
}

// This code was implemented on day 34 of 100 days of code //