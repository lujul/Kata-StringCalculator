package com.humanbooster.formation.testProject;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest {

    @Before
    public void avantTest() {
        System.out.println("On va tester la classe StringCalculator");
    }
    
    @After
    public void apresTest() {
        System.out.println("On va FINI les tests !");
    }
    
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
	// Test if the method add return the sum of the two int in the string
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
	
	@Test
	// Test if the method add return the sum of the int in the string
	public void shouldReturnTheSumOfIntSeparatedByComasOrNewLineInString() {
		int actual = StringCalculator.add("1,2\n3");
		Assert.assertEquals(6, actual);
		actual = StringCalculator.add("1,2,3\n25,4\n7");
		Assert.assertEquals(42, actual);
		actual = StringCalculator.add("1,2\n5");
		Assert.assertEquals(8, actual);
	}

	@Test
	// Test if the method add return the sum of the int in the string
	public void shouldReturnTheSumOfIntSeparatedDelimiterInString() {
		int actual = StringCalculator.add("//;\n1;3");
		Assert.assertEquals(4, actual);
		actual = StringCalculator.add("//toto\n1toto3toto22");
		Assert.assertEquals(26, actual);
		actual = StringCalculator.add("//	\n1	3	7");
		Assert.assertEquals(11, actual);
	}
}
