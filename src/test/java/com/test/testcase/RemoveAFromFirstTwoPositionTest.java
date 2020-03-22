package com.test.testcase;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveAFromFirstTwoPositionTest {
	/*
	 * 1.A at first position:ABCD=>BCD
	 * 2.A at second position:BACD=>BCD
	 * 3.A at first two position:AACD=>CD
	 * 4.A at different position:AABAA=>BAA
	 * 5.A not at first two positions:BBAA=>BBAA
	 */
	RemoveAFromFirstTwoChars removeAFromFirstTwoChars;
	
	@BeforeEach
	void setIni()
	{
		removeAFromFirstTwoChars=new RemoveAFromFirstTwoChars();
	}
  
	@Test
	void testRemove1A() {
		assertEquals("BCD",removeAFromFirstTwoChars.removeA("ABCD"));
	}
	@Test
	void testRemove2A() {
		assertEquals("BCD",removeAFromFirstTwoChars.removeA("BACD"));
	}
	@Test
	void testRemoveTwoA() {
		assertEquals("CD",removeAFromFirstTwoChars.removeA("AACD"));
	}
	@Test
	void testRemoveTwoAAtDiffPositions() {
		assertEquals("BAA",removeAFromFirstTwoChars.removeA("AABAA"));
	}
	@Test
	void testNoA() {
		assertEquals("BBAA",removeAFromFirstTwoChars.removeA("BBAA"));
	}
}
