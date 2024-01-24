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

	public Node removeFirst() {
		Node removeElement = null;
		if (length == 0)
			return removeElement;

		removeElement = head;
		if (head == tail) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			removeElement.next = null;
		}

		length--;
		return removeElement;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	public Node getNode(int index) {
		Node node = null;
		int start = 0;
		Node ptr = head;
		if (index >= 0 && index <= length - 1) {
			while (start <= length - 1) {
				if (start == index) {
					node = ptr;
					break;
				}
				ptr = ptr.next;
				start++;
			}
		}

		return node;
	}

	public boolean setNodeValue(int index, int value) {
		Node current = getNode(index);

		if (current != null) {
			current.value = value;
			return true;
		}
		return false;

	}

	public boolean insertNode(int index, int value) {
		Node newNode = new Node(value);

		if (index == 0) {
			Node current = getNode(index);
			if (current != null) {
				newNode.next = current;
				head = newNode;
			}

		} else {
			Node current = getNode(index - 1);
			if (current != null) {

				newNode.next = current.next;
				current.next = newNode;
				return true;
			}

		}
		return false;

	}

	public boolean insertNodeV2(int index, int value) {

		if (length == 0 || (index > length) || index < 0)
			return false;

		Node newNode = new Node(value);
		Node temp = null;

		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			temp = getNode(index - 1);
			newNode.next = temp.next;
			temp.next = newNode;

		}
		if (temp != null && temp == tail) {
			tail = temp.next;
		}
		length++;
		return true;

	}

	public boolean removeNode(int index) {
		Node current = getNode(index - 1);
		Node temp = null;
		if (current != null) {
			temp = current.next;
			current.next = current.next.next;
			temp.next = null;
			return true;
		}
		return false;

	}

}
