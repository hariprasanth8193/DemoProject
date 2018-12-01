package com.cucumber.runner;

import org.junit.runner.RunWith;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
     (features = "src\\test\\java\\com\\cucmber\\features\\", glue="com.cucumber.stepdefinition")

public class TestRunner2 {
	

}
