package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String string = "sanket";
		checkFirstLetter(string);
		String str2 = "@bridgelabz";
		checkDomainName(str2);
	}
	private static void checkDomainName(String str2) {

		boolean isMatched = Pattern.compile("^@[a-zA-Z]+").matcher(str2).matches();
		if (isMatched) {
			System.out.println("Domain name is Perfect");
		} else {
			System.out.println("Domain name is not Perfect");
		}

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
