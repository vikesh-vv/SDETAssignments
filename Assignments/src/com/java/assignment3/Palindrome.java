package com.java.assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		      String str, rev = "";
		      @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a stringto check if it is palindrome or not:");
		      str = sc.nextLine();
		 
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(str+" is a palindrome string");
		      else
		         System.out.println(str+" is not a palindrome string");
		 
		   }

	}

}
