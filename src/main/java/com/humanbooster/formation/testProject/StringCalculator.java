package com.humanbooster.formation.testProject;

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
				string = string.substring(string.indexOf('\n')+1);
			}
			
			// sum the int values in the string
			sum = sum(string, separator);
		}
		return sum;
	}

	private static int sum(String string, String separator) {
		// split the string with the separator
		String[] valuesInString = string.split(separator);
		
		
		int sum = 0;
		for (String nombre : valuesInString) {
			sum += Integer.valueOf(nombre);
		}
		return sum;
	}

	private static String separatorSelector(String string) {
		String[] valuesInString = string.split("//|\n");
		return valuesInString[1];
	}
}
