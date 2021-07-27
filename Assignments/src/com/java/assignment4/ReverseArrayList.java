package com.java.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayli = new ArrayList<Integer>();
		 
        // Appending elements at the end of the list
        arrayli.add(new Integer(11));
        arrayli.add(new Integer(1));
        arrayli.add(new Integer(56));
        arrayli.add(new Integer(123));
        arrayli.add(new Integer(345));
        System.out.print("Elements before reversing: ");
        printElements(arrayli);
 
        // Collections.reverse method takes a list as a
        // parameter and reverses the passed parameter
      //(no new array list is required)
        Collections.reverse(arrayli);
        System.out.print("\nElements after reversing: ");
        printElements(arrayli);
    }
 
    // Iterate through all the elements and print
    public static void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}
