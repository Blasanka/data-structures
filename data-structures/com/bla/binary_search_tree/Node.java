package com.bla.binary_search_tree;

public class Node {

	public Node leftChild;
	public Node rightChild;
	public int data;
	
	public Node(int data) {
		leftChild = null;
		rightChild = null;
		this.data = data;
	}

	public void displayNode() {
		System.out.println(data);
	}
}
