package com.example.strings;

import java.util.Arrays;

public class Palindrome2 {

	public static void main(String[] args) {
		
		
	}
	
	public static boolean isPalindrome(String string) {
		// method 1
		
//		string = string.replaceAll("_", ""); 
//		string = string.replaceAll("\\W", "").toLowerCase();
//		
//		String reversed = "";
//		
//		for(int i = string.length() - 1; i >= 0; i--) {
//			reversed += string.charAt(i);
//		}
//		
//		if(string.equals(reversed)) {
//			return true;
//		} else {
//			return false;
//		}
		
		// method 2
		
//		String lowerCaseString = string.toLowerCase();
//		
//		int i = 0;
//		int j = lowerCaseString.length() - 1;
//		
//		while(i < j) {
//			char char1 = lowerCaseString.charAt(i);
//			char char2 = lowerCaseString.charAt(j);
//			
//			if(!(char1 >= 'a' && char2 <= 'z')) {
//				i++;
//			} else if(!(char2 >= 'a' && char2 <= 'z')) {
//				j--;
//			} else if(char1 == char2) {
//				i++;
//				j--;
//			} else {
//				return false;
//			}
//		}
//		
//		return true;
		
		// method 3
		
		String cleanString = string.replaceAll("\\W", "").toLowerCase();
		char[] cleanArray = cleanString.toCharArray();
		char[] backwardArray = new char[cleanArray.length];
		
		for(int i = 0; i < cleanArray.length; i++) {
			backwardArray[(backwardArray.length - 1) - i] 
					= cleanString.charAt(i);
		}
		
		if(Arrays.equals(backwardArray, cleanArray)) {
			return true;
		} else {
			return false;
		}
	}

}
