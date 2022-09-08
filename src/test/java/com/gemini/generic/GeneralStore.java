package com.gemini.generic;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.Set;

public class GeneralStore {

    @Given("Login to the app")
    public void login_to_the_app() throws IOException {
        MobileAction.setImplicitTimeOut(20);
        MobileAction.typeText(Locators.input_Name, "Test", "name");
        MobileAction.click(Locators.country_Options, "county dropdown");
        MobileAction.scrollToElement("Argentina", true);
        MobileAction.click(Locators.country_Name, "country name");
        MobileAction.click(Locators.radio_Female, "female");
        MobileAction.click(Locators.btn_LetsShop, "lets shop");
    }

    @Given("Login to the app with {string}")
    public void Login_to_the_app(String username) {
        MobileAction.typeText(Locators.input_Name, username, "name - "+username);
        MobileAction.waitSec(2);
        MobileAction.click(Locators.radio_Female, "female");
        MobileAction.click(Locators.btn_LetsShop, "lets shop");
        MobileAction.waitSec(3);
    }

    @When("Add item to the cart")
    public void Add_item_to_the_cart() throws IOException {
        MobileAction.waitSec(2);
        MobileAction.scrollToElement("Air Jordan 4 Retro", true);
        MobileAction.click(Locators.Add_to_Cart, "add to cart");
    }

    @When("Add {string} to the cart")
    public void add_To_The_Cart(String item) {
        MobileAction.waitSec(2);
        MobileAction.scrollToElement(item, true);
        int productCount = MobileDriverManager.getAppiumDriver().findElements(Locators.product_Name).size();
        for (int i = 0; i < productCount; i++) {
            if (MobileDriverManager.getAppiumDriver().findElements(Locators.product_Name).get(i).getText().equalsIgnoreCase(item)) {
                MobileDriverManager.getAppiumDriver().findElements(Locators.Add_to_Cart).get(i).click();
                break;
            }
        }
    }

    @When("click on cart button")
    public void click_on_cart_button() {
        MobileAction.waitSec(2);
        MobileAction.click(Locators.button_Cart, "cart");
    }

    @When("click on visit website to purchase")
    public void click_on_visit_website_to_purchase() {
        MobileAction.waitSec(2);
        MobileAction.click(Locators.visit_Website, "checkout");
    }

    @Then("search for {string}")
    public void search_for(String searchText) {
        Set<String> contexts = ((AndroidDriver) MobileDriverManager.getAppiumDriver()).getContextHandles();
        ((AndroidDriver) MobileDriverManager.getAppiumDriver()).context("WEBVIEW_com.androidsample.generalstore");
        MobileAction.typeText(Locators.Google_search, searchText, "search - "+searchText);
        MobileDriverManager.getAppiumDriver().findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("navigate to back")
    public void navigate_to_back() {
        MobileAction.waitSec(3);
        MobileAction.navigateBack(true);
    }

    @Then("navigate to forward")
    public void navigate_to_forward() {
        MobileAction.waitSec(3);
        MobileAction.navigateForward(true);
    }

    @Then("click on first link")
    public void click_on_first_link() {
        MobileAction.waitSec(3);
        MobileAction.click(Locators.google_First_link, "first link");
    }

    @Then("navigate to url")
    public void navigate_to_url() {
        MobileAction.waitSec(3);
        MobileAction.navigateToUrl("https://github.com/", true);
    }

    @Then("refresh the current page")
    public void refresh_the_current_page() {
        MobileAction.waitSec(2);
        MobileAction.refresh(true);
    }

    @Then("click mobile back button")
    public void click_mobile_back_button() {
        MobileAction.waitSec(3);
        MobileAction.pressBackButton(false);
        ((AndroidDriver) MobileDriverManager.getAppiumDriver()).context("NATIVE_APP");
    }


}
