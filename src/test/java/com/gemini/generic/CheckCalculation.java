package com.gemini.generic;

import com.gemini.reporting.GemTestReporter;
import com.gemini.reporting.STATUS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class CheckCalculation {

    @Given("Application launches and user clicks seven button")
    public void application_launches_and_user_clicks_seven_button() throws IOException {

        MobileAction.click(Locators.seven);
        GemTestReporter.addTestStep("Click on", "No - 7", STATUS.PASS);

    }

    @When("user clicks three and equal button")
    public void user_clicks_three_and_equal_button() throws IOException {

        MobileAction.waitSec(3);
        MobileAction.click(Locators.addition);
        GemTestReporter.addTestStep("Click on", "Addition", STATUS.PASS);

        MobileAction.click(Locators.three);
        GemTestReporter.addTestStep("Click on", "No - 3", STATUS.PASS);

        //   MobileAction.waitSec(3000);
        MobileAction.click(Locators.equal);
        GemTestReporter.addTestStep("Click on", "Equal", STATUS.PASS);


    }

    @Then("user should get sum as ten")
    public void user_should_get_sum_as_ten() throws IOException {

        String sum = MobileAction.getElementText(Locators.calculatedsum);

        try {
            Assert.assertEquals(sum, "10.0");
            GemTestReporter.addTestStep("Verifying Result", "Expected = 10.0 <BR>Actual = " + sum,
                    STATUS.PASS);
        } catch (Exception e) {
            GemTestReporter.addTestStep("Verifying Result", "Expected = 10.0 <BR>Actual = " + sum,
                    STATUS.FAIL);
        }
    }

}
