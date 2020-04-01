package com.example.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadMenu {

	public static void main(String[] args) {
		String menuWithPrices = getMenuWithPrices();
		
		writeDataToFile(menuWithPrices);
	}
	
	private static String getMenuWithPrices() {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("menu.txt");
		} catch (FileNotFoundException e) {
			// note: leaving catch blocks virtually empty like this is generally bad practice
			e.printStackTrace();
		}
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line = null;
		
		try {
			line = bufferedReader.readLine();
		} catch (IOException e) {
			// note: leaving catch blocks virtually empty like this is generally bad practice
			e.printStackTrace();
		}
		
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		while(line != null) {
			System.out.println("Please enter the price for " + line);
			
			double price = scanner.nextDouble();
			scanner.nextLine();
			
			output += line + "\t";
			
			if(line.length() < 10) {
				output += "\t";
			}
			
			output += price + "\n";
			
			try {
				line = bufferedReader.readLine();
			} catch (IOException e) {
				// note: leaving catch blocks virtually empty like this is generally bad practice
				e.printStackTrace();
			}
		}
		
		System.out.println("\n" + output);

		scanner.close();
		
		return output;
	}
	
	private static void writeDataToFile(String output) {
		FileWriter fileWriter = null;
		
		try {
			fileWriter = new FileWriter("menuwithprices.txt");
			
			fileWriter.write(output);
			
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// note: leaving catch blocks virtually empty like this is generally bad practice
			e.printStackTrace();
		}
	}
}
