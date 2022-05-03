package com.orangehrmlive.opensource_demo.testsuite;


import com.orangehrmlive.opensource_demo.pages.HomePage;
import com.orangehrmlive.opensource_demo.pages.LoginPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.enterEmailId("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Welcome";
        String actualMessage = loginPage.getWelcomeText();
       Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }

}
