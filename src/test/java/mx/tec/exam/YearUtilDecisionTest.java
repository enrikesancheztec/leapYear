package mx.tec.exam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class YearUtilDecisionTest {
	YearUtil util = new YearUtil();
	
	@Test
	void testABHI() {
		// Given
		boolean expectedResult = true;
		
		// When
		boolean actualResult = util.isLeap(2000);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testACDFGI() {
		// Given
		boolean expectedResult = true;
		
		// When
		boolean actualResult = util.isLeap(2008);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}	
	
	@Test
	void testACEGI() {
		// Given
		boolean expectedResult = false;
		
		// When
		boolean actualResult = util.isLeap(1700);
		
		// Then
		assertEquals(expectedResult, actualResult);
	}		
	
}
