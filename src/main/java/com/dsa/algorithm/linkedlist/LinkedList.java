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
		if (getSize() > 0) {
			System.out.println("First Node: " + getHeadNode().value);
			System.out.println("last Node: " + getTailNode().value);
			System.out.println("Length: " + getSize());
		} else {
			System.out.println("Empty list");
		}
		System.out.println("");
		printAll();

	}

	private void printAll() {
		Node start = head;
		while (start != null) {
			System.out.print(" " + start.value);
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

	public Node removeLast() {
		Node start = head;
		Node removedElement = null;
		while (start != null) {
			if (start == tail) {
				head = null;
				tail = null;
				removedElement = start;
				length--;
			} else if (start.next == tail) {
				removedElement = start.next;
				tail = start;
				tail.next = null;
				length--;
				break;
			}
			start = start.next;
		}
		return removedElement;

	}
	
	public void prepend(int value) {
		Node newNode = new Node(value);
		if(length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

}
