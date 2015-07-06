import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

//	@Test(expected =RuntimeException.class)
//	public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//		StringCalculator.add("1,2,3");
//	}
	
	@Test
	public final void when2NumbersAreUsedThenNoExceptionIsThrown(){
		StringCalculator.add("1,2");
		assertTrue(true);
	}
	
	@Test(expected=RuntimeException.class)
	public final void whenNonNumberIsUsedThenExceptionIsThrown(){
		StringCalculator.add("1,X");
	}
	
	@Test
	public final void whenEmptyStringIsUsedThenExceptionIsThrown(){
		assertEquals(0,StringCalculator.add(""));
	}
	
	@Test
	public final void whenOneNumberIsUsedThenReturnValueIsThatNumber(){
		assertEquals(3,StringCalculator.add("3"));
	}
	
	@Test
	public final void whenTwoNumbersAreUsedThenReturnValueIsSum(){
		assertEquals(3+6,StringCalculator.add("3,6"));
	}
	
	@Test
	public final void whenAnyNumberOfNumbersIsUsedThenReturnValueIsSum(){
		assertEquals(3+6+15+18+46+33,StringCalculator.add("3,6,15,18,46,33"));
	}
	
	@Test
	public final void whenNewLineIsUsedBetweenNumberThenReturnValueIsSum(){
		assertEquals(3+6+15,StringCalculator.add("3,6\n15"));
	}
	
	@Test
	public final void whenDelimiterThenItIsUsedToSeparateNumbers(){
		assertEquals(3+6+15,StringCalculator.add("//;n;3;6;15"));
	}
	
	@Test (expected=RuntimeException.class)
	public final void whenNegativeNumberIsUsedExceptionIsThrown(){
		StringCalculator.add("3,-6,15,18,46,33");
	}
	
	@Test
	public final void whenNegativeNumbersAreUsedThenExceptionIsThrown(){
		RuntimeException exception = null;
		try{
			StringCalculator.add("3,-6,15,-18,46,33");
		}catch(RuntimeException e){
			exception = e;
		}
		assertNotNull(exception);
		assertEquals("Negatives not allowed:[-6, -18]",exception.getMessage());
	}
	
	@Test
	public final void whenNumberIsGreaterThan1000ItIsSkipped(){
		assertEquals(3+1000+15,StringCalculator.add("3,1001,1000,15,1234"));
	}
	
}
