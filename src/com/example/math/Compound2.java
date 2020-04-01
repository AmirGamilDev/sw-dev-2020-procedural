package com.example.math;

public class Compound2 {

	public static double calculateCompoundInterest(int principle, double rate, int time) {

		double result = principle * (Math.pow((1 + rate/100), time));
		
		return (double) Math.round(result * 100) / 100;
	}
}
