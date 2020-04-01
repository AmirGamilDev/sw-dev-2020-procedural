package com.example.methods;

public class PassArrays {

	public static void main(String[] args) {
		int[] myInts = { 1, 3, 5, 7, 9 };
		
		printArray(myInts);
	}
	
	public static void printArray(int[] arrayToPrint) {
		for(int value : arrayToPrint) {
			System.out.println(value);
		}
	}
}
