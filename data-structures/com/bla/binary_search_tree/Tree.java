package com.bla.binary_search_tree;

public class Tree {

	private Node root;
	
	public Tree() {
		root = null;
	}

	public void insert(int key) {
		Node newNode = new Node(key);
		if (root == null) {
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while (true) {
				parent = current;
				if (key < current.data) {
					current = current.leftChild;
					
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public Node find(int key) {
		Node current = root;
		
		while (key != current.data) {
			if (key < current.data) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	public void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	
	public void preOrder(Node localRoot) {
		if (localRoot != null) {
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	
	public void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
}
