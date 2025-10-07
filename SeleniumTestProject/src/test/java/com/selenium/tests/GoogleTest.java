package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.base.BaseTest;

public class GoogleTest extends BaseTest {

	@Test
	public void verifyGoogleSearch() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		Assert.assertTrue(title.contains("Google"), "Title does not contain 'Google'");
	}
}
