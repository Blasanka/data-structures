package com.sliit.tutorial2.adtional_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PrinterLine queue = new PrinterLine(5);
		
		Scanner userInputs = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter a JobID : ");
			queue.insert(userInputs.nextInt());
		}
		userInputs.close();
		
		//to display all values
		while (!queue.isEmpty()) {
			int jobId = queue.remove();
			
			if (jobId % 2 == 0) {
				System.out.println(jobId + "  (PC1)");
			} else {
				System.out.println(jobId + "  (PC2)");
			}
			
		}
	}

}
