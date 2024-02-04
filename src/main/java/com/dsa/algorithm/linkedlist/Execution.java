package com.dsa.algorithm.linkedlist;

public class Execution {

	public static void main(String[] args) {
		LinkedList testReversBetweenLL = new LinkedList(1);
		testReversBetweenLL.append(2);
		testReversBetweenLL.append(3);
		testReversBetweenLL.append(4);
		testReversBetweenLL.append(5);
		testReversBetweenLL.printAll();
		testReversBetweenLL.reverseBetween(0, 2);
		testReversBetweenLL.printAll();
	}

	private static void testLinkedList() {

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
		
		LinkedList list3 = new LinkedList();
		System.out.println(list3.getNode(0));
		
		list3.append(9);
		list3.prepend(8);
		System.out.println(list3.getNode(0).value);
		System.out.println(list3.getNode(1).value);
		System.out.println(list3.getNode(2));
		System.out.println(list3.getNode(-1));
		
		LinkedList list4 = new LinkedList();
		System.out.println(list4.setNodeValue(0, 10));
		list4.printDetails();
		list4.append(10);
		list4.append(11);
		list4.printDetails();
		System.out.println(list4.setNodeValue(1, 12));
		list4.printDetails();
		System.out.println(list4.setNodeValue(2, 12));
		
		

//		testLinkedList();
		LinkedList list5 = new LinkedList();
		System.out.println(list5.insertNodeV2(0, 1));
		list5.append(1);
		list5.append(3);
		System.out.println(list5.insertNodeV2(0, 2));
		list5.printDetails();
//		list5.append(2);
//		System.out.println(list5.insertNodeV2(3, 3));
//		System.out.println(list5.insertNodeV2(2, 3));
//		list5.printDetails();
	

		LinkedList reverseCheck = new LinkedList();
		reverseCheck.reverse();
		reverseCheck.printDetails();
		reverseCheck.append(1);
		reverseCheck.append(2);
		reverseCheck.append(3);
		reverseCheck.append(4);
		reverseCheck.append(5);
		reverseCheck.printDetails();
		reverseCheck.reverse();
		reverseCheck.printDetails();
	
		

	
	}

}
