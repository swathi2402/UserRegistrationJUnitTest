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
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("swathi");
		Assert.assertFalse(isValid);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("Hebbar");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
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
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePhoneNumber("9988776655");
		Assert.assertFalse(isValid);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePassword("abcDmmm$m1");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validatePassword("abcd1efg");
		Assert.assertFalse(isValid);
	}
}
