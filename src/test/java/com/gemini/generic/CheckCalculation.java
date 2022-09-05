package com.gemini.generic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.io.IOException;

public class CheckCalculation {

    @Given("user clicks three")
    public void user_clicks_three() throws IOException {

        MobileAction.click(Locators.three);

    }

}
