package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@src\\test\\resources\\reports\\fail\\failed.txt",
					glue = "org.stepdef",
					plugin= {
							"json:src\\test\\resources\\reports\\json\\fb.json",
							"rerun:src\\test\\resources\\reports\\fail\\failed.txt"})

public class TestRerunner {
	
	@AfterClass
	public static  void result() {
		JvmReport.jvmReportGeneration("src\\test\\resources\\reports\\json\\fb.json");

	}

}
