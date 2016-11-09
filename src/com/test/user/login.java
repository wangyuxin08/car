package com.test.user;

import org.testng.annotations.Test;

public class login {
         String Url="http://localhost:8032/truckhome/";
         @Test
         public void login(){
        	 LoginPage loginpage =new LoginPage();
        	 loginpage.load(this.Url);
        	 loginpage.login.click();
        	 loginpage.userName.sendKeys("admin");
        	 loginpage.passWord.sendKeys("admin123");
        	 loginpage.loginbtn.click();
        	 loginpage.Alert();
         }
} 
