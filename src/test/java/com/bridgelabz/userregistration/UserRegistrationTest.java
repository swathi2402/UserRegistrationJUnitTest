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
	public void givenFirstName_WhenProper_ShouldReturnFalse() {
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
	public void givenLastName_WhenProper_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		boolean isValid = userRegistration.validateName("He");
		Assert.assertFalse(isValid);
	}
}
