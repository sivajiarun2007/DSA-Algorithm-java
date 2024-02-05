package com.dsa.algorithm.dll;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	private int length = 0;

	class Node {
		int value;
		Node prev;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}
	
	public DoublyLinkedList() {}

	DoublyLinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length++;
	}

	public void printAll() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public void printFirstNode() {
		System.out.println("First Node: " + head.value);
	}

	public void printLastNode() {
		System.out.println("Last Node: " + tail.value);
	}

	public int size() {
		System.out.println("Length: " + length);
		return length;
	}
	
	public void printList() {
		printFirstNode();
		printLastNode();
		size();
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
			length++;
			return;
		}
		

		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		length++;
		
	}

}
