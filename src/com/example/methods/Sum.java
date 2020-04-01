package com.example.methods;

public class Sum {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		
		int sum = add(2, 3);
		
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	static int add(int num1, int num2) {
		int result;
		
		result = num1 + num2;
		
		return result;
	}
}
