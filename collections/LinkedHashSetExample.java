package com.statwithjava.collections;

import java.util.LinkedHashSet;

import com.statwithjava.beans.Customer;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add(new String("Abc"));
		set.add(new String("B100"));
		set.add(new String("Xtest"));
		set.add(new String("D2"));
		
		
		System.out.println(set);
		
		//WOrking with our classes
		LinkedHashSet<Customer> set2 = new LinkedHashSet<>();
		Customer c  = new Customer(100,"Raj");
		Customer c1 = new Customer(2,"Ram");
		Customer c2 = new Customer(3,"Rohan");
		Customer c3 = new Customer(4,"Raju");
		
		set2.add(c);
		set2.add(c1);
		set2.add(c3);
		set2.add(c2);
		
		
		System.out.println("Size="+set2.size());
		System.out.println(set2);
	}

}
