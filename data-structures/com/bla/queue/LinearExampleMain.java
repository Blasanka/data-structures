package com.bla.queue;

public class LinearExampleMain {

	public static void main(String[] args) {

		//let's create a LinearQueue object, add any size you want
		
		//Think this example as token that is issued for you to channel a doctor
		//(one silly example to demonstrate the concept, if something need to add, let me know)

		LinearQueue tokens = new LinearQueue(6);
		
		//if your data type is not int argument have to be changed
		//only six tokens are issued

//		tokens.insert(1);
//		tokens.insert(2);
//		tokens.insert(3);
//		tokens.insert(4);
		
		//you can use a for loop according to your scenario
		for(int i = 1; i <= 4; i++) {
			tokens.insert(i);
		}
		
		//check up time, two are channeling now. And the first token should channel first
		//if you want to check values wrap these two with sysout's
		tokens.remove(); // token 1
		tokens.remove(); // token 2
		
		//you can see current token by
		tokens.peekFront(); // next token should be 3
		

		// you can add values until queue become full, like below:
		
//		int i = 0;
//		while (!tokens.isFull()) {
//			tokens.insert(++i);
//		}
		
		// you can remove until queue become empty like below:
		
//		while (!tokens.isEmpty()) {
//			tokens.remove();
//		}
		
	}

}
