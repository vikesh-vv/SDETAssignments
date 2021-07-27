package com.java.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayReverse {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add("UFT");
	    arrayList.add("C++");
	    arrayList.add("DATA STRUCTURE");
	    arrayList.add("SELENIUM");
	    arrayList.add("C");
	    System.out.println("Before Reverse Order: " + arrayList);
	    Collections.reverse(arrayList);
	    System.out.println("After Reverse Order: " + arrayList);
	}

}
