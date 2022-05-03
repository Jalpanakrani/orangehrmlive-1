package com.orangehrmlive.opensource_demo.pages;



import com.orangehrmlive.opensource_demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.id("btnLogin");

    public void clickOnLoginLink(){
      clickOnElement(loginLink);
    }

}
