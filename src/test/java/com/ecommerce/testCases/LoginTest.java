package com.ecommerce.testCases;

import com.ecommerce.pageObjects.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass{
   // WebDriver driver;
    LoginPage lp;
    @Test
    public void loginTest(){
        lp=new LoginPage(BaseClass.driver);
        JavascriptExecutor js=(JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        lp.setEmail();
        logger.info("Email provided successfully");
        lp.setPassword();
        logger.info("Password provided successfully");
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        lp.loginClick();
        logger.info("Login Button Clicked Successfully");


    }
}
