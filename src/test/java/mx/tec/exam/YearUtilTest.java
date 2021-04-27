package mx.tec.exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearUtilTest {
	YearUtil util = new YearUtil();

	@Test
	void testDivisibleBy400AreLeap() {
		// Given
		boolean expectedResult = true;
		
		// When
		boolean actualResult = util.isLeap(2000);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testDivisibleBy100ButNot400AreNotLeap() {
		// Given
		boolean expectedResult = false;
		
		// When
		boolean actualResult = util.isLeap(1700);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void testDivisibleBy4ButNot100AreLeap() {
		// Given
		boolean expectedResult = true;
		
		// When
		boolean actualResult = util.isLeap(2008);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	void testNotDivisibleBy4AreNotLeap() {
		// Given
		boolean expectedResult = false;
		
		// When
		boolean actualResult = util.isLeap(2017);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}	
}
