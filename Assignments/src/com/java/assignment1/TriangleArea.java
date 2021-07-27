package com.java.assignment1;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the base of the Triangle:");
       double base = scanner.nextDouble();

       System.out.println("Enter the height of the Triangle:");
       double height = scanner.nextDouble();

       double area = (base* height)/2;
       System.out.println("Area of Triangle is: " + area);      
    }
}
