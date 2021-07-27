package com.java.assignment2;

public class SumOfDigits {

		 /* Function to get sum of digits */ 
	    static int sumDigits(int no)
	    {
	        return no == 0 ? 0 : no%10 + 
	                  sumDigits(no/10) ;
	    }
	  
	    // Driver code
	    public static void main(String[] args)

		// TODO Auto-generated method stub
	    {
	    int n = 1234;
	  
	    System.out.println(sumDigits(n));
	}

}
