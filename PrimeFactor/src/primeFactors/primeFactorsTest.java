package primeFactors;

import static org.junit.Assert.*;
import static primeFactors.PrimeFactors.generate;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class primeFactorsTest {
	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), generate(1));
	}
	@Test
	public void testTwo() {
		assertEquals(list(2), generate(2));
	}
	@Test
	public void testThree() throws Exception {
		assertEquals(list(3), generate(3));
	}
	@Test
	public void testFour() throws Exception {
		assertEquals(list(2,2),generate(4));
		
	}
	@Test
	public void testSix() throws Exception {
		assertEquals(list(2,3), generate(6));
		
	}
	@Test
	public void testEight() throws Exception {
		assertEquals(list(2,2,2), generate(8));
	}
	@Test
	public void testNine() throws Exception {
		assertEquals(list(3,3), generate(9));
	}
	
}
