package com.tunescriber.testCases;


import org.testng.annotations.Test;

import com.tunescriber.pageObjects.HomePage;

public class TC_HomeTest_VerifyFooterLinks_002 extends BaseClass {

	@Test
	public void verifyLogoLink() {
		driver.get(baseurl);
		HomePage homePage = new HomePage(driver);
		homePage.clickLogoLink();
		
		
	}
}
