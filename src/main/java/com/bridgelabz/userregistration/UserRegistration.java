package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateName(String name) throws UserValidateException {
		try {
			if (name.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Message can not be empty");
			String regex = "([A-Z][a-zA-Z]{2,})";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);
			return matcher.matches();

		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Message can not be null");
		}

	}

	public boolean validateEmail(String email) throws UserValidateException {
		try {
			if (email.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Message can not be empty");

			String regex = "([a-zA-Z][a-zA-Z0-9]*)(([+_.-][a-zA-Z0-9]+)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2})?)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);
			return matcher.matches();

		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Message can not be null");
		}
	}

	public boolean validatePhoneNumber(String phoneNumber) throws UserValidateException {
		try {
			if (phoneNumber.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Message can not be empty");
			String regex = "[0-9][1-9][\\s][1-9][0-9]{9}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phoneNumber);
			return matcher.matches();
		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Message can not be null");
		}

	}

	public boolean validatePassword(String password) throws UserValidateException {
		try {
			if (password.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Message can not be empty");
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Message can not be null");
		}
	}

}
