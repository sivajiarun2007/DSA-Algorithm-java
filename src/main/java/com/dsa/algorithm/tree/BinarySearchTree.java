package com.dsa.algorithm.tree;

public class BinarySearchTree {

	Node root;

	class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
		}
	}

	BinarySearchTree() {
		root = null;
	}

	BinarySearchTree(int value) {
		Node newNode = new Node(value);
		root = newNode;
	}

	public boolean insert(int value) {
		Node newNode = new Node(value);
		if (root == null) {
			root = newNode;
			return true;
		}
		Node current = root;
		while (current != null) {
			if (current.value == value)
				return false;
			if (value > current.value) {
				if (current.right == null) {
					current.right = newNode;
					return true;
				}
				current = current.right;
			} else {
				if (current.left == null) {
					current.left = newNode;
					return true;
				}
				current = current.left;
			}
		}
		return false;
	}

	public boolean contains(int value) {
		if (root == null)
			return false;

		Node current = root;
		while (current != null) {
			if (current.value == value)
				return true;
			if (value > current.value) {
				current = current.right;
			} else {
				current = current.left;
			}
		}
		return false;
	}

}
