package com.gemini.generic;

import io.cucumber.java.en.*;
import org.testng.Assert;

import java.io.IOException;

public class ClickElements {

    @Given("Application launches and user clicks seven button")
    public void application_launches_and_user_clicks_seven_button() throws IOException {

        MobileAction.click(Locators.seven);

    }

    @When("user clicks three and equal button")
    public void user_clicks_three_and_equal_button() throws IOException {

       MobileAction.waitSec(3);
        MobileAction.click(Locators.addition);
        MobileAction.click(Locators.three);
     //   MobileAction.waitSec(3000);
        MobileAction.click(Locators.equal);


    }

    @Then("user should get sum as ten")
    public void user_should_get_sum_as_ten() throws IOException {

//        sum = Locators.calculatedsum.
//        Assert.assertEquals("10.0", Locators.calculatedsum);

        MobileAction.click(Locators.equal);
    }

}


