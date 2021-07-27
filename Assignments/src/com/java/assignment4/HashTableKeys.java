package com.java.assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableKeys {
	public static void main(String[] args) {

		Hashtable<String, String> ht = new Hashtable<String, String>();
	      ht.put("Fruit", "Apple");
	      ht.put("Vegetable", "Potato");
	      ht.put("Flower", "Rose");
	      Enumeration<String> e = ht.keys();	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	}

}
