package com.example.methods;

import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean loopCheck = true;
		
		do {
		
			System.out.print("Enter a number: ");
			double num = scanner.nextDouble();
			
			int userChoice = 0;
			
			displayMenu();
			System.out.println("Please enter an option: ");
			userChoice = scanner.nextInt();
			
			if(userChoice == 1) {
				double result = convertInchesToCentimeters(num);
				System.out.println(num + " inches is " + result + " centimeters" );
			} else if(userChoice == 2) {
				double result = convertFeetToCentimeters(num);
				System.out.println(num + " feet is " + result + " centimeters" );
			} else if(userChoice == 3) {
				double result = convertYardsToMeters(num);
				System.out.println(num + " yards is " + result + " metres" );
			} else if(userChoice == 4) {
				double result = convertMilesToKilometers(num);
				System.out.println(num + " miles is " + result + " kilometers" );
			} else if(userChoice == 5) {
				System.out.println("Exiting...");
				loopCheck = false;
			} else {
				System.out.println("Please enter a choice between 1 and 4");
			}
		} while(loopCheck);

		scanner.close();
	}
	
	static void displayMenu() {
		System.out.println("1. Convert inches to centimeters");
		System.out.println("2. Convert feet to centimeters");
		System.out.println("3. Convert yards to meters");
		System.out.println("4. Convert miles to kilometers");
		System.out.println("5. Exit");
	}
	
	static double convertInchesToCentimeters(double num1) {
		double result = num1 * 2.54; 
		
		return result;
	}
	
	static double convertFeetToCentimeters(double feet) {
		return feet * 30.48;
	}
	
	static double convertYardsToMeters(double yards) {
		return yards * 0.9144;
	}
	
	static double convertMilesToKilometers(double miles) {
		return miles * 1.60934;
	}
}
