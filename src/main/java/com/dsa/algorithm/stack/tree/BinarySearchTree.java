package com.dsa.algorithm.stack.tree;

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

}
