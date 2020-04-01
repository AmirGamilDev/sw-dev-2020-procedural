package com.example.stringformatting;
import java.util.Random;

public class PrintingNumbers {

	public static void main(String[] args) {
		double d = 12.43545;
		
		System.out.println(d);
		
		System.out.printf("\n%12f", d);
		System.out.printf("\n%15f", d);
		
		Random r = new Random();
		
		double otherD = r.nextDouble();
		
		System.out.printf("\n\n%.2f", otherD);
		
		int integer = 12345;
		
		System.out.printf("\n%12f", (float)integer);
		
		double highPrecisionNumber = 12.37567890;
		
		System.out.printf("\n%.3f", highPrecisionNumber);
		
		int number = 1234;
		
		System.out.printf("\nYay: %-10d", number);
		
		System.out.printf("\n%020d", 123);
	}
}
