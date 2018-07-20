package com.bla.queue;

//Different between LinearQueue and CircularQueue is, you cannot add any value to a linear queue after
//remove items but in CircularQueue you can do that(can add new item/element after remove item(s)).

public class CircularExampleMain {

	public static void main(String[] args) {

		//let's try  LinearQueue example with CircularQueue object, add any size you want

		CircularQueue tokens = new CircularQueue(4);
		
		//if your data type is not int argument have to be changed

//		tokens.insert(1);
//		tokens.insert(2);
//		tokens.insert(3);
//		tokens.insert(4);
		
		//you can use a for loop according to your scenario
		for(int i = 1; i <= 4; i++) {
			tokens.enQueue(i);
		}
		
		//if you want to check values wrap these two with sysout's
		tokens.deQueue(); // token 1 removed
		tokens.deQueue(); // token 2 removed
		tokens.deQueue(); // token 3 removed token 4 remains
		
		tokens.enQueue(12); // add new token 12

		tokens.deQueue(); // remove token 4
		tokens.deQueue(); // remove token 12
		
		//you can see current token by
		tokens.peekFront(); // now, here we don't have anything to display, queue is empty
	}

}
