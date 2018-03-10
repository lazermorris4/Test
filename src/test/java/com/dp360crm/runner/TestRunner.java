package com.dp360crm.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "src/main/resources/features/lead.feature", 
glue = "com.dp360crm.steps",
plugin = {"pretty", "html:target/cucumber-reports",
	    "json:target/cucumber.json"},
tags = {})

public class TestRunner {

}