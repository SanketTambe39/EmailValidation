package com.bridgelabz.emailvalidation;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		String firstLetter = "sanket";
		checkFirstLetter(firstLetter);
		String domainName = "@bridgelabz";
		checkDomainName(domainName);
		String TLD = ".co";
		checkTLD(TLD);
		String optionalUserName = ".xyz";
		checkOptionalUserName(optionalUserName);
		String optionalDomainName = ".in";
		checkOptionalDomainName(optionalDomainName);
	}
	private static void checkOptionalDomainName(String optionalDomainName) {
		boolean isMatched = Pattern.compile("([.]{1}[a-zA-Z]{2})?").matcher(optionalDomainName).matches();
		if (isMatched) 
		{			
			System.out.println("Optional domain name is correct");
		}
		else
		{			
			System.out.println("Optional domain name is not correct");
		}
	}
	private static void checkOptionalUserName(String optionalUserName) {
		boolean isMatched = Pattern.compile("(^[.,+,_,-]{1}[0-9a-zA-Z]+)*").matcher(optionalUserName).matches();
		if (isMatched) 
		{			
			System.out.println("optional user name is correct");
		}
		else
		{			
			System.out.println("optional user name is not correct");
		}
	}
	private static void checkTLD(String TLD) {
		boolean isMatched = Pattern.compile(".[a-zA-Z]{2,3}").matcher(TLD).matches();
		if (isMatched) 
		{			
			System.out.println("Top level Domain name is correct");
		}
		else
		{			
			System.out.println("top level Domain name is not correct");
		}
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
