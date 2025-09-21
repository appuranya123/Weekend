package org.amazon;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.util.HelperClass;

public class AmazonHomePage extends HelperClass {
	
	
	public AmazonHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement textBox;
	
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchButton;


	public WebElement getTextBox() {
		return textBox;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}
	

	
	
	
}
