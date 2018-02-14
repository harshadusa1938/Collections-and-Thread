  package com.statwithjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CollectionTest {
	public static void main(String[] args) {
		Map<String,String> map1= new HashMap<>();
		Map<String,String> hashTable= new Hashtable<>();
		
		map1.put("hello","hi");
		map1.put("hello1","hi1");
		map1.put("hello2","hi2");
		
		hashTable.put("hello0","hi0");
		hashTable.put("hello3","hi3");
		hashTable.put("hello4","hi4");
		
		for(Map.Entry<String, String> entry:hashTable.entrySet()) {
			//hashTable.put("abc", "ABC");	
			System.out.println(entry.getValue());
		}
		
		ConcurrentHashMap<String,String> premiumPhone =  new ConcurrentHashMap<String,String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung","S5");
		
		Iterator iterator = premiumPhone.keySet().iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
		
		iterator = premiumPhone.keySet().iterator();
		
		while (iterator.hasNext())
		{
			System.out.println(premiumPhone.get(iterator.next()));
		}
	
		List<Integer> list = Arrays.asList(1,2,53,14,5);
		System.out.println(list);
		
		int num = list.stream()
		    .filter(e -> e%2==0)
		    .mapToInt(e -> e*2)
		    .sum();
		
		System.out.println(num);
		list.sort((Integer i1,Integer i2)-> i1.compareTo(i2));
		
		System.out.println(list);

	}

}

