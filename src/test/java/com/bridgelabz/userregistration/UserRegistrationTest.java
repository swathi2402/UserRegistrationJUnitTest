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
}
