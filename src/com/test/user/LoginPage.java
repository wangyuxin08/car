package com.test.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	    WebDriver driver = null;
	    public LoginPage(){
	    	driver = new FirefoxDriver();
			PageFactory.initElements(driver, this);
	    }
}
