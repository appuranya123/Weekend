package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefile",
					glue = "org.stepdef",monochrome = true,snippets = SnippetType.CAMELCASE,
					dryRun =false,strict = true,tags={"@fb"},
					plugin= {"html:src\\test\\resources\\reports\\html",
							"json:src\\test\\resources\\reports\\json\\fb.json",
							"junit:src\\test\\resources\\reports\\junit\\fb.xml",
							"rerun:src\\test\\resources\\reports\\fail\\failed.txt"})

public class Runner {
					
	@AfterClass
	public static  void result() {
		JvmReport.jvmReportGeneration("src\\test\\resources\\reports\\json\\fb.json");

	}
}
