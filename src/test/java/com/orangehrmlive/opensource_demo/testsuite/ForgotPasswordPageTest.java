package com.orangehrmlive.opensource_demo.testsuite;

import com.orangehrmlive.opensource_demo.pages.ForgotPasswordPage;
import com.orangehrmlive.opensource_demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends TestBase {

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        ForgotPasswordPage.ForgotpasswordLink();
        String expectedMessage = "Forgot Your Password?"+
                "Please enter your username to identify your account to reset your password." +
                "OrangeHRM Username"+"ResetPassword";

        String actualErrorMessage = ForgotPasswordPage.getErrorMessage();
            Assert.assertEquals( actualErrorMessage,expectedMessage,"Error message not displayed");
        }
}
