package com.example.math;

public class Compound {

	public static void main(String[] args) {
		
		// see test class (ComoundTest in test folder)
	}
	
	public static double calculateCompoundInterest(double p, int r, int t) {
		double result = p * Math.pow((1 + (double)r/100), t);
		
		result = (double) Math.round(result * 100) / 100;
		
		return result;
	}
}
