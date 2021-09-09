package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Swathi");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("swathi");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenFirstName_WithEmptyString_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName(" ");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenFirstName_WithNumbers_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Swathi1");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenFirstName_WithSpecialCharecters_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Swathi$");
		Assert.assertFalse(isValid);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Hebbar");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenLastName_WhenSizeSmall_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("He");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateEmail("abc@gmail.com.co");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateEmail("abc@abc@gmail.com");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("91 9988776655");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenOnlyTenDigits_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("9988776655");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenSpecialCharecterIncluded_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("91 #988776655");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPhoneNumber_WhenCountryCodeMoreThanTwoDigit_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("911 9988776655");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePassword("abcD1!efg");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenLessCharecter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("aB!1d");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WithoutCapitalLetter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("abcdefghijk");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WithoutDigit_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("abcdefgD$ijk");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WithoutSpecialCharecter_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("abcdefDghijk");
		Assert.assertFalse(isValid);
	}

}
