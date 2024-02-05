package com.dsa.algorithm.dll;

public class ExecutionDLL {

	public static void main(String[] args) {
		
//		testInstance();
//		testAppend();
	}
	
	static void testAppend() {
		DoublyLinkedList ll2 = new DoublyLinkedList(0);
		ll2.append(1);
		ll2.printList();
		
		DoublyLinkedList ll3 = new DoublyLinkedList();
		ll3.append(2);
		ll3.printList();
		ll3.append(3);
		ll3.printList();
	}
	
	static void testInstance() {
		DoublyLinkedList ll1 = new DoublyLinkedList(0);
		ll1.printAll();
		System.out.println();
		ll1.printFirstNode();
		ll1.printLastNode();
		ll1.size();
	}
	
	

}
