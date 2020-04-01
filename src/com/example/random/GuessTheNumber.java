package com.example.random;

import java.util.Random;
import java.util.Scanner;

/**
 * The Class GuessTheNumber.
 */
public class GuessTheNumber {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		playGame(12);
	}

	
	/**
	 * Play game.
	 *
	 * @param playerCount - The number of players to play the game (must be between 1 and 6)
	 */
	public static void playGame(int playerCount) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Please enter a number between 1 and 1000");
		
		int userInt = scanner.nextInt();
		int randomNumber = random.nextInt(1000) + 1;
		
		while(true) {
			if(userInt > randomNumber) {
				System.out.println("Your guess is higher than the number.  Guess again");
				
				userInt = scanner.nextInt();
			} else if(userInt < randomNumber) {
				System.out.println("Your guess is lower than the number.  Guess again");
				
				userInt = scanner.nextInt();
			} else {
				System.out.println("Congratulations!  You got it!");
				
				break;
			}
		}
	}
}
