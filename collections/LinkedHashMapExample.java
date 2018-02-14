package com.statwithjava.collections;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		Map<String,Integer> map2 = new LinkedHashMap<>();
		map.put("E001", 100);
		map.put("E001", 200);
		map.put("E005", 100);
		map.put("E004", 100);
		map.put("E003", 100);
		
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
		 

	}

}
