package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String string = "sanket";
		checkFirstLetter(string);
		
	}
	private static void checkFirstLetter(String string) {
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+").matcher(string).matches();
		if (isMatched) {
			System.out.println("Correct Till Now");
		} else {
			System.out.println("Something went wrong");
		}
	}
}
