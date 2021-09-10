package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Swathi");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName("swathi");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithEmptyString_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName(" ");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithNumbers_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName("swathi1");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenFirstName_WithSpecialCharecters_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName("swathi$");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Hebbar");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenLastName_WhenNull_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenEmpty_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenLastName_WhenSizeSmall_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateName("He");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateEmail("abc@gmail.com.co");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail("abc@abc@gmail.com");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenNull_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenEmail_WhenEmpty_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("91 9988776655");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPhoneNumber_WhenOnlyTenDigits_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail("9988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenSpecialCharecterIncluded_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail("91 #988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenCountryCodeMoreThanTwoDigit_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validateEmail("911 9988776655");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenNull_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePhoneNumber("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePassword("abcDmmm$m1");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPassword_WhenLessCharecter_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword("aB!1d");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword("abcd1efg");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test

	public void givenPassword_WithoutDigit_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword("abcdefgD$ijk");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WithoutSpecialCharecter_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword("abcdefDghijk");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_INVALID, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenNull_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword(null);
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenPassword_WhenEmpty_ShouldReturnFalse() throws UserValidateException {
		UserRegistration userRegistration = new UserRegistration();
		try {
			userRegistration.validatePassword("");
		} catch (UserValidateException e) {
			Assert.assertEquals(UserValidateException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}

}
