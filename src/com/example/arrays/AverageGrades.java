package com.example.arrays;

import java.util.Scanner;

public class AverageGrades {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] grades = new int[10];
		
		System.out.println("Please enter grade for student 1:");
		grades[0] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 2:");
		grades[1] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 3:");
		grades[2] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 4:");
		grades[3] = scanner.nextInt();

		System.out.println("Please enter grade for student 5:");
		grades[4] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 6:");
		grades[5] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 7:");
		grades[6] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 8:");
		grades[7] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 9:");
		grades[8] = scanner.nextInt();
		
		System.out.println("Please enter grade for student 10:");
		grades[9] = scanner.nextInt();
		
		int total = grades[0] + grades[1] + grades[2] + grades[3]
				+ grades[4] + grades[5] + grades[6] + grades[7]
				+ grades[8] + grades[9];
		
		double average = (double)total / grades.length;
		
		System.out.println("Average grade: " + average);

		scanner.close();
	}
}
