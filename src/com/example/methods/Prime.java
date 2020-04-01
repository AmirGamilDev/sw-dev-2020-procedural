package com.example.methods;

public class Prime {

	public static void main(String[] args) {
		for(int i = 1; i <= 500; i++) {
			boolean primeCheck = isPrime(i);
			
			if(primeCheck) {
				System.out.println(i);
			}
		}
	}
	
	static boolean isPrime(int num1) {
		
		if(num1 == 1) return false;
		
		for(int i = 2; i <= num1/2; i++) {
			if(num1 % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
