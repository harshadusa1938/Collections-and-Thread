package com.statwithjava.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("A1");
		vector.add("A3");
		vector.add("A2");
		
		vector.addElement("B1");
		//By for	
		for(String s:vector) {
			System.out.println(s);
		}
		//Enumeration
		System.out.println("By Enumeration");
		Enumeration<String> e = vector.elements();
		vector.add("B2");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Iterator<String> itr = vector.iterator();
		System.out.println("By Iterator");
		
	   // vector.add("B3");
	    
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(vector);
		System.out.println("After sorting");
		for(String s:vector) {
			System.out.println(s);
		}
	}
}

