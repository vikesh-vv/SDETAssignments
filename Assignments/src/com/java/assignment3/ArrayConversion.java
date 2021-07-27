package com.java.assignment3;

import java.util.Arrays;

public class ArrayConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Convert String to Char Array
		String str = "Hi Broadridge";
		char[] charArr = str.toCharArray();
		// print the char[] elements
		System.out.println("String converted to char array: " + Arrays.toString(charArr));
		
		// Convert Char[] to String
		char[] charArray = {'B','R','O','A','D','R','I','D','G','E'};
		
		String str1 = new String(charArray);
		
		System.out.println(str1);
	}

}
