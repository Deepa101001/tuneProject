package com.tunescriber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver){
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath ="img[class=\"header-logo\"]")
	@CacheLookup
	WebElement logo;
	AA
	@FindBy(xpath="//a[text()=\"Home\"]")
	@CacheLookup
	WebElement homeLink; 
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement productLink;
	
	@FindBy(xpath ="//a[text()=\"Songs for Sale\"]")
	@CacheLookup
	WebElement sfsLink;
	
	@FindBy(xpath ="class=\"nav-link header-links \"")
	@CacheLookup
	WebElement rewardsLink;
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement ReviewsLink;
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement teamLink;
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement blogLink;
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement faqsLink;
	
	@FindBy(id ="navbarDropdown")
	@CacheLookup
	WebElement contactLink;
	
	public void clickLogoLink() {
		homeLink.click();
		
	}
	public void clickHomeLink() {
		logo.click();
	}
	public void clickProductLink() {
		productLink.click();
	}
	public void clickSfsLink() {
		sfsLink.click();
	}
	public void clickRewardLink() {
		rewardsLink.click();
	}
	public void clickReviewsLink() {
		ReviewsLink.click();
	}
	public void clickTeamLink() {
		teamLink.click();
	}
	public void clickBlogLink() {
		blogLink.click();
	}
	public void clickFaqsLink() {
		faqsLink.click();
	}
	public void clickContactLink() {
		contactLink.click();
	}
}
