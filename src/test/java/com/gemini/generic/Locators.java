package com.gemini.generic;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class Locators {

    public static By seven = By.id("com.bak.mnr.calculatrice:id/btn7");
    public static By addition =By.id("com.bak.mnr.calculatrice:id/btnP");
    public static By three = By.id("com.bak.mnr.calculatrice:id/btn3");
    public static By equal = By.id("com.bak.mnr.calculatrice:id/btnE");
    public static By calculatedsum = By.id("com.bak.mnr.calculatrice:id/Cadre");
    public static By number = By.id("com.bak.mnr.calculatrice:id/Cadre");


    // general-store
    public static By input_Name = AppiumBy.id("com.androidsample.generalstore:id/nameField");
    public static By radio_Female = AppiumBy.id("com.androidsample.generalstore:id/radioFemale");
    public static By radio_Male = AppiumBy.id("com.androidsample.generalstore:id/radioMale");
    public static By btn_LetsShop = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");
    public static By country_Options = AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry");
    public static By country_Name=AppiumBy.xpath("//android.widget.TextView[@text='Argentina']");
    public static By product_Name=  AppiumBy.id("com.androidsample.generalstore:id/productName");
    public static By Add_to_Cart= AppiumBy.id("com.androidsample.generalstore:id/productAddCart");
    public static By button_Cart =AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart");
    public static By terms_Button=AppiumBy.id("com.androidsample.generalstore:id/termsButton");
    public static By accept_Button= AppiumBy.id("android:id/button1");
    public static By visit_Website= AppiumBy.id("com.androidsample.generalstore:id/btnProceed");
    public static By google_First_link= By.xpath("(//*[@class=\"q8U8x MBeuO ynAwRc oewGkc LeUQr\"])[1]");
    public static By Google_search =By.name("q");

}
