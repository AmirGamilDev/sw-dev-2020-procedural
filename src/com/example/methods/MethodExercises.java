package com.example.methods;

public class MethodExercises {

	public static void main(String[] args) {
		int x = 3;
		int y = 10;
		
		System.out.println("The max of " + x + " and " + y + " is " + max(x, y));
		
		System.out.println("The min of " + x + " and " + y + " is " + min(x, y));
		
		double avgResult = avg(1.5, 2.4, 3.5);
		System.out.println("The average is: " + avgResult);
		
		String string1 = "abcdefg";
		String string2 = "abcdef_";
		
		String theLongestString = longestString(string1, string2);
		System.out.println("Longest string is " + theLongestString);
		
		String name = "Mark";
		printInfo(name, 22, "19/4/1997");
		
		double invoiceAmount = calculateInvoice(20, 35, 0.23);
		System.out.println("Invoice Amount: " + invoiceAmount);
	}
	
	static int max(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	static int min(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	static double avg(double num1, double num2, double num3) {
		double sum = num1 + num2 + num3;
		
		double result = sum / 3;
		
		return result;
	}
	
	static String longestString(String s1, String s2) {
		if(s1.length() >= s2.length()) {
			return s1;
		} else {
			return s2;
		}
	}
	
	static void printInfo(String name, int age, String dob) {
		System.out.println("Name: " + name + "\nAge: " + age + "\nDate of Birth: " + dob);
	}
	
	static double calculateInvoice(int hours, double rate, double vat) {
		return hours * rate * (1 + vat);
	}
}
