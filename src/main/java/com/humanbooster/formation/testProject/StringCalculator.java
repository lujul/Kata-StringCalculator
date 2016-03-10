package com.humanbooster.formation.testProject;

public class StringCalculator {

	/**
	 * 
	 * @param string,
	 *            string containing integers to be summed
	 * @return
	 */
	public static int add(String string) {
		// return 0 if the string is empty
		if (string.isEmpty()) {
			return 0;
		} else {
			// sum the int values in the string
			int sum = 0;
			String[] valuesInString = string.split(",");
			for (String value : valuesInString) {
				sum += Integer.parseInt(value);
			}
			return sum;
		}
	}
}
