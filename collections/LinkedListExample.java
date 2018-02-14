package com.statwithjava.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {
      LinkedList<String> list = new LinkedList<>();
        list.add("A1");
		list.add("A3");
		list.add("A2");
		list.add("B1");
		
		String str = "hello";
		LinkedList<Character> list2 = new LinkedList<>();
		char carr[] = str.toCharArray();
		for(char c: carr)
		{
			list2.add(c);
		}
		
		System.out.println("By Loop");
		//By for	
		for(String s:list) {
			System.out.println(s);
		}
		
		Iterator<String> itr = list.iterator();
		System.out.println("By Iterator");
		
	   // list.add("B3");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		System.out.println("After sorting");
		for(String s:list) {
			System.out.println(s);
		}
		
		ListIterator<Character> lstItr =  list2.listIterator(list2.size());
		
	/*	System.out.println("Forward Direction");
		while(lstItr.hasNext()) {
			System.out.println(lstItr.next());	
		}
		*/
		System.out.println("Backward Direction");
		while(lstItr.hasPrevious()) {
			System.out.print(lstItr.previous());	
		}
	}
}
