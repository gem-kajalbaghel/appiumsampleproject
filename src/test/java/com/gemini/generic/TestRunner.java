package com.gemini.generic;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = { "C:\\Users\\kajal.baghel\\eclipse-workspace\\TrialMaven\\src\\test\\resources\\features" },glue= {"com.gemini.generic"},
        plugin = {  "html:target/cucumber.html","json:target/cucumber.json" ,"pretty"},
        monochrome = true
)
public class TestRunner {
}
