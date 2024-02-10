package com.dsa.algorithm.stack;

import java.util.ArrayList;

public class Stack<T> {

	private Node top;
	private int height = 0;

	private ArrayList<T> stackList = new ArrayList<>(); // while implementing with Arraylist

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	Stack() {

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

	public Node pop1() {
		if (height == 0)
			return null;
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}

	public void push(T value) {
		stackList.add(value);
	}

	public T pop() {
		if (stackList.isEmpty())
			return null;
		return stackList.remove(stackList.size() - 1);
	}

	public T peek() {
		if (stackList.isEmpty())
			return null;
		return stackList.get(stackList.size() - 1);
	}

}
