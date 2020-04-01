package com.example.arrays;

public class GradesTwoDimensions {

	public static void main(String[] args) {
		
		int[][] grades = { 
				{78, 87, 95},
				{23, 11, 8},
				{67, 56, 49},
				{87, 80, 77},
				{45, 58, 67}
		};
		
		for(int i = 0; i < grades.length; i++) {
			
			double studentTotal = 0;
			
			for(int j = 0; j < grades[i].length; j++) {
				studentTotal += grades[i][j];
			}
			
			double studentAverage = studentTotal / grades[i].length;
			
			System.out.println("Student #" + i + " average: " + studentAverage);
		}
		
		
		for(int i = 0; i < grades[i].length; i++) {

			double examTotal = 0;
			
			for(int j = 0; j < grades.length; j++) {
				examTotal += grades[j][i];
			}
			
			double examAverage = examTotal / grades.length;
			
			System.out.println("Exam #" + (i+1) + " average: " + examAverage);
		}
	}
}