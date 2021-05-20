package com.base;


	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;

	import net.masterthought.cucumber.Configuration;
	import net.masterthought.cucumber.ReportBuilder;

	public class JVMReport {

		public static void generateJVMReport(String jsonFile) {
			File file = new File("C:\\Users\\vels\\eclipse-workspace\\AmazonTask\\target");
			Configuration configuration = new Configuration(file, "Amazon Cart Validation");
			configuration.addClassifications("Platform", "Win-10");
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Browser Version", "90.0.4430.212");

			List<String> li = new ArrayList<String>();
			li.add(jsonFile);

			ReportBuilder builder = new ReportBuilder(li, configuration);
			builder.generateReports();

		}

	}


