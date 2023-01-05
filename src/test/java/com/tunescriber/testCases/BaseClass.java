package com.tunescriber.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public String baseurl = "https://staging.tunescribers.com/login";
	
	@BeforeClass
	public void setup() {
		String browser = null;
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
