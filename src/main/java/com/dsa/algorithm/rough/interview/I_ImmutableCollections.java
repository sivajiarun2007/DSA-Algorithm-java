package com.dsa.algorithm.rough.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class I_ImmutableCollections {

	public static void main(String[] args) {
//		Collections.unmodifiableList(null); // immutable
//		List.of(); // immutable
		
//		Collections.synchronizedCollection(null); // thread safe
//		ConcurrentHashMap<K, V>
//		CopyOnWriteArrayList<E>  use fail sade collections
		
		
//		LinkedHashSet<E> implements linked list internally a along with hashset(hashmap)
		
		List<String> strList = new ArrayList<>();
		strList.add("Arun");
		strList.add("Sia");
		strList.add("Sve");
		
		Iterator<String> itr = strList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(strList);
		itr = strList.iterator();
		
		while(itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
			if(element == "Arun") {
//				strList.remove(element); // will throw error
				itr.remove();
			}
		}
		
		System.out.println(strList);
		
	}

}
