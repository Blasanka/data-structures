package com.sliit.labsheetTwo;

//i) You are required to build the following QueueX class in your program.
public class QueueX {
	
	int queueArr[];
	int maxSize;
	int rear;
	int front;
	int noItems;
	
	public QueueX(int size) {
		maxSize = size;
		rear = -1;
		front = 0;
		noItems = 0;
		queueArr = new int[maxSize];
	}
	
	public void insert(int j) {
		if(isFull()) {
			System.out.println("Queue is full");
		} else {
			queueArr[++rear] = j;
			noItems++;
		}
	}
	
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -99;
		} else {
			noItems--;
			return queueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		return noItems == 0;
	}
	
	public boolean isFull() {
		return rear == maxSize -1;
	}

}
