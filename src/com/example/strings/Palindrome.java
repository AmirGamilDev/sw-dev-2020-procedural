package com.example.strings;

public class Palindrome {

	public static boolean isPalindrome(String string) {
		string = removeSpacesAndSpecialCharactersUsingRegex(string);
		
		String reversedArgument = "";
		
		for(int i = string.length() - 1; i >= 0; i--) {
			reversedArgument += string.charAt(i);
		}
		
		return string.equalsIgnoreCase(reversedArgument);
	}
	
	private static String removeSpacesAndSpecialCharacters(String string) {
		String result = "";
		
		for(int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			
			if(c == ' ' || c == '.' || c == ',' || c == '-' || c == '–' || c == '\'') {
				continue;
			}
			
			result += c;
		}
		
		return result;
	}
	
	private static String removeSpacesAndSpecialCharactersUsingRegex(String string) {
		string = string.replaceAll("_", "");
		
		return string.replaceAll("\\W", "");  // used to be [\\s\\p{Punct}–]
	}
}
