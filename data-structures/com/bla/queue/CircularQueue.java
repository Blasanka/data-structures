package com.bla.queue;

//I could create a one parent class for both circular and linear but I didn't do that because someone may confuse.
//FIFO : First In First Out
public class CircularQueue {

	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	private int queueArray[];
	
	public CircularQueue(int size) {
		maxSize = size;
		rear = -1;
		front = 0;
		nItems = 0;
		queueArray = new int[maxSize];
	}
	
	public void enQueue(int value) {
		if (isFull())
			System.out.println("Linear Queue is full");
		else {
			//newly added for circular queue
			if (rear == maxSize - 1)
				rear = -1;
			
			queueArray[++rear] = value;
			nItems++;
		}
	}
	
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Linear Queue is empty");
			return -99;
		} else {
			//new
			int temp = queueArray[front++];
			//new
			if (front == maxSize)
				front = 0;
			
			nItems--;
			//changed
			return temp;
		}
	}
	
	public int peekFront() {
		if (isEmpty()) {
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
		return nItems == maxSize;
	}
}