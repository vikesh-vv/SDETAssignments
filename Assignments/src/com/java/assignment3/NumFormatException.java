package com.java.assignment3;

public class NumFormatException {
	  private static final String inputString = "10.12";  

	public static void main(String[] args) {

		try {  
            int a = Integer.parseInt(inputString);
            System.out.println(a);
			}
		catch(NumberFormatException  ex)
		{  
       System.err.println("Invalid string in argumment");  
		}  

	}

}
