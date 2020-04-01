package com.example.variables;

public class ExcerciseExample {

	static int a = 3;
	static int b = 5;
	
	public static void main(String[] argos) {
		int globalAdd = a + b;
		
		System.out.println("Global add: " + globalAdd);
		
		int x = 8;
		int y = 10;
		int z = 12;
		
		int localMultiply = x * y * z;
		
		System.out.println("localMultiply: " + localMultiply);
		
		int localDivide = localMultiply / globalAdd;
		
		System.out.println("localDivide: " + localDivide);
	}
}
