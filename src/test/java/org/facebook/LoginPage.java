package org.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.util.HelperClass;

public class LoginPage extends HelperClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	// AND 
	@FindBys({
		@FindBy(xpath = "//input[@placeholder='Email address or phone number']"),
		@FindBy(xpath="//input[@aria-label='Email address or phone number']")
	})
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	
	
	//OR
	@CacheLookup
	@FindAll({
		@FindBy(name = "pas"),
		@FindBy(xpath = "//input[@placeholder='Password']")
	})
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	
	
	
}
