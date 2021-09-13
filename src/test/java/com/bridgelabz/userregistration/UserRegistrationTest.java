package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("Swathi");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_VALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("swathi");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithEmptyString_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex(" ");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithNumbers_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("swathi1");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithSpecialCharecters_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("swathi$");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("Hebbar");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_VALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenSizeSmall_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName.validateRegex("He");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail.validateRegex("abc@gmail.com.co");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_VALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail.validateRegex("abc@abc@gmail.com");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenNull_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail.validateRegex(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenEmpty_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail.validateRegex("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex("91 9988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_VALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenOnlyTenDigits_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex("9988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenSpecialCharecterIncluded_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex("91 #988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenCountryCodeMoreThanTwoDigit_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex("911 9988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber.validateRegex("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("abcDmmm$m1");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_VALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenLessCharecter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("aB!1d");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("abcd1efg");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test

	public void givenPassword_WithoutDigit_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("abcdefgD$ijk");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WithoutSpecialCharecter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("abcdefDghijk");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenNull_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword.validateRegex("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

}
