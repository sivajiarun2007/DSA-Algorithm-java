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

	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			return false;
		}
		if (index == 0) {
			prepend(value);
			return true;
		}
		if (index == length) {
			append(value);
			return true;
		}

		Node current = get(index - 1);
		Node newNode = new Node(value);
		newNode.next = current.next;
		current.next.prev = newNode;
		newNode.prev = current;
		current.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index > length - 1) {
			return null;
		}
		if (index == 0) {
			return removeFirst();
		}
		if (index == length - 1) {
			return removeLast();
		}

		Node current = get(index);
		current.prev.next = current.next;
		current.next.prev = current.prev;
		current.next = null;
		current.prev = null;
		length--;
		return current;
	}

	public void swapFirstLast() {
		if (length > 1) {
			int temp = head.value;
			head.value = tail.value;
			tail.value = temp;
		}

	}

	public void reverse() {

		if (head != null) {
			Node current = head;
			Node prev = null;
			Node after = current.next;

			while (current != null) {
				current.next = prev;
				current.prev = after;
				prev = current;
				current = after;

				if (after != null) {
					after = after.next;
				}
			}

			Node temp = head;
			head = tail;
			tail = temp;

		}

	}

	public boolean isPalindrome() {
		int i = 0;
		int j = length - 1;
		Node start = head;
		Node end = tail;
		boolean isPalin = true;
		if (length <= 1)
			return true;

		while (j >= i) {
			if (start.value != end.value) {
				isPalin = false;
				break;
			}
			start = start.next;
			end = end.prev;
			i++;
			j--;
		}
		return isPalin;
	}

	public void swapPairs() {
        
		if (length > 1) {
		    System.out.println("length: "+length);
			Node curr = head;
			Node prev = null;
			Node after = curr.next;

			while (curr != null && after != null) {
			    
				curr.next = after.next;
				System.out.println("Current: " + curr.value);
			    System.out.println("after: " + after.value);
				if (after.next != null)
					after.next.prev = curr;
				after.prev = prev;
				after.next = curr;
				if (prev != null)
					prev.next = after;
				curr.prev = after;
				if(curr == head)
				    head = after;
				prev = curr;
				
				curr = curr.next;
				if(curr != null)
				    after = curr.next;

			}
			System.out.println("Finihed: " + length);
		}

	}

}
