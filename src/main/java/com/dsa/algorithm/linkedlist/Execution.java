package com.dsa.algorithm.linkedlist;

public class Execution {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		list.append(2);
		list.append(3);
		list.printDetails();
		list.printAll();
		System.out.println("");
		System.out.println("Removed value" + list.removeLast().value);
		
		list.printDetails();
		list.printAll();
		
		System.out.println("");
		
		LinkedList list1 = new LinkedList();
		list1.removeLast();
		list1.append(4);
		list1.append(5);
		list1.printDetails();
		list1.printAll();
		System.out.println("");
		System.out.println("Removed value " + list1.removeLast().value);
		System.out.println("Removed value " + list1.removeLast().value);
		System.out.println("Removed value " + list1.removeLast());
		System.out.println("Removed value " + list1.removeLast());
		list1.printDetails();
		list1.printAll();
	}

}
