package com.example.arrays;

public class ArraysStuff {

	public static void main(String[] args) {
		
		// ways to declare arrays

		int grades[] = new int[10];
				
		int[] ages = { 34, 23, 17 };
		
		String[] daysOfWeek = new String[7];
		
		grades[0] = 78;
		System.out.println("The first grade is " + grades[0]);
		
		// 2d array
		int[][] temps = { 
					{ 9, 15, 7 },
					{ 8, 14, 5 } 
				};
		
		for(int i = 0; i < temps.length; i++) {
			for(int j = 0; j < temps[i].length; j++) {
				System.out.println(temps[i][j]);
			}
		}

		System.out.println();
		
		// printing contents of an array
		
		int temperatures[] = { 3, 5, 7, 9 };
		
		// regular for loop								
		
		for(int i = 0; i < temperatures.length; i++) {
			System.out.println("Temperature: " + temperatures[i]);
		}
		
		// enhanced for loop
		
		System.out.println();
		
		for(int temperature : temperatures) {
			System.out.println("Temperature: " + temperature);
		}
	}
}
