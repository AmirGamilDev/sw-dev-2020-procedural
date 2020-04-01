package com.example.math;

public class DiscriminantCalc {

	public static double calculateDiscriminantValue(double a, double b, double c) {
		double discrimanantValue = (Math.pow(b, 2) - (4 * a * c)); 									
		
		return discrimanantValue;
	}

}
