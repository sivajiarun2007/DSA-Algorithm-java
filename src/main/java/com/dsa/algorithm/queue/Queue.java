package com.dsa.algorithm.queue;

import java.util.ArrayList;

public class Queue<T> {

	private Node first;
	private Node last;
	private int length = 0;

	private ArrayList<T> stackList = new ArrayList<>(); // while implementing with Arraylist

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	Queue(int value) {
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length++;
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
		length++;
	}

	public Node dequeue() {

		if (length == 0)
			return null;
		Node temp = first;
		if (length == 1) {
			first = null;
			last = null;

		} else {
			first = first.next;
			temp.next = null;
		}
		length--;

		return temp;
	}

	

}
