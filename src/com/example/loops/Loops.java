package com.example.loops;

public class Loops {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int[] nums = { 5, 3, 2, 1 };
		
		for(int n : nums) {
			System.out.println(n);
		}			
	}
}
