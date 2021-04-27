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

}
