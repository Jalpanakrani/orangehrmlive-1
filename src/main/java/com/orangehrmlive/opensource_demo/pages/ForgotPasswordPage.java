package com.orangehrmlive.opensource_demo.pages;

import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By clickOnForgotPassword = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By ForgotYourPasswordText = By.xpath("//a[contains(text(),'Forgot your password?')]");
    static By ForgotPasswordLink = By.xpath("//a[contains(text(),'Forgot your password?')]");
    static By geterrorMessage = By.id("spanMessage");

    public static void ForgotpasswordLink() {
        clickOnElement(ForgotPasswordLink);
    }

    public void ClickOnForgotPassword() {
        clickOnElement(ForgotYourPasswordText);
    }

    public String ForgotYourPasswordText() {
        return getTextFromElement(ForgotYourPasswordText);

    }
    public static String getErrorMessage(){

        return getTextFromElement(geterrorMessage);
    }
}