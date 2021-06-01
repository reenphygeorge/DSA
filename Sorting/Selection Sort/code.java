/*
 * 
 * Title: Selection Sort
 * 
 * Date: 1st June 2021
 * 
 */

import java.util.*;

public class code {

    public static int[] sSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Inputing the Array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Sorting
        arr = code.sSort(arr, n);

        // Printing the Array
        System.out.println("New Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// This code was implemented on day 26 of 100 days of code //