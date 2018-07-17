package com.bla.stack;

public class Main {

	public static void main(String[] args) {
		
		//let's create a stack object, add any size you want
		
		//Think this example as your phone volume, initially it is zero
		//(foolish example, demonstration purposes only)
		
		Stack volume = new Stack(10);
		
		//if your data type is not int argument have to be changed
		//you can increase volume up to 10

//		volume.push(1);
//		volume.push(2);
//		volume.push(3);
//		volume.push(4);
		
		//you can use a for loop according to your scenario
		for(int i = 1; i <= 4; i++) {
			volume.push(i);
		}
		
		//you can decrease volume down to 0
		volume.pop();
		volume.pop();
		
		//you can see current volume by
		volume.peek();
	}

}
