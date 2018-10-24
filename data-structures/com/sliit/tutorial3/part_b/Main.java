package com.sliit.tutorial3.part_b;

public class Main {

	public static void main(String[] args) {
		Stack stackLinkList = new Stack();
		
		for (int i = 0; i < 5; i++) {
			stackLinkList.push(i);
		}
		
		while (!stackLinkList.isEmpty()) {
			System.out.println(stackLinkList.pop());
		}
//		System.out.println(stackLinkList.peek());
//		System.out.println(stackLinkList.pop());
//		System.out.println(stackLinkList.peek());
		
	}
}
