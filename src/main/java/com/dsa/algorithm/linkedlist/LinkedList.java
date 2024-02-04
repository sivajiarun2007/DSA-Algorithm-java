package com.dsa.algorithm.linkedlist;

import java.util.HashSet;

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

	public void printAll() {
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

	public Node remove(int index) {
		if (length == 0 || index < 0 || index >= length) {
			return null;
		}
		Node deleteNode = null;

		if (index == 0) {
			return removeFirst();
		}
		if (index == length - 1) {
			return removeLast();
		}
		Node temp = getNode(index - 1);
		deleteNode = temp.next;
		temp.next = deleteNode.next;
		deleteNode.next = null;
		length--;

		return deleteNode;
	}

	public void reverse() {
		if (length > 1) {
			Node temp = head;
			head = tail;
			tail = temp;

			Node prev = tail;
			Node nxtNode = tail.next;

			while (nxtNode != null) {
				temp = nxtNode;
				nxtNode = nxtNode.next;
				temp.next = prev;
				prev = temp;

			}
			tail.next = null;
		}

	}

	public Node findMiddleNode() {
		if (head == null)
			return null;

		Node ptr1 = head;
		Node ptr2 = head;

		while (ptr2 != null && ptr2.next != null) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next.next;
		}

		return ptr1;

	}

	public Node findKthFromEnd(int k) {
		if (head == null) {
			return null;
		}
		System.out.println("kth value: " + k);
		if (k == 0) {
			return tail;
		}
		Node slow = head;
		Node fast = movePointerKTimes(head, k);
		System.out.println("fast value: " + fast);
		if (fast == null && k == 1) {
			return slow;
		}
		if (fast == null && k > 1) {
			return null;
		}
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = movePointerKTimes(fast, k);
		}
		return slow.next;
	}

	private Node movePointerKTimes(Node head, int k) {
		Node temp = head;
		for (int i = 0; i < k && temp != null; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void partitionList(int value) {
		if (head == null)
			return;
		System.out.println("value: " + value);
		Node min = head;
		Node max = head;
		Node prevMin = null;
		Node prevMax = null;

		while (max != null) {

			if (min.value < value) {

				// prevMin = min;
				// prevMax = max;
				min = min.next;
				max = max.next;
			} else {

				if (max.value >= value) {

					prevMax = max;
					max = max.next;

				} else {
					if (prevMin == null) {
						prevMax.next = max.next;
						max.next = min;
						head = max;
						prevMin = head;
						max = prevMax.next;

					} else {
						prevMin.next = max;
						prevMax.next = max.next;
						max.next = min;
						min = max;
						max = prevMax.next;
					}

				}
			}
		}
		System.out.println("after result");
	}

	/* 1-> 1-> 2-> ->3 -> null */
	public void removeDuplicates() {
		if (length == 0)
			return;
		Node temp = head;
		Node prev = head;
		HashSet removedup = new HashSet<>();
		removedup.add(temp.value);
		temp = temp.next;
		while (temp != null) {
			boolean notDuplicate = removedup.add(temp.value);
			if (!notDuplicate) {
				prev.next = temp.next;
			} else {
				prev = prev.next;
			}
			temp = temp.next;

		}
	}

	public void reverseBetween(int m, int n) {

		if (head == null || head.next == null || n <= m || n >= length) {
			return;
		}

		Node current = head;
		Node start = head;
		Node end = head;
		Node prev = null;
		if (m == 0) {
			prev = head;
		}

		Node last = head;
		for (int i = 0; i < m - 1; i++) {
//			prev = current;
			current = current.next;
		}
		for (int i = 0; i < n; i++) {
			last = last.next;
		}
		start = current;
		end = last.next;
//		prev = current;
		current = current.next;

		while (current != last && current != null) {
			Node temp = current;
			current = current.next;
			temp.next = prev;
			prev = temp;
		}
		current.next = prev;
		if (m == 0) {
			head.next = null;
			head = current;
		} else {
			start.next = current;
		}

		System.out.println("first loop done.");

		Node trail = null;
		Node loopStart = head;
		while (loopStart != null) {
			trail = loopStart;
			loopStart = loopStart.next;
			System.out.println();
		}
		trail.next = end;

	}

}
