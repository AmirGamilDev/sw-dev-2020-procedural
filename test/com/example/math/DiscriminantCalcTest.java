package com.example.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscriminantCalcTest {

	@Test
	void test() {
		assertEquals(-75, DiscriminantCalc.calculateDiscriminantValue(5, 5, 5));
		assertEquals(-8, DiscriminantCalc.calculateDiscriminantValue(1, 2, 3));
		assertEquals(-8, DiscriminantCalc.calculateDiscriminantValue(-1, -2, -3));
		assertEquals(16, DiscriminantCalc.calculateDiscriminantValue(-1, -2, 3));
		assertEquals(16, DiscriminantCalc.calculateDiscriminantValue(1, -2, -3));
		assertEquals(-8, DiscriminantCalc.calculateDiscriminantValue(-1, 2, -3));
		assertEquals(16, DiscriminantCalc.calculateDiscriminantValue(1, 2, -3));
	}

}
