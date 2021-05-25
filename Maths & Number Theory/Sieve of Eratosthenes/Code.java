/*
 * 
 * Title: Sieve of Eratosthenes
 * 
 * Date: 22th May 2021
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static boolean isPrime(int N) {
        boolean prime[] = new boolean[N + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i <= Math.sqrt(N); i++) {
            for (int j = i * 2; j <= N; j += i) {
                prime[j] = false;
            }
        }
        return prime[N];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        boolean result = isPrime(N);
        System.out.println(result);
    }
}

// This code was implemented on day 16 of 100 days of code //