package com.example.variables;

public class BasicVariableStuff {

	static int a = 9;
	
	public static void main(String[] args) {
		int x = 5;
		
		int y;
		
		y = x + 1;
		
		int z = 3;
		
		y = x + z;
		
		z = 1 + 3;
		
		z = a + 1;
		
		int mondaysTemperature = 10;
		
		int tuesdaysTemperature = 23;
		
		int maxTemp = -100;
		
		maxTemp = mondaysTemperature;
		
		if(maxTemp < tuesdaysTemperature) {
			maxTemp = tuesdaysTemperature;
		}
	}
}
