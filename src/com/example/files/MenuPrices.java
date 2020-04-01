package com.example.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuPrices {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			fileReader = new FileReader("menu.txt");
			bufferedReader = new BufferedReader(fileReader);
			
			fileWriter = new FileWriter("menuwithprices.txt");
			bufferedWriter = new BufferedWriter(fileWriter);
			
			String line = bufferedReader.readLine();
			
			while(line != null) {
				System.out.println(line);
				
				System.out.println("Please enter price for " + line + "\n");
				
				Scanner scanner = new Scanner(System.in);
				
				double price = scanner.nextDouble();
				
				bufferedWriter.write(line + "\t" + price + "\n");
				
				line = bufferedReader.readLine();

				scanner.close();
			}
			
			bufferedReader.close();
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			// note: leaving catch blocks virtually empty like this is generally bad practice
			e.printStackTrace();
		}
	}
}
