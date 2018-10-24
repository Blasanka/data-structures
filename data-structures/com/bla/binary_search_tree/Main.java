package com.bla.binary_search_tree;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(50);
		tree.insert(40);
		tree.insert(60);
		tree.insert(20);
		tree.insert(30);
		tree.insert(45);
		tree.insert(10);
		
//		System.out.println(tree.find(20).data + " is found!");
		System.out.println("In Order Traverse:");
		tree.inOrder(tree.find(50));
		System.out.println("\nPre Order Traverse:");
		tree.preOrder(tree.find(50));
		System.out.println("\nPost Order Traverse:");
		tree.postOrder(tree.find(50));
	}

}
