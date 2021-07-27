package com.java.assignment3;

public class ArithmeticExcep {

	public static void main(String[] args) {

		try {
		      int res = 500/0;
		       System.out.println("You are dividing a number by 0");
		       System.out.println(res);
		    } catch (ArithmeticException e) {
		      System.out.println("Arithmetic Exception: cannot divide by 0");
		    }
	}

}
