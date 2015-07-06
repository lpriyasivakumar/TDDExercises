package com.fibonacci.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciNumbersTest {

	private int getPositionInsequence(int pos) {
		return new FibonacciNumbers().generate(pos);
	}
	@Test
	public void firstFibonaccitest() {
		assertEquals(0, getPositionInsequence(0));
	}
	
	@Test
	public void secondFibonaccitest(){
		assertEquals(1, getPositionInsequence(1));
	}
	@Test
	public void thirdFibonaccitest()  {
		assertEquals(1, getPositionInsequence(2));
	}
	@Test
	public void fourthFibonacciTest()  {
		assertEquals(2, getPositionInsequence(3));
	}
	@Test
	public void sixthFibonacciTest() {
		assertEquals(5, getPositionInsequence(5));
	}
}
