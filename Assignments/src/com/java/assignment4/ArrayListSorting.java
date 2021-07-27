package com.java.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {

		 ArrayList<String> listofcountries = new ArrayList<String>();
		   listofcountries.add("India");
		   listofcountries.add("US");
		   listofcountries.add("Singapore");
		   listofcountries.add("Russia");

		   System.out.println("Before Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}

		   Collections.sort(listofcountries);

		   System.out.println("After Sorting:");
		   for(String counter: listofcountries){
				System.out.println(counter);
			}
	}

}
