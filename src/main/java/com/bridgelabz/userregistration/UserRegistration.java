package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean validateName(String name) {
		String regex = "([A-Z][a-zA-Z]{2,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(name);
		return matcher.matches();
		
	}
	
	public boolean validateEmail(String email) {
		String regex = "([a-zA-Z][a-zA-Z0-9]*)(([+_.-][a-zA-Z0-9]+)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2})?)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	
	public boolean validatePhoneNumber(String email) {
		String regex = "[1-9]{2}[\\s][1-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}
	
	public boolean validatePassword(String email) {
		String regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*\\-+=]).{8,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
		
	}

}
