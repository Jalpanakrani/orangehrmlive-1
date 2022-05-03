package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By emailField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By WelcomeText = By.xpath("//a[@id='welcome']");


    public String getWelcomeText(){
        return getTextFromElement(WelcomeText);

    }
        public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }


}
