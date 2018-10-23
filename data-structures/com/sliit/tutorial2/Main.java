package com.sliit.tutorial2;

public class Main {

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(4);
		queue.insert('1');
		queue.insert('m');
		queue.insert('n');
		queue.insert('o');
		
		//to display all values
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
		}
	}

}
