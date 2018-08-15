package com.sliit.online1.part1a;

public class Student {
	
	private int studentId;
	private double avg;
	private Student next;

	public Student(int stId, double avg) {
		studentId = stId;
		this.avg = avg;
		next = null;
	}
	
	

}
