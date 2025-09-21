package org.stepdef;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.util.HelperClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  extends HelperClass{
	
	@Before(order=1)
	public void bc1() {
		System.out.println("Before-1");
	}
	
	
	@Before(order=2)
	public void bc() {
		System.out.println("Before-2");
	}
	
	
	@After(order=5)
	public void aclass1(Scenario s) {
		if (s.isFailed()) {
			
			TakesScreenshot t=(TakesScreenshot)driver;
			byte[] b = t.getScreenshotAs(OutputType.BYTES);
			s.embed(b, "image/png");
		}
		
		
	}
	
	
	
	
	@After(order=1)
	public void aclass() {
		System.out.println("After-2");
	}
	

}
