/*
 * 
 * Title: Insertion Sort
 * 
 * Date: 31th May 2021
 * 
 */

import java.util.*;

public class code {

    public static int[] iSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
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
        arr = code.iSort(arr, n); // Creating an object of the class

        // Printing the Array
        System.out.println("New Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// This code was implemented on day 25 of 100 days of code //