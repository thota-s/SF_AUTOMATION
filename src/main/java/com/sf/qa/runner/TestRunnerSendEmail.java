//Automaton Author Name: SUBHRA THOTA
//Version2.0
//Date : 10/08/2018
//You need to run this runner file to do Email-to-Case test scenarios at a time.

package com.sf.qa.runner;



import org.junit.runner.RunWith;

import cucumber.api.junit.*;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(
		features = "C:\\Automation\\YNAP_WS\\Salesforce-Project\\src\\main\\java\\com\\sf\\qa\\features\\02_SendEmail.feature",
		glue= {"com/sf/qa/stepDefinations/"},
				format= {"pretty","html:test-outputEmailtocase", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format)
		strict = true,//it will check if any step is  not defined in step defination file
		dryRun = false// to check the mapping is proper between feature file and step def file
		//tags = {"~@login"}
)
public class TestRunnerSendEmail {
			
	}

