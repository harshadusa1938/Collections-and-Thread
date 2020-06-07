package com.harshad.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.harshad.beans.Customer;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> map2 = new HashMap<>();
		Map<Customer,Integer> map3 = new HashMap<>();
		map.put("E001", 100);
		map.put("E001", 200);
		map.put("E003", 100);
		map.put("E004", 100);
		map.put("E005", 100);
		
		System.out.println(map);
		
		//For iteration
		Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
		for(Map.Entry<String,Integer> entry:entrySet) {
			System.out.println("Key="+entry.getKey()+"\t"+"Value="+entry.getValue());
		}
		
		//In single line	
		System.out.println("2nd Time");
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Key="+entry.getKey()+"\t"+"Value="+entry.getValue());
		}
		
		Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator();	
		System.out.println("3rd Time");
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println("Key="+entry.getKey()+"\t"+"Value="+entry.getValue());
		}
		
		
		//To find a key in the map
		  String key = "E001";
		 if(map.containsKey(key)) {
			 System.out.println(map.get(key));
		 }
		
		 
		 //To remove a key from the map
		 map.remove(key);
		 System.out.println(map);
		 
		 //To add all elements of a map to another
		 
		 map2.putAll(map);
		 
		 System.out.println(map2);
		 
		 
		/*String s = "hello";
		char c[] = s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		  System.out.print(c[i]);*/
		 
		 
		 //To add our class as key in Hashmap we need to override hashcode and equals method in our class
		 
		Customer c  = new Customer(100,"Raj");
		Customer c1 = new Customer(100,"Ram");
		Customer c2 = new Customer(3,"Rohan");
		Customer c3 = new Customer(4,"Raju");
		
		map3.put(c, 100);
		map3.put(c1, 200);
		map3.put(c2, 200);
		map3.put(c3, 200);
		
		System.out.println("Size="+map3.size());
		
		System.out.println(map3);
		 
	}

}
