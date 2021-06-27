package Programs;

/*
 * 
 * Title: Program to find leap year rule in any planet
 * 
 * Date: 27th June 2021
 * 
 */

import java.util.*;

class leap_rule {
    
    public static float leap(Float rev_hrs, Float hrs) {
        return(1/(rev_hrs/hrs));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much time does your planet take to complete a revolution around your star or blackhole?");
        System.out.println("Days: ");
        int rev_days=sc.nextInt();
        System.out.println("Hours: ");
        float rev_hrs=sc.nextFloat();
        System.out.println("How many hours do you folks have in a day?");
        float hrs=sc.nextFloat();
        int lp_yr=(int)leap(rev_hrs,hrs);
        System.out.println("Your planet will have "+rev_days+" days in a year and a leap year every "+lp_yr+" years.");
    }
}

// This code was implemented on day 52 of 100 days of code //