package Programs;

/*
 * 
 * Title: Program to find gcd and lcm
 * 
 * Date: 28th June 2021
 * 
 */

import java.util.*;

class gcd_lcm {
    public static int lcm(int a, int b) {
        int temp = a*b;
        temp/=gcd(a,b);
        return temp;
    }
    
    public static int gcd(int a, int b) {
        while(true) {
            int temp=b;
            b=a%b;
            a=temp;
            if(b==0) {
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("The largest number that completely divides "+a+" and "+b+" is "+gcd(a,b));
        System.out.println("The smallest number that is the product of "+a+" and "+b+" is "+lcm(a,b));
        sc.close();   
    }
}

// This code was implemented on day 53 of 100 days of code //