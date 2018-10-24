package com.sliit.tutorial2;

public class CircularQueue {

	private char[] queueArr;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public CircularQueue(int size) {
		maxSize = size;
		queueArr = new char[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(char value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == maxSize - 1) rear = -1;
			queueArr[++rear] = value;
			nItems++;
		}
	}
	
	public char remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return ' ';
		} else {
			char temp = queueArr[front++];
			if (front == maxSize) front = 0;
			
			nItems--;
			return temp;
		}
	}
	
	public char peekFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return ' ';
		} else {
			return queueArr[front];
		}
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}

}
