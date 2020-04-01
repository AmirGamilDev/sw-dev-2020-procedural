package com.example.strings;

import java.util.Scanner;

public class StringExercise {

	public static void main(String[] args) {
		
		// q1
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		String input = scanner.nextLine();
		
		System.out.println("Given word length is " + input.length());
		
		// q2
		
		char[] myCharArray = input.toCharArray();

		for(int i = 0; i < myCharArray.length; i++) {
			System.out.println(myCharArray[i]);
		}
		
		System.out.println();
		
		for(char c : myCharArray) {
			System.out.println(c);
		}
		
		System.out.println();
		
		for(int i = 0; i < input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
		// q3
		
		String userInput;
		
		do {
			System.out.println("Please enter a string");
			userInput = scanner.nextLine();
		} while(!validateString(userInput));
		
		// q4
		
		String str = "    elephant  beast monkey farm  ";
		
		int count = countWords(str);
		System.out.println("Number of words in " + str + " is " + count);
	}
	
	public static int countWords(String str) {
		str = str.trim();
		
		String[] words = str.split("\\s+");
		
		return words.length;
	}
	
	public static boolean validateString(String userInput) {
		boolean valid = false;
		
		if(userInput.length() > 10) {
			System.out.println("String input should not exceed 10 characters");
			
			return valid;
		} else if(userInput.length() == 0) {
			System.out.println("Please enter a string that has more than one character");
			
			return valid;
		} else {
			System.out.println(userInput + " is a valid input");
			
			valid = true;
			
			return valid;
		}
	}
}
