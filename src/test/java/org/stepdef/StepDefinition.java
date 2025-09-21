package org.stepdef;

import org.facebook.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.util.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends HelperClass {

	@Given("To user launch edge browser")
	public void to_user_launch_edge_browser() {
		edgeBrowser();
	}

	@When("To user enter valid url")
	public void to_user_enter_valid_url() {
		passUrl("https://www.facebook.com/");
	}

	@Then("To user click login button")
	public void toUserClickLoginButton() {
		LoginPage l = new LoginPage();
		elementClick(driver.findElement(By.name("login")));
	}

	
	@When("To user enter  invalid username and invalid password")
	public void toUserEnterInvalidUsernameAndInvalidPassword() {
		LoginPage l = new LoginPage();
		PassValue(l.getUsername(), "ravi");
		Assert.assertTrue("To false",false);
		PassValue(l.getPassword(), "123");
	}

	@When("To user enter  valid username and valid password")
	public void toUserEnterValidUsernameAndValidPassword() {
		LoginPage l = new LoginPage();
		PassValue(l.getUsername(), "java");
		PassValue(l.getPassword(), "java@123");
	}


}
