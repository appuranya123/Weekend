package org.stepdef;

import java.util.List;
import java.util.Map;

import org.amazon.AmazonHomePage;
import org.util.HelperClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends HelperClass {

	@When("To user enter  product name in textbox")
	public void toUserEnterProductNameInTextbox(io.cucumber.datatable.DataTable d) {
		allElementWait();

		AmazonHomePage a = new AmazonHomePage();

		List<Map<String, String>> asMaps = d.asMaps(String.class, String.class);
		Map<String, String> map = asMaps.get(0);
		String value = map.get("laptop");

		PassValue(a.getTextBox(), value);
	}

	@Then("To user click search button")
	public void toUserClickSearchButton() {
		allElementWait();
		AmazonHomePage a = new AmazonHomePage();
		elementClick(a.getSearchButton());
	}

	@When("To user enter valid amazon url")
	public void toUserEnterValidAmazonUrl() {
		passUrl("https://www.amazon.in/");
		System.out.println("Appu 1st Update");
		System.out.println("Appu 2st Update");
	}

}
