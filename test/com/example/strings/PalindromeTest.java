package com.example.strings;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void givenPalindromeClass_whenSimplePalindromePassed_trueReturns() {
		assertTrue(Palindrome.isPalindrome("Navan"));
		assertTrue(Palindrome.isPalindrome("Madam"));
		assertTrue(Palindrome.isPalindrome("Noon"));
		assertTrue(Palindrome.isPalindrome("Civic"));
		assertTrue(Palindrome.isPalindrome("Radar"));
		assertTrue(Palindrome.isPalindrome("Level"));
		assertTrue(Palindrome.isPalindrome("Rats live on no evil star"));
		assertTrue(Palindrome.isPalindrome("121"));
	}
	
	@Test
	void givenPalindromeClass_whenPalindromeWithLeadingAndTrailingWhitespacePassed_trueReturns() {
		assertTrue(Palindrome.isPalindrome("     Navan  "));
	}
	
	@Test
	void givenPalindromeClass_whenNonPalindromePassed_falseReturns() {
		assertFalse(Palindrome.isPalindrome("Navans"));
		assertFalse(Palindrome.isPalindrome("Madams"));
		assertFalse(Palindrome.isPalindrome("Noons"));
		assertFalse(Palindrome.isPalindrome("Civics"));
		assertFalse(Palindrome.isPalindrome("Radars"));
		assertFalse(Palindrome.isPalindrome("Levels"));
		assertFalse(Palindrome.isPalindrome("112"));
	}
	
	@Test
	void givenPalindromeClass_whenComplexPalindromePassed_trueReturns() {
		assertTrue(Palindrome.isPalindrome("Never odd or even"));
		assertTrue(Palindrome.isPalindrome("Mr. Owl ate my metal worm"));
		assertTrue(Palindrome.isPalindrome("A man, a plan, a canal - Panama"));
		assertTrue(Palindrome.isPalindrome("A man, a plan, a canal – Panama"));
		assertTrue(Palindrome.isPalindrome("Madam, I'm Adam"));
	}

}
