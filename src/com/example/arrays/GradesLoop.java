package com.example.arrays;
import java.util.Scanner;

public class GradesLoop {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] grades = new int[10];
		
		double totalGrades = 0;
		
		for(int x = 0; x < grades.length; x++) {
			System.out.println("Please enter grade for student #" + (x+1));
			
			grades[x] = scanner.nextInt();
			
			totalGrades += grades[x];  // same as totalGrades = totalGrades + grades[x];
		}
		
		System.out.println("Total: " + totalGrades);
		
		System.out.println("Average: " + totalGrades / grades.length);

		scanner.close();
	}
}
