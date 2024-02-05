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

	public DoublyLinkedList() {
	}

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

	public Node removeLast() {
		if (length == 0)
			return null;
		Node temp = tail;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			tail = temp.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;

	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;

		}
		length++;

	}

	public Node removeFirst() {
		if (length == 0)
			return null;

		Node temp = head;
		if (length == 1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}

	public Node get(int index) {
		if (index < 0 || index > length - 1) {
			return null;
		}
		if (index == 0)
			return head;
		if (index == length - 1)
			return tail;
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int value) {
		if (index < 0 || index > length - 1) {
			return false;
		}
		Node current = get(index);
		if (current == null)
			return false;
		current.value = value;
		return true;

	}

}
