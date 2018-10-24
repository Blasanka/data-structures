package com.sliit.tutorial2.adtional_exercise;

public class PrinterLine {

	private int[] queueArr;
	private int maxSize;
	private int front;
	private int rear;
	private int nItems;
	
	public PrinterLine(int size) {
		maxSize = size;
		queueArr = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (rear == maxSize - 1) rear = -1;
			
			queueArr[++rear] = value;
			nItems++;
		}
	}
	
	public int remove() {
		if (isEmpty()) {
			System.out.println("Queue is empty!");
			return -9999;
		} else {
			if (front == maxSize) front = 0;
			
			nItems--;
			return queueArr[front++];
		}
	}
	
	public int peekFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -9999;
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
