package com.java.assignment4;

import java.util.HashMap;

public class HashMapKeySearch {

	public static void main(String[] args) {

	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

	    hashmap.put(11,"Vikesh");
	    hashmap.put(22,"Velluvalappil");
	    hashmap.put(33,"Vikas");
	    hashmap.put(44,"Velluvalappil");
	    hashmap.put(55,"Anju");

	    boolean flag = hashmap.containsKey(11);
	    System.out.println("Key 22 exists in HashMap? : " + flag);
	 
	    boolean flag2 = hashmap.containsKey(22);
	    System.out.println("Key 55 exists in HashMap? : " + flag2);
	 
	    boolean flag3 = hashmap.containsKey(77);
	    System.out.println("Key 99 exists in HashMap? : " + flag3);
	 }
}