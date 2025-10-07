package com.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;

	@BeforeMethod
	public void setUp() {
		try {
			// Clear any cached old ChromeDrivers and download the latest one
			WebDriverManager.chromedriver().clearDriverCache().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
