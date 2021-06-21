/*
 * 
 * Title: Check whether the given string is a palindrome
 * 
 * Date: 29th May 2021
 * 
 */

import java.util.*;

class Main {
    public static boolean is_Palindrome(String str, int a, int b) {
        if (a <= b) {
            return true;
        }
        if (str.charAt(a) != str.charAt(b)) {
            return false;
        }
        a++;
        b--;
        return is_Palindrome(str, a, b);
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int len = str.length();
        len--;
        System.out.println(is_Palindrome(str, 0, len));
    }
}

// This code was implemented on day 22 of 100 days of code //