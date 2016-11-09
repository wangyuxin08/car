package com.test.user;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	   WebDriver driver = null;
	   
	    @FindBy(linkText="µÇÂ¼")
	    public WebElement login;
	    
	    @FindBy(id="name")
	    public WebElement userName;
	    
	    @FindBy(id="password")
	    public WebElement passWord;
	    
	    @FindBy(id="loginbtn")
	    public WebElement loginbtn;
	    
	    public LoginPage(){
	    	driver = new FirefoxDriver();
			PageFactory.initElements(driver, this);
	    }
	    
	    public void load(String Url){
	    	  driver.get(Url);
	    }
	    
	    public void Alert(){
	    	Alert alert = this.driver.switchTo().alert();
	    	alert.accept();
	    }
	        
	    public WebDriver getDriver(){
	    	  return this.driver;
	    }
}
