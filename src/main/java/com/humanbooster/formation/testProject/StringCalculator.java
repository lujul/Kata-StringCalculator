package com.humanbooster.formation.testProject;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	/**
	 * 
	 * @param string,
	 *            string containing integers to be summed
	 * @return
	 */
	public static int add(String string) {
		int sum = 0;
		// return 0 if the string is empty
		if (!string.isEmpty()) {
			// set the default separators
			String separator = ",|\n";

			// set the custom separator if given
			if (string.startsWith("//")) {
				separator = separatorSelector(string);

				// remove the separator option from the string
				string = string.substring(string.indexOf('\n') + 1);
			}

			// sum the int values in the string
			sum = sum(string, separator);
		}
		return sum;
	}

	private static int sum(String string, String separator) {
		// split the string with the separator
		String[] valuesInString = string.split(separator);

		triggerExceptionForNegatives(valuesInString);

		int sum = 0;
		for (String value : valuesInString) {
			sum += Integer.valueOf(value);
		}
		return sum;
	}

	private static void triggerExceptionForNegatives(String[] valuesInString) {
		// save the negative values of the string
		List<String> negatives = new ArrayList<String>();
		for (String value : valuesInString) {
			if (Integer.parseInt(value) < 0) {
				negatives.add(value);
			}
		}	
		// trigger an exception if there is negatives in the string
		if (negatives.size() > 0) {
			IllegalArgumentException exception = new IllegalArgumentException("Negatives not allowed: " + negatives.toString());
			exception.printStackTrace();
			throw exception;
		}
	}

	private static String separatorSelector(String string) {
		String[] valuesInString = string.split("//|\n");
		return valuesInString[1];
	}
}
