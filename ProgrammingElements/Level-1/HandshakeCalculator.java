package com.studyopedia;
import java.util.*;
public class HandshakeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter the number of students: ");
	        int numberOfStudents = input.nextInt();
	        
	        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

	        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + handshakes);
	        
	        input.close();

	}

}
