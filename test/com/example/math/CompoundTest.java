package com.example.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompoundTest {

	@Test
	void testCompoundInterest() {
		assertEquals(1000.00, Compound2.calculateCompoundInterest(1000, 0, 2));
		assertEquals(1000.00, Compound2.calculateCompoundInterest(1000, 3, 0));
		assertEquals(1030.00, Compound2.calculateCompoundInterest(1000, 3, 1));
		assertEquals(1060.90, Compound2.calculateCompoundInterest(1000, 3, 2));
	}

}
