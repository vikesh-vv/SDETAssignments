package com.java.assignment1;

public class NaturalNumberSum {

	public static void main(String[] args) {
		
		int num = 20, count = 1, total = 0;

        while(count <= num)
        {
            total = total + count;
            count++;
        }

        System.out.println("Sum of first 20 natural numbers is: "+total);

	}

}
