package com.example.strings;

import java.util.Scanner;

public class StringConcatenationStuff {

	public static void main(String[] args) {
		
		String name = "Amir";
		String surname = "Gamil";
		
		String fullName = name + " " + surname;
		
		System.out.println(fullName);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your favourite food");
		
		String favouriteFood = scanner.nextLine();
		
		System.out.println("Please enter your favourite drink");
		
		String favouriteDrink = scanner.nextLine();
		
		System.out.println("Favourite food:\t\t" 
				+ favouriteFood 
				+ "\nFavourite drink:\t" 
				+ favouriteDrink);
		
		scanner.close();
	}
}
