package com.example.strings;

import java.util.Scanner;

public class DaysOfWeekExcercise {

	public static void main(String[] args) {
		String day1;
		String day2;
		String day3;
		String day4;
		String day5;
		String day6;
		String day7;
		
		String weekdays;
		String weekends;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter first day of the week:");
		day1 = scanner.nextLine();
		
		System.out.println("Please enter second day of the week:");
		day2 = scanner.nextLine();
		
		System.out.println("Please enter third day of the week:");
		day3 = scanner.nextLine();
		
		System.out.println("Please enter fourth day of the week:");
		day4 = scanner.nextLine();
		
		System.out.println("Please enter fifth day of the week:");
		day5 = scanner.nextLine();
		
		System.out.println("Please enter sixth day of the week:");
		day6 = scanner.nextLine();
		
		System.out.println("Please enter seventh day of the week:");
		day7 = scanner.nextLine();
		
		weekdays = day1 + ", " + day2 + ", " + day3 + ", " + day4 + ", "
				 + day5;
		
		weekends = day6 + ", " + day7;
		
		System.out.println("Weekdays: " + weekdays + "\nWeekends: " + weekends);
		
		scanner.close();
	}
}
