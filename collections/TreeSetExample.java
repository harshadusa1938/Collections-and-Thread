package com.statwithjava.collections;

import java.util.Set;
import java.util.TreeSet;

import com.statwithjava.beans.Customer;
import com.statwithjava.beans.IdComparatorDesc;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add(new String("Abc"));
		set.add(new String("B100"));
		set.add(new String("Xtest"));
		set.add(new String("D2"));
		
		
		System.out.println(set);
		
		//WOrking with our classes
		Set<Customer> set2 = new TreeSet<>(new IdComparatorDesc());
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
