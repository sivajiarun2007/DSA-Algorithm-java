package com.dsa.algorithm.rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConncurentCollection {

	public static void main(String[] args) {
		
		ArrayList<String> normalList = new ArrayList<>();
		normalList.add("A");
		normalList.add("B");
		normalList.add("C");
		
		Iterator<String> itr = normalList.iterator();
		
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.equalsIgnoreCase("A")) {
//				normalList.remove(value);
			}
				
		}
		System.out.println(normalList);
		
		CopyOnWriteArrayList<String> conList = new CopyOnWriteArrayList<>();
		conList.add("A");
		conList.add("B");
		conList.add("C");
		
		Iterator<String> itr1 = conList.iterator();
		
		while(itr1.hasNext()) {
			String value = itr1.next();
			if(value.equalsIgnoreCase("A")) {
				conList.remove(value);
			}
				
		}
		System.out.println(conList);
		
		
	}

}
