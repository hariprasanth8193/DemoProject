package com.cucumber.runner;

import org.junit.runner.RunWith;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\cucmber\\features\\", glue = "com.cucumber.stepdefinition",
		// tags= {"@Scenario1","@Scenario3"})

		// tags = { "@Scenario1,@Scenario3" })

		tags = { "@Cucumeber_demo", "~@Ignore" }, monochrome = true, dryRun = false, strict = false, plugin = { "pretty",
				"html:Reports", "json:Reports/Cucumber.json", "junit:Reports/Cucumber.xml" })

public class TestRunner {
	

}
