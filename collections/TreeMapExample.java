package com.statwithjava.collections;

import java.util.Map;
import java.util.TreeMap;

import com.statwithjava.beans.Customer;
import com.statwithjava.beans.IdComparatorDesc;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<String,Integer> treeMap= new TreeMap<>();
		treeMap.put("A001", 100);
		treeMap.put("B001", 200);
		treeMap.put("A002", 300);
		
		System.out.println(treeMap);
		
		//Example with our own class
		
		Map<Customer,Integer> map3 = new TreeMap<>(new IdComparatorDesc());
		Customer c  = new Customer(100,"Raj");
		Customer c1 = new Customer(100,"Ram");
		Customer c2 = new Customer(3,"Rohan");
		Customer c3 = new Customer(4,"Raju");
		
		map3.put(c, 100);
		map3.put(c1, 200);
		map3.put(c2, 200);
		map3.put(c3, 200);
		
		//to find key 
		 if(map3.containsKey(c1)) {
			 System.out.println(map3.get(c1));
		 }
		
		System.out.println(map3);
	}

}

