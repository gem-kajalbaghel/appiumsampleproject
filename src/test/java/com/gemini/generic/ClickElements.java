package com.gemini.generic;

import com.gemini.reporting.GemTestReporter;
import com.gemini.reporting.STATUS;
import io.cucumber.java.en.*;
import org.testng.Assert;

import java.io.IOException;

public class ClickElements {

    @Given("user clicks three")
    public void user_clicks_three() throws IOException {
        MobileAction.click(Locators.three);
        GemTestReporter.addTestStep("Click on", "No - 3", STATUS.PASS, MobileAction.takeSnapShot());
    }

    @Then("verify the number")
    public void verifyTheNumber() {
        String num = MobileAction.getElementText(Locators.number);
//        Assert.assertEquals("3", num);

        // For Fail Scenario
        num = "5";
        if(num.equals("3")){
            GemTestReporter.addTestStep("Verifying Result", "Expected = 3 <BR>Actual = " + num, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Verifying Result", "Expected = 3 <BR>Actual = " + num, STATUS.FAIL);
        }
    }
}


