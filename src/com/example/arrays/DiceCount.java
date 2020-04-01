package com.example.arrays;

import java.util.Random;

public class DiceCount {

	public static void main(String[] args) {
		
		Random random = new Random();
		int[] count = new int[11];
		
		for(int i = 0; i < 36000000; i++) {
			int dice1 = random.nextInt(6) + 1;
			int dice2 = random.nextInt(6) + 1;
			
			int total = dice1 + dice2;
			
			count[total - 2]++;  // could also be if-else-if series or switch
		}

		int diceRollNumber = 2;
		
		for(int i = 0; i < count.length; i++) {
			System.out.println(diceRollNumber + ": " + count[i]);
			
			diceRollNumber++;
		}
	}
}
