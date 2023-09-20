package com.project.dailysessions;
import java.util.*;

public class StudentResults {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter Student Name ->");
		String studentName = sc.next();
		System.out.println("Enter Student Score ->");
		int score = sc.nextInt();
		String grade  = null;
		switch(score/10)
		{
		case 10:
		//for Score is above 90;
		case 9:
			grade = "A";
			break;
		case 8: 
				grade = "B";
			break;
		case 7:
				grade = "C";
			break;
		case 6:
				grade = "D";
			break;
		case 5:
				grade = "E";
			break;
		case 4:
				grade = "E";
			break;
			
		}
		System.out.println("Student Name = "+studentName);
		System.out.println("Your grade is = "+grade);
		
	}
	
		
	

}
