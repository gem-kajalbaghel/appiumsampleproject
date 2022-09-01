package com.gemini.generic;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gemini.generic.MobileAction;
import com.gemini.generic.MobileDriverManager;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;

/**
 * Unit test for simple App.
 */
public class Login 
{
	
	
//	static AndroidDriver driver;
	
	@Given("Login in the application")
	public void login_in_the_application() {
		
		MobileDriverManager.getAppiumDriver();
		
	//	MobileAction.waitSec(5000);
		
		System.out.println("Working");
	}
	
	@Given("Login second app")
	public void login_second_app() {
		
		MobileAction.waitSec(8000);
		
		System.out.println("Second app launched");

	}

		
		
	}

