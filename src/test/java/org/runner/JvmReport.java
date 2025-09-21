package org.runner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {

	public static void jvmReportGeneration(String path) {
		// File path
		File f = new File("src\\test\\resources\\reports\\jvmreport");
		// Configuration class

		Configuration c = new Configuration(f, "Facebook report");

		c.addClassifications("Window", "Windows 10");
		c.addClassifications("Selenium version", "4");

		// Json file path
		List<String> l = new LinkedList<>();
		l.add(path);

		// ReportBuilder class

		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}
}
