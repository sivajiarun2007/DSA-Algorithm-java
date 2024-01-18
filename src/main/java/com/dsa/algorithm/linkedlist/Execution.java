package com.dsa.algorithm.linkedlist;

public class Execution {

	public static void main(String[] args) {
		LinkedList list = new LinkedList(1);
		list.append(2);
		list.append(3);
//		list.printDetails();
//		System.out.println("");
		System.out.println("Removed value" + list.removeLast().value);
		
		list.printDetails();
		
		System.out.println("");
		
		LinkedList list1 = new LinkedList();
		System.out.println(list1.removeLast());
		System.out.println(list1.removeFirst());
		list1.append(4);
		System.out.println(list1.removeFirst().value);
		list1.append(5);
		list1.printDetails();

		System.out.println("");
		System.out.println("Removed value " + list1.removeLast().value);
//		System.out.println("Removed value " + list1.removeLast().value);
		System.out.println("Removed value " + list1.removeLast());
//		System.out.println("Removed value " + list1.removeLast());
		list1.printDetails();
		list1.prepend(6);
		list1.printDetails();
		list1.prepend(5);
		list1.printDetails();
		list1.append(7);
		list1.printDetails();
		System.out.println(list1.removeFirst());
		list1.printDetails();

	}

}
