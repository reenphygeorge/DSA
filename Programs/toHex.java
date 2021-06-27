package Programs;

/*
 * 
 * Title: Decimal -> Hexa & Binary -> Hexa
 * 
 * Date: 25th June 2021
 * 
 */

import java.util.*;

class toHex {
    
    public static int pwr(int a, int b) {
        int result=1;
        for(int i=0;i<b;i++) {
            result*=a;
        }
        return result;
    }

    public static String tohex(int n) {
        Stack<Integer>stk = new Stack<>();  
        char[] hexa = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String result = "";
        while(n!=0) {
            stk.push(n%16);
            n/=16;
        }
        while(stk.isEmpty()!=true) {
             result=result+hexa[stk.pop()];
        }
        return result;
    }

    public static String binary_tohex(long n) {
        int dec=0,i=0;
        while(n!=0) {
            dec+=(n%10)*pwr(2,i);
            i++;
            n/=10;
        }
        String result = tohex(dec);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Select the operation to be done:\n1. Decimal to Hexadecimal\n2. Binary to Hexadecimal\nEnter your choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
            System.out.println("Enter the decimal no: ");
            n=sc.nextInt();
            System.out.println("Hexadecimal equivalent: "+tohex(n));
            break;
            case 2:
            System.out.println("Enter the binary no: ");
            long no=sc.nextLong();
            System.out.println("Hexadecimal equivalent: "+binary_tohex(no));
            break;
            default:
            System.out.println("Wrong Choice!\nTry Again");    
        }
    }
}

// This code was implemented on day 50 of 100 days of code //