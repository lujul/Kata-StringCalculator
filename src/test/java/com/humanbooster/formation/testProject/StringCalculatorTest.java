package com.humanbooster.formation.testProject;

import org.junit.Assert;
import org.junit.Test;

public class StringCalculatorTest {

	@Test
	// Test if the method add return 0 with an empty string
	public void shouldReturnZeroWhenStringEmpty() {
		final int actual = StringCalculator.add("");
		Assert.assertEquals(0, actual);
	}

	@Test
	// Test if the method add return the number with a string containing only
	// one number
	public void shouldReturnTheSingleIntOfTheString() {
		final int actual = StringCalculator.add("1");
		Assert.assertEquals(1, actual);
	}

	@Test
	// Test if the method add return the sum of the 2 int in the string
	public void shouldReturnTheSumOfTwoIntInString() {
		final int actual = StringCalculator.add("1,2");
		Assert.assertEquals(3, actual);
	}

	@Test
	// Test if the method add return the sum of the int in the string
	public void shouldReturnTheSumOfIntInString() {
		final int actual = StringCalculator.add("1,2,3");
		Assert.assertEquals(6, actual);
	}
}
