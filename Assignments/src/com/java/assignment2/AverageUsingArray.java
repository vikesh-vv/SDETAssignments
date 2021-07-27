package com.java.assignment2;

import java.util.Scanner;

public class AverageUsingArray {

	public static void main(String[] args) {
		
			 int[] arr = new int[5];      
		    
		        int sum =0;
		        double avg;
		        
		        Scanner reader = new Scanner(System.in);
		        System.out.println("Enter the elements of the array");
		        
		        for(int i=0;i<5;i++)
		        {
		            arr[i] = reader.nextInt();
		        }
		        
		        reader.close();

		          for(int i=0;i<arr.length;i++)
		          {
		              sum = sum + arr[i]; 
		         
		          }
		         avg=sum/arr.length;
		     
		        System.out.println("Sum is " +sum);
		        System.out.println("Avg is"+ avg);

		}

	}
