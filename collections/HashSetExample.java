package com.statwithjava.collections;

import java.util.HashSet;
import java.util.Iterator;

import com.statwithjava.beans.Customer;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add(new String("Abc"));
		set.add(new String("B100"));
		set.add(new String("Xtest"));
		set.add(new String("D2"));
		
		
		System.out.println(set);
		
		//WOrking with our classes
		
		HashSet<Customer> set2 = new HashSet<>();
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
		
		
		Iterator<Customer> itr = set2.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
