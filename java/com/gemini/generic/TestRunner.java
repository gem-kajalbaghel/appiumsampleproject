package com.gemini.generic;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features/" },
		plugin = {  "html:target/cucumber.html","json:target/cucumber.json" ,"pretty"},
		monochrome = true
		)

public class TestRunner {

}