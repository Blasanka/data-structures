package com.bla.queue;

//FIFO : First In First Out
public class LinearQueue {

	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	private int queueArray[];
	
	public LinearQueue(int size) {
		maxSize = size;
		rear = -1;
		front = 0;
		nItems = 0;
		//maxSize also can be used
		queueArray = new int[size];
	}
	
	public void insert(int value) {
		if (isFull()) // We don't need to add condition here because we already have it isFull() method
			System.out.println("Linear Queue is full");
		else {
			queueArray[++rear] = value;
			nItems++;
		}
	}
	
	public int remove() {
		if (isEmpty()) {  // We don't need to add condition here because we already have it isEmpty() method
			System.out.println("Linear Queue is empty");
			return -99;
		} else {
			nItems--;
			return queueArray[front++];
		}
	}
	
	public int peekFront() {
		if (isEmpty()) {  // We don't need to add condition here because we already have it isEmpty() method
			System.out.println("Linear Queue is empty");
			return -99;
		} else {
			System.out.println(queueArray[front]);
			return queueArray[front];
		}
	}
	
	public int queueSize() {
		return nItems;
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return rear == maxSize - 1;
	}
}
