package com.dsa.algorithm.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int length = 0;

	public LinkedList() {

	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length++;
	}

	public void printDetails() {
		System.out.println("First Node: " + getHeadNode().value);
		System.out.println("last Node: " + getTailNode().value);
		System.out.println("Length: " + getSize());
	}

	public void printAll() {
		Node start = head;
		while (start != null) {
			System.out.print(" " + start.value );
			start = start.next;
		}
	}

	public Node getHeadNode() {
		return this.head;
	}

	public Node getTailNode() {
		return this.tail;
	}

	public int getSize() {
		return this.length;
	}

	public void append(int value) {
		Node appendNode = new Node(value);
		if (length > 0) {
			tail.next = appendNode;
			tail = tail.next;
		} else {
			head = appendNode;
			tail = appendNode;
		}
		length++;

	}
	
	public void removeLast() {
		Node start = head;
		while(start != null) {
			if(start.next == tail) {
				tail= start;
				tail.next = null;
				break;
			}
			start = start.next;
		}
		length--;
	}

}
