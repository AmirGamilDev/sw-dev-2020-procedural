package com.example.methods;

public class ChainedMethods {

	public static void main(String[] args) {
		
		int sum1 = add(1, 2, 3);
		
		System.out.println("sum1: " + sum1);
		
		int multiply1 = multiply(2, 4);
		
		System.out.println("Multiply1: " + multiply1);
		
		System.out.println("halve1: " + halve(9));
		
		int sum2 = add(1, 3, 5);
		int multiply2 = multiply(sum2, 3);
		double halve2 = halve(multiply2);
		
		System.out.println("Final answer: " + halve2);
		
	}
	
	static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	static int multiply(int a, int b) {
		int multiply = a * b;
		
		return multiply;
	}
	
	static double halve(int num) {
		return ((double)num) / 2;  // casting int to double to handle precision loss
	}
}
