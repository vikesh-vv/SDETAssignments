package com.java.assignment1;

public class EvenNumber {
	
	public static void main(String[] args) 
	{
		int n = 10;
		System.out.print("Even Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) 
		{

		   if (i % 2 == 0)
		   {
			System.out.print(i + " ");
		   }
    	}
   }
}
