package com.example.arrays;
import java.util.Scanner;

public class DaysOfWeekArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] daysOfWeek = new String[7];
		
		System.out.println("Please enter the first day of the week");
		daysOfWeek[0] = scanner.nextLine();
		
		System.out.println("Please enter the second day of the week");
		daysOfWeek[1] = scanner.nextLine();
		
		System.out.println("Please enter the third day of the week");
		daysOfWeek[2] = scanner.nextLine();
		
		System.out.println("Please enter the fourth day of the week");
		daysOfWeek[3] = scanner.nextLine();
		
		System.out.println("Please enter the fifth day of the week");
		daysOfWeek[4] = scanner.nextLine();
		
		System.out.println("Please enter the sixth day of the week");
		daysOfWeek[5] = scanner.nextLine();
		
		System.out.println("Please enter the seventh day of the week");
		daysOfWeek[6] = scanner.nextLine();
		
		String weekdays = daysOfWeek[0] + ", "
				+ daysOfWeek[1] + ", "
				+ daysOfWeek[2] + ", "
				+ daysOfWeek[3] + ", "
				+ daysOfWeek[4];				
	
		String weekends = daysOfWeek[5] + ", "
				+ daysOfWeek[6];
		
		System.out.println("Weekdays: " + weekdays + "\nWeekends: " + weekends);

		scanner.close();
	}
}
