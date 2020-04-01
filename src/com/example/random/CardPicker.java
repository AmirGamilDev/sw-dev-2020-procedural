package com.example.random;

import java.util.Random;

public class CardPicker {

	public static void main(String[] args) {
		Random randomCard = new Random();
		
		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		int valuesInt = randomCard.nextInt(values.length);
		
		System.out.println("Random card is: " + values[valuesInt] + " of " 
				+ suits[randomCard.nextInt(suits.length)]);
	}
}
