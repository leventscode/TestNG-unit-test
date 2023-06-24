package calculatorapp;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class CalculatorTest {

	@Test(priority = 1)
	void testAdd() {
		double expected = 5.0;
		double result = Calculator.add(3, 2);
		assertEquals(expected, result);
	}

	@Test(priority = 2)
	void testSubtract() {
		double expected = -1.0;
		double result = Calculator.subtract(2, 3);
		assertEquals(expected, result);
	}

	@Test(priority = 3)
	void testMultiply() {
		double expected = 6.0;
		double result = Calculator.multiply(3, 2);
		assertEquals(expected, result);
	}

	@Test(priority = 4)
	void testDivide() {
		double expected = 1.5;
		double result = Calculator.divide(3, 2);
		assertEquals(expected, result);
	}

}
