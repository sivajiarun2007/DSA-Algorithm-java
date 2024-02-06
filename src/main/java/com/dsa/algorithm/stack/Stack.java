package com.dsa.algorithm.stack;

public class Stack {

	private Node top;
	private int height = 0;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	Stack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height++;
	}

	public void printAll() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
	}

	public void printTop() {
		System.out.println("Last Node: " + top.value);
	}

	public int size() {
		System.out.println("height: " + height);
		return height;
	}

	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
		height++;
	}

	public Node pop() {
		if (height == 0)
			return null;
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}

}
