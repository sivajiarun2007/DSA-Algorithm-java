package com.dsa.algorithm.rough;

import com.dsa.algorithm.hashtable.HashTable;

public class RoughMain {

	public static void main(String[] args) {
		String s1 = "Arun";
		String s2 = "Sve";
		String s3 = "Sia";
		
//		System.out.println(hash(s1));
//		System.out.println(hash(s2));
//		System.out.println(hash(s3));
		
		System.out.println(HashTable.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

	}

	public static int hash(String value) {
		char[] valChar = value.toCharArray();
		int hash = 0;
		for(int i=0; i<valChar.length; i++) {
			hash = (hash + valChar[i] * 23) % 7 ;
		}
		return hash;
	}
}
