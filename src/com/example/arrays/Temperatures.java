package com.example.arrays;

public class Temperatures {

	public static void main(String[] args) {
		
		String[] days = { "Monday",
						"Tuesday",
						"Wednesday",
						"Thursday",
						"Friday",
						"Saturday",
						"Sunday" };
		
		int[][] temps = {
				{7, 6, 9, 5},
				{5,	5,	7,	8},
				{7,	8,	13,	11},
				{9,	10,	11,	9},
				{8,	8,	9,	8},
				{8,	9,	14,	12},
				{9,	11,	18,	15}
			};

		System.out.println("Day\t\t12 am\t6 am\t12 pm\t6 pm");
		
		double weeklyTotal = 0;
		
		int[] minTemps = { 99, 99, 99, 99, 99, 99, 99 };
		int[] maxTemps = { -100, -100, -100, -100, -100, -100, -100 };
		double[] averageTemps = new double[7];
		
		for(int i = 0; i < temps.length; i++) {
			
			System.out.print(days[i]);

			if(days[i].length() < 8) {
				System.out.print("\t");
			}
			
			double dailyTotal = 0;
			
			for(int j = 0; j < temps[i].length; j++) {
				System.out.print("\t" + temps[i][j]);
				
				weeklyTotal += temps[i][j];
				dailyTotal += temps[i][j];
				
				if(minTemps[i] > temps[i][j]) {
					minTemps[i] = temps[i][j];
				}
				
				if(maxTemps[i] < temps[i][j]) {
					maxTemps[i] = temps[i][j];
				}
			}
			
			averageTemps[i] = dailyTotal / temps[i].length;
			
			System.out.print("\n");
		}
		
		double weeklyAverage = weeklyTotal / 
				(temps.length * temps[0].length);
		
		System.out.println("\nWeekly average: " + weeklyAverage);
		
		System.out.println("\nDay\t\tMin\tMax\tAvg");
		
		for(int i = 0; i < days.length; i++) {
			System.out.print(days[i]);
			
			if(days[i].length() < 8) {
				System.out.print("\t");
			}
			
			System.out.print("\t" + minTemps[i] + 
					"\t" + maxTemps[i] + "\t" + averageTemps[i] + "\n");
		}
		
		
		// method 2 for printing min, max and avg (not using arrays)
		
		System.out.println("\n\nDay\t\tMin\tMax\tAvg");
		
		for(int i = 0; i < temps.length; i++) {
			
			System.out.print(days[i]);
			
			if(days[i].length() < 8) {
				System.out.print("\t");
			}
			
			double dailyTotal = 0;
			int min = 99;
			int max = -100;
			
			for(int j =0; j < temps[i].length; j++) {
				dailyTotal += temps[i][j];
				
				if(min > temps[i][j]) {
					min = temps[i][j];
				}
				
				if(max < temps[i][j]) {
					max = temps[i][j];
				}
			}
			
			double average = dailyTotal / temps[i].length;
			
			System.out.println("\t" + min + "\t" + max 
					+ "\t" + average);
		}
	}
}
