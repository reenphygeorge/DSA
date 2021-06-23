/*
 * 
 * Title: Program which returns an entered number in words
 * 
 * Date: 25th May 2021
 * 
 */

import java.util.*;

class Main
{
	public static int digits(int n) {
	    int count=0;
	    while(n!=0) {
	        count++;
	        n/=10;
	    }
	    return count;
	}
	
	public static String ones(int n) {
	    
	    String str="";
	    switch (n) {
        case 1:
            str="one ";
            break;
        case 2:
            str="two ";
            break;
        case 3:
            str="three ";
            break;
        case 4:
            str="four ";
            break;
        case 5:
            str="five ";
            break;
        case 6:
            str="six ";
            break;
        case 7:
            str="seven ";
            break;
        case 8:
            str="eight ";
            break;
        case 9:
            str="nine ";
            break;
	    }
	    return str;
	}
	
	public static String tens_one(int n) {
	    
	    String str="";
	    switch (n) {
	    case 0:
	        str="ten ";
	        break;
        case 1:
            str="eleven ";
            break;
        case 2:
            str="twelve ";
            break;
        case 3:
            str="thirteen ";
            break;
        case 4:
            str="fourteen ";
            break;
        case 5:
            str="fifteen ";
            break;
        case 6:
            str="sixteen ";
            break;
        case 7:
            str="seventeen ";
            break;
        case 8:
            str="eighteen ";
            break;
        case 9:
            str="nineteen ";
            break;
	    }
	    return str;
	}
	
	public static String tens(int n) {
	    
	    String str="";
	    switch (n) {
        case 2:
            str="twenty ";
            break;
        case 3:
            str="thirty ";
            break;
        case 4:
            str="forty ";
            break;
        case 5:
            str="fifty ";
            break;
        case 6:
            str="sixty ";
            break;
        case 7:
            str="seventy ";
            break;
        case 8:
            str="eighty ";
            break;
        case 9:
            str="ninety ";
            break;
	    }
	    return str;
	}
	
	public static String hunds(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str = ones(n);
	    str=str+"hundred ";
	    return str;
	}
	
	public static String thous(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str = ones(n);
	    str=str+"thousand ";
	    return str;
	}
	
	public static String ten_thous(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str="";
	    if(((n/10)%10)==1) {
	        str=tens_one(n%10)+"thousand ";
	    }
	    else {
	        str=tens((n/10)%10)+ones(n%10)+"thousand ";
	    }
	    return str;
	}
	
	public static String lakhs(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str = ones(n)+"lakh ";
	    return str;
	}
	
	public static String ten_lakhs(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str="";
	    if(((n/10)%10)==1) {
	        str=tens_one(n%10)+"lakh ";
	    }
	    else {
	        str=tens((n/10)%10)+ones(n%10)+"lakh ";
	    }
	    return str;
	}
	
	public static String cr(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str = ones(n)+"crore ";
	    return str;
	}
	
	public static String ten_cr(int n) {
	    if(n==0) {
	        return "";
	    }
	    String str="";
	    if(((n/10)%10)==1) {
	        str=tens_one(n%10)+"crore ";
	    }
	    else {
	        str=tens((n/10)%10)+ones(n%10)+"crore ";
	    }
	    return str;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		String no = "";
		if(n==0) {
		    System.out.println("zero");
		}
		else {
		    int len=digits(n);
		    for(int i=1;i<=len;i++) {
		        if(len>1&&((temp/10)%10)==1&&i==1) {
		            no=tens_one(temp%10);
		            i++;
		            temp/=10;
		        }
		        else if(i==1) {
		            no=ones(temp%10);
		        }
		        else if(i==2) {
		            no=tens(temp%10)+no;
		        }
		        else if(i==3) {
		            no=hunds(temp%10)+no;
		        }
		        else if(len>=5&&i==4) {
		            continue;
		        }
		        else if(i==4) {
		            no=thous(temp%10)+no;
		        }
		        else if(i==5) {
		            no=ten_thous(n/1000)+no;
		            temp/=10;
		        }
		        else if(len>=7&&i==6) {
		            continue;
		        }
		        else if(i==6) {
		            no=lakhs(temp%10)+no;
		        }
		        else if(i==7) {
		            no=ten_lakhs(n/100000)+no;
		            temp/=10;
		        }
		        else if(len>=9&&i==8) {
		            continue;
		        }
		        else if(i==8) {
		            no=cr(temp%10)+no;
		        }
		        else if(i==9) {
		            no=ten_cr(n/10000000)+no;
		            temp/=10;
		        }
		        temp/=10;
		    }
		}
		System.out.println(no);
	}
}

// This code was implemented on day 47 of 100 days of code //