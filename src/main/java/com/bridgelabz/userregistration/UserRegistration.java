package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface RegexFunction {
	void validateRegex(String string);
}

public class UserRegistration {

	RegexFunction validateName = (String name) -> {
		try {
			if (name.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Name can not be empty");

			String regex = "([A-Z][a-zA-Z]{2,})";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(name);

			if (!matcher.matches()) {
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID, "Name is invalid");
			} else
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_VALID, "Name is valid");

		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL, "Name can not be null");
		}

	};

	RegexFunction validateEmail = (String email) -> {
		try {
			if (email.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Email ID can not be empty");

			String regex = "([a-zA-Z][a-zA-Z0-9]*)(([+_.-][a-zA-Z0-9]+)?)(@[a-zA-Z0-9]+)([.])([a-z]{2,})(([.][a-z]{2})?)";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email);

			if (!matcher.matches()) {
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID,
						"Email ID is invalid");
			} else
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_VALID, "Email ID is valid");

		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Email ID can not be null");
		}
	};

	RegexFunction validatePhoneNumber = (String phoneNumber) -> {
		try {
			if (phoneNumber.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Phone Number can not be empty");

			String regex = "[0-9][1-9][\\s][1-9][0-9]{9}";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(phoneNumber);

			if (!matcher.matches()) {
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID,
						"Phone number is invalid");
			} else
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_VALID,
						"Phone number is valid");
		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Phone Number can not be null");
		}

	};

	RegexFunction validatePassword = (String password) -> {
		try {
			if (password.length() == 0)
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_EMPTY,
						"Password can not be empty");

			String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[^0-9a-zA-Z][0-9a-zA-Z]*$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(password);

			if (!matcher.matches()) {
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID,
						"Password is invalid");
			} else
				throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_VALID, "Password is valid");

		} catch (NullPointerException e) {
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_NULL,
					"Password can not be null");
		}
	};

}
