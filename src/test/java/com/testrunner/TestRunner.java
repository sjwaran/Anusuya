package com.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources"}, glue = {"com.stepdefinition"}, dryRun = false, monochrome = true, plugin = { "pretty",
				"json:C:\\\\Users\\\\user\\\\eclipse-workspace\\\\Cucumbers2021\\\\target\\\\Amazon\\\\Amazon.json"})

public class TestRunner {

	@AfterClass
	public static void reportGeneration() {
		JVMReport.generateJVMReport("C:\\Users\\user\\eclipse-workspace\\Cucumbers2021\\target\\Amazon\\Amazon.json");

	}
}
