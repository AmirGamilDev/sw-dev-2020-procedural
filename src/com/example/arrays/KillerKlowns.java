package com.example.arrays;

public class KillerKlowns {
	
	public static void main(String[] args) {
		
		int[] reviewScores = { 1, 1, 2, 1, 3, 2, 1, 2, 1, 5 };
		
		double totalScore = 0;
		
		int count[] = new int[5];
		
		for(int reviewScore : reviewScores) {
			System.out.println(reviewScore + "/5");
			
			totalScore += reviewScore;
			
			count[reviewScore - 1]++;
		}
		
		double averageScore = totalScore / reviewScores.length;
		
		System.out.println("\nAverage score: " + averageScore);
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(i+1 + "/5: ");
			
			for(int j = 0; j < count[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
